package com.quentinb.hexagonal.testing.aggregate;

import com.quentinb.hexagonal.testing.exception.BusinessException;
import lombok.Getter;

/**
 * In the best scenario, we should not use any frameworks or external libraries in the domain.
 * However, for the purpose of this example, we are going to use Lombok
 * in order to reduce boilerplate
 */
@Getter
public class User {

    private final String firstName;
    private final String lastName;
    private final int age;

    public User(String firstName, String lastName, int age) throws BusinessException {
        this.firstName = firstName;
        this.lastName = lastName;
        if (age < 18) {
            throw new BusinessException("Age cannot be under 18");
        }
        this.age = age;
    }
}
