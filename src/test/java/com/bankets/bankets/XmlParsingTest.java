package com.bankets.bankets;

import com.bankets.bankets.classes.XmlParser;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class XmlParsingTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private static XmlParser xmlParser;

    @Before
    public void setUp() {
        xmlParser = new XmlParser();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testPrintGamePc() {
        xmlParser.gamePc();
        String output = outputStream.toString();
        String expectedOutput = "cpu = Intel Core i7-9700K\ngpu = NVIDIA GeForce RTX 2080 Ti\nram = 16GB DDR4\nstorage = 1TB SSD\n\r\nЭто игровой ПК для сложных 3D AAA проектов\n\r\n-----------------------------------------\r\ncpu = Intel Core i7-9700K\ngpu = NVIDIA GeForce RTX 2080 Ti\nram = 16GB DDR4\nstorage = 1TB SSD\n\r\nЭто игровой ПК для сложных 3D AAA проектов\n\r\n-----------------------------------------\r\ncpu = Intel Core i7-9700K\ngpu = NVIDIA GeForce RTX 2080 Ti\nram = 16GB DDR4\nstorage = 1TB SSD\n\r\nЭто игровой ПК для сложных 3D AAA проектов\n\r\n-----------------------------------------\r\ncpu = Intel Core i7-9700K\ngpu = NVIDIA GeForce RTX 2080 Ti\nram = 16GB DDR4\nstorage = 1TB SSD\n\r\nЭто игровой ПК для сложных 3D AAA проектов\n\r\n-----------------------------------------\r\n";

        assertEquals(expectedOutput, output);
    }

    @Test
    public void testPrintWorkPc() {
        xmlParser.workPc();
        String output = outputStream.toString();
        String expectedOutput = "cpu = AMD Ryzen 9 5950X\ngpu = NVIDIA Quadro RTX 5000\nram = 32GB DDR4\nstorage = 2TB NVMe SSD\n\r\nЭто рабочая станция/сервер для\nсложных вычислительных задач\r\n-----------------------------------------\r\ncpu = AMD Ryzen 9 5950X\ngpu = NVIDIA Quadro RTX 5000\nram = 32GB DDR4\nstorage = 2TB NVMe SSD\n\r\nЭто рабочая станция/сервер для\nсложных вычислительных задач\r\n-----------------------------------------\r\n";

        assertEquals(expectedOutput, output);
    }

    @Test
    public void testPrintBudgetPc() {
        xmlParser.budgetPc();
        String output = outputStream.toString();
        String expectedOutput = "cpu = Intel Core i5-10400F\ngpu = NVIDIA GeForce GTX 1660 Super\nram = 8GB DDR4\nstorage = 512GB SSD\n\r\nЭто бюджетный ПК для нетребовательных игр,\nпросмотра фильмов, и сёрфинга в интернете\r\n-----------------------------------------\r\ncpu = Intel Core i5-10400F\ngpu = NVIDIA GeForce GTX 1660 Super\nram = 8GB DDR4\nstorage = 512GB SSD\n\r\nЭто бюджетный ПК для нетребовательных игр,\nпросмотра фильмов, и сёрфинга в интернете\r\n-----------------------------------------\r\n";

        assertEquals(expectedOutput, output);
    }


}
