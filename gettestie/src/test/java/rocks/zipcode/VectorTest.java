package rocks.zipcode;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class VectorTest {

    @Test
    public void testVectorSize()
    {
        List<Integer> startingList = new ArrayList<>();
        startingList.add(10);
        startingList.add(20);
        startingList.add(30);
        Vector<Integer> integerVector = new Vector<Integer>(3, 10);
        integerVector.addAll(startingList);
        Integer expectedSizeBefore = 3;
        Integer expectedCapacityBefore = 3;
        Integer expectedSizeAfter = 4;
        Integer expectedCapacityAfter = 13;
        Integer[] expected = { 10, 20, 30, 40 };

        Integer actualSizeBefore = integerVector.size();
        Integer actualCapacityBefore = integerVector.capacity();
        integerVector.add(40);
        Integer actualSizeAfter = integerVector.size();
        Integer actualCapacityAfter = integerVector.capacity();

        assertEquals(expectedSizeBefore, actualSizeBefore);
        assertEquals(expectedCapacityBefore, actualCapacityBefore);
        assertEquals(expectedSizeAfter, actualSizeAfter);
        assertEquals(expectedCapacityAfter, actualCapacityAfter);
        assertEquals(expected, integerVector.toArray());
    }
}
