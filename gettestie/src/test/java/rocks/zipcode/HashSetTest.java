package rocks.zipcode;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class HashSetTest {

    @Test
    public void daysOfTheWeek()
    {
        // GIVEN

        HashSet<String> testSet = new HashSet<>();
        Integer expected = 7;
        Integer expectedAfterClear = 0;

        // WHEN

        testSet.add("Sunday");
        testSet.add("Monday");
        testSet.add("Tuesday");
        testSet.add("Wednesday");
        testSet.add("Thursday");
        testSet.add("Friday");
        testSet.add("Saturday");
        Integer actual = testSet.size();
        testSet.clear();
        Integer actualAfterClear = testSet.size();

        // THEN

        assertEquals(expected,actual);
        assertEquals(expectedAfterClear, actualAfterClear);
    }

    @Test
    public void dontRepeat()
    {
        // GIVEN

        HashSet<String> testSet = new HashSet<>();
        Integer expected = 4;

        // WHEN

        testSet.add("We");
        testSet.add("Do");
        testSet.add("Do");
        testSet.add("Not");
        testSet.add("Not");
        testSet.add("Not");
        testSet.add("Repeat");
        testSet.add("Repeat");
        testSet.add("Repeat");
        testSet.add("Repeat");
        Integer actual = testSet.size();

        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void containsAndRemove()
    {
        // GIVEN

        HashSet<Integer> testSet = new HashSet<>();
        Boolean expectedContainsBefore = true;
        Boolean expectedContainsAfter = false;

        // WHEN

        testSet.add(1);
        testSet.add(1);
        Boolean actualContainsBefore = testSet.contains(1);
        testSet.remove(1);
        Boolean actualContainsAfter = testSet.contains(1);

        // THEN

        assertEquals(expectedContainsBefore, actualContainsBefore);
        assertEquals(expectedContainsAfter, actualContainsAfter);
    }
}
