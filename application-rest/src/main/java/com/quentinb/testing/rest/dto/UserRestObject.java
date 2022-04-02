package com.quentinb.testing.rest.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserRestObject {
    private String firstname;
    private String lastname;
    private int age;
}
