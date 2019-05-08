package com.kasperowski.hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HelloTest {
    @Test
    public void junitWorksProperly() {
        assertTrue(true);
    }

    @Test
    public void productionSaysHello() {
        assertEquals("Hello, world!", Hello.hello());
    }
}
