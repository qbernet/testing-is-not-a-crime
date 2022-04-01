package com.quentinb.hexagonal.testing.aggregate;

import com.quentinb.hexagonal.testing.exception.BusinessException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *  Here we want to test a simple Java Object.
 * If you're dealing with Hexagonal Architecture, it's likely and recommended having
 * very simple java and clean objects inside your domain layer. These objects should (in theory)
 * not use any framework or external libraries, they should also validate themselves and be
 * immutable.
 */
class UserTest {

    /**
     *  Here we are testing the behaviour of our domain object.
     * Basically, you can use the Gherkin syntax inside your test (using comments)
     * to arrange your test.
     * Set up what you need in the "given" part,
     * Execute the public method you want to test in the "when" part
     * and finally add your assertions in the "then" part.
     * It is ok to have an empty "given" close.
     */
    @Test
    void givenBusinessValueUnder10_whenInstantiatingDomainObject_thenBusinessValueIsCorrect() throws BusinessException {
        // Given
        // When
        User user = new User("quentin", "bernet", 28);
        // Then
        assertEquals(28, user.getAge());
        assertEquals("quentin", user.getFirstName());
        assertEquals("bernet", user.getLastName());
    }
}