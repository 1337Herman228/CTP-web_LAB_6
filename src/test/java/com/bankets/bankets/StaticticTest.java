package com.bankets.bankets;

import com.bankets.bankets.classes.XmlParser;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class StaticticTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private static XmlParser xmlParser;

    @Before
    public void setUp() {
        xmlParser = new XmlParser();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testStatistic() {
        xmlParser.statistic();
        String output = outputStream.toString();
        String expectedOutput = "Игровых пк: 4\r\nРабочих пк: 2\r\nБюджетных пк: 2\r\n";
        assertEquals(expectedOutput, output);
    }
}
