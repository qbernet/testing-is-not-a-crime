package com.quentinb.hexagonal.testing.aggregate;

import com.quentinb.hexagonal.testing.exception.BusinessException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *  Here we want to test a simple Java Object.
 * If you're dealing with Hexagonal Architecture, it's likely and recommended having
 * very simple java and clean objects inside your domain layer. These objects should (in theory)
 * not use any framework or external libraries, they should also validate themselves and be
 * immutable.
 */
class UserExceptionTest {
    /**
     * Here, we want to test the failure case of our self-validated object.
     * Good example to see how we can test if any exception is raised somewhere in the code.
     */
    @Test
    void givenAgeUnder18_whenInstantiatingUser_thenBusinessExceptionIsRaised() {
        BusinessException exception = assertThrows(BusinessException.class, () -> {
            new User("quentin", "bernet", 17); // Here, User constructor throws a BusinessException
        }, "Business exception should have been thrown"); // this message will be printed if the test fails.
        assertEquals("Age cannot be under 18", exception.getMessage()); // You can also check here the message of the exception
    }
}
