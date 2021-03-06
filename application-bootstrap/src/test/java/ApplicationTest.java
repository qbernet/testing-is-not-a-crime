import com.quentinb.testing.rest.controller.UserController;
import com.testing.samples.integrationtesting.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = Application.class)
class ApplicationTest {

    @Autowired
    private UserController userController;
    @Test
    void run() {
        assertThat(userController).isNotNull();
    }
}
