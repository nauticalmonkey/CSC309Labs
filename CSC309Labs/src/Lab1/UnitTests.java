package Lab1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class UnitTests {

    @Test
    public void testgreet() {
        String expectedString = "Hello, Bob";
        assertEquals(expectedString,(Main.greet("Bob")));

    }
    @Test
    public void testNull(){
        String expectedString = "Hello, my friend";
        assertEquals(expectedString, Main.greet());
    }
    @Test
    public void testshout(){
        String expectedString = "HELLO, JERRY";
        assertEquals(expectedString,Main.greet("JERRY"));
    }
    @Test
    public void testMultiname(){
        String[] twoNames = {"Sara", "Bobby"};
        String expectedString = "Hello Sara and Bobby.";
        assertEquals(expectedString,Main.greet(twoNames));
    }
    @Test
    public void testMorethanTwo(){
        String[] fourNames = {"Sara", "Bobby", "Kyle", "Finn"};
        String expectedString = "Hello Sara, Bobby, Kyle and Finn.";
        assertEquals(expectedString,Main.greet(fourNames));
    }
    @Test
    public void TestMixedShout(){

        String[] mixedNames = {"Sara", "BOBBY", "Kyle", "Finn"};
        String expectedString = "Hello Sara, Kyle and Finn. AND HELLO BOBBY!";
        assertEquals(expectedString,Main.greet(mixedNames));
    }

}