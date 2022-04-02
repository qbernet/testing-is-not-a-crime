package com.quentinb.testing.rest.controller;

import com.quentinb.testing.rest.dto.UserRestObject;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/")
    public @ResponseBody
    List<UserRestObject> getUsers() {
        return Collections.singletonList(
                UserRestObject.builder()
                        .firstname("quentin")
                        .lastname("bernet")
                        .age(28)
                        .build()
        );
    }
}
