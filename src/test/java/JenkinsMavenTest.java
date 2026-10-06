import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JenkinsMavenTest {

    @Test
    public void verifyAddition() {

        int a = 10;
        int b = 20;

        int result = a + b;

        assertEquals(30, result);

        System.out.println("Jenkins webhook test executed successfully.");
    }
}