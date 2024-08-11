package com.semicolonafrica.truecaller.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class UpdateContactRequest {
    private String firstName;
    private String lastName;
    private String phoneNumber;

}
