package com.semicolonafrica.truecaller.dto.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DeleteContactResponse {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String message;
}
