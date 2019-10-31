package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Danson
 */
public class JUnit5Test {

    @Test
    void firstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void failTest() {
//        int i = 1 / 0;

    }
}
