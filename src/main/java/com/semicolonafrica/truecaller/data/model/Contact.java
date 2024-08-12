package com.semicolonafrica.truecaller.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Contact {
    private String Id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;


}
