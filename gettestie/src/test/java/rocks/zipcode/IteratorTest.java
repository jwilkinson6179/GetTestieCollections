package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class IteratorTest {
    @Test
    public void iteratorMakesASentence()
    {
        ArrayList<String> words = new ArrayList<>();
        words.add("The ");
        words.add("sea ");
        words.add("was ");
        words.add("angry ");
        words.add("that ");
        words.add("day.");
        Iterator iterator = words.iterator();
        String expectedFirst = "The ";
        String expectedNext = "sea ";

        String actualFirst = (String)iterator.next();
        String actualNext = (String)iterator.next();

        assertEquals(expectedFirst, actualFirst);
        assertEquals(expectedNext, actualNext);
    }
}
