package pt.isel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJavaGroovy {
    @Test
    public void testCallJavaFromGroovy() {
        assertEquals("From Java", MyGroovy.callJava());
    }
}
