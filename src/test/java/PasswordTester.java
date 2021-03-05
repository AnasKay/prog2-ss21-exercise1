import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordTester {
    @BeforeAll
    static void init() {}

    @BeforeEach
    void setUp() {}

    PasswordCreator testPass;

    @DisplayName("test PasswordCreator Constructor")
    @Test
    public void testCreatePass() {
        testPass = new PasswordCreator("test123");
        String actual = testPass.getPassword();
        String expected = "test123";
        assertEquals(expected,actual);
    }
}
