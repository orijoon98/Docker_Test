package joon.dockertest.service;

import joon.dockertest.domain.User;
import joon.dockertest.repository.UserRepository;
import joon.dockertest.util.RedisUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RedisUtil redisUtil;

    public void createUser(String name) {
        User user = User.builder()
                .name(name)
                .build();

        userRepository.save(user);
        redisUtil.setData(name, "test");
    }
}
