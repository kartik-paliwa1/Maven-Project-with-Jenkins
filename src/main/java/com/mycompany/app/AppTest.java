// src/test/java/com/mycompany/app/AppTest.java
package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAppGreeting()
    {
        App app = new App();
        assertEquals("Hello World!", app.getGreeting());
    }
}


