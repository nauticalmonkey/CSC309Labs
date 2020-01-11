package Lab1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {

    @Test
   public void testgreet() {
        String expectedString = "Hello, Bob";
        assertEquals(expectedString,greet("bob"));

    }
    @Test
    public void testNull(){
        String expectedString = "Hello, my friend.";
        assertEquals(expectedString,greet());
    }
    @Test
    public void testshout(){
        String expectedString = "HELLO, JERRY";
        assertEquals(expectedString,greet("JERRY"));
    }
    @Test
    public void testMultiname(){
        String[] twoNames = {"Sara", "Bobby"};
        String expectedString = "Hello Sara and Bobby.";
        assertEquals(expectedString,greet(twoNames));
    }
    @Test
    public void testMorethanTwo(){
        String[] fourNames = {"Sara", "Bobby", "Kyle", "Finn"};
        String expectedString = "Hello Sara, Bobby, Kyle and Finn.";
        assertEquals(expectedString,greet(fourNames));
    }
    @Test
    public void TestMixedShout(){

        String[] mixedNames = {"Sara", "BOBBY", "Kyle", "Finn"};
        String expectedString = "Hello Sara, Kyle and Finn. AND HELLO BOBBY!";
        assertEquals(expectedString,greet(mixedNames));
    }

}