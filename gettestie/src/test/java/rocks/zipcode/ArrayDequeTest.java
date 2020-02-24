package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.assertEquals;

public class ArrayDequeTest {
    @Test
    public void browserHistory()
    {
        ArrayDeque history = new ArrayDeque();

        history.add("CNN.com");
        history.add("DNC.gov");
        history.add("PepperridgeFarms.com");
        history.removeFirst();
        history.add("BBC.co.uk");

        assertEquals("DNC.gov", history.peekFirst());
    }
}
