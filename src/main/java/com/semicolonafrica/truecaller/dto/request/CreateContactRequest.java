package com.semicolonafrica.truecaller.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CreateContactRequest {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

}
