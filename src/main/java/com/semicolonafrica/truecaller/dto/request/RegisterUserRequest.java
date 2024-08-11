package com.semicolonafrica.truecaller.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RegisterUserRequest {
    private String userName;
    private String password;
    private String email;
}
