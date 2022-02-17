package joon.dockertest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateUserReqDto {

    private String name;

    @Builder
    public CreateUserReqDto(String name) {
        this.name = name;
    }
}
