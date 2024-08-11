package com.semicolonafrica.truecaller.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DeleteContactRequest {
    private String phoneNumber;
    private String firstName;
    private String lastName;


}
