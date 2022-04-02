package controller;

import com.quentinb.testing.rest.RestApplicationConfiguration;
import com.quentinb.testing.rest.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = RestApplicationConfiguration.class)
class RestApplicationConfigurationTest {

    @Autowired
    private UserController userController;
    @Test
    void run() {
        assertThat(userController).isNotNull();
    }
}
