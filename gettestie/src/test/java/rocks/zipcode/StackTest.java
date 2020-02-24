package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class StackTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void PushAndPopTest()
    {
        // GIVEN
        String expected = "world";
        Stack<String> testStack = new Stack<>();
        testStack.push("Hello");
        testStack.push("world");

        // WHEN

        String actual = testStack.pop();

        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void PushPushPopPeek()
    {
        // GIVEN

        String expectedFirst = "world";
        String expectedSecond = "Hello";
        Stack<String> testStack = new Stack<>();
        Boolean expected = false;

        // WHEN

        testStack.push("Hello");
        testStack.push("world");
        String actualFirst = testStack.pop();
        String actualSecond = testStack.peek();
        Boolean actual = testStack.isEmpty();

        // THEN

        assertEquals(expectedFirst, actualFirst);
        assertEquals(expectedSecond, actualSecond);
        assertEquals(expected, actual);
    }
}
