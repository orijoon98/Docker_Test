package joon.dockertest.controller;

import joon.dockertest.dto.CreateUserReqDto;
import joon.dockertest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public String createUser(@RequestBody CreateUserReqDto createUserReqDto) {
        userService.createUser(createUserReqDto.getName());

        return "SUCCESS";
    }
}
