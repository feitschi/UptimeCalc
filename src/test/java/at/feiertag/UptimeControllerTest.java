package at.feiertag;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UptimeControllerTest {

    @Test
    public void test_calculateUptime(){

        //Arrange
        UptimeController controller = new UptimeController();

        //Act
        String actualValue = controller.calculateUptime(99.95);

        //Assert
        Assertions.assertEquals("43178.40",actualValue);
    }
}
