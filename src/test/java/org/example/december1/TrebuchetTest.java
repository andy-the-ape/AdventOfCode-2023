package org.example.december1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class TrebuchetTest {

    Trebuchet trebuchet = new Trebuchet(new File("src/main/java/org/example/december1/puzzle-input.txt"));

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testThatTheFullLineIsCorrectlyReadFromFile() {
        assertEquals("gtlbhbjgkrb5sixfivefivetwosix" , trebuchet.stringArray.get(0));
        assertEquals("ninesixrgxccvrqscbskgzxh6cpvpxsqnb6" , trebuchet.stringArray.get(1));
    }

    @Test
    public void testThatTheFirstDigitIsCorrectlyRead() {
        String testString = "sdlgkhrKLoP3dfElspa42Qadsgg0aE";
        String testString2 = "E5irfGhyjJk";
        String testString3 = "jKlopnMbweeRassDvIoddkKl";
        assertEquals('3', trebuchet.findFirstDigit(testString));
        assertEquals('5', trebuchet.findFirstDigit(testString2));
        assertEquals('Ø', trebuchet.findFirstDigit(testString3));
    }

    @Test
    public void testThatTheLastDigitIsCorrectlyRead() {
        String testString1 = "sdlgkhrKLoP3dfElspa42Qadsgg0aE";
        String testString2 = "E5irfGhyjJk";
        String testString3 = "jKlopnMbweeRassDvIoddkKl";
        assertEquals('0', trebuchet.findLastDigit(testString1));
        assertEquals('5', trebuchet.findLastDigit(testString2));
        assertEquals('Ø', trebuchet.findLastDigit(testString3));
    }


}