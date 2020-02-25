package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class TreeSetTest {

    @Test
    public void tteratingTreeSet()
    {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("First");
        treeSet.add("Second");
        treeSet.add("Third");
        treeSet.add("Fourth");
        Iterator<String> itr = treeSet.iterator();
        String[] expected = { "First", "Fourth", "Second", "Third" };
        String[] actual = new String[4];

        Integer i = 0;
        while (itr.hasNext()) {
            actual[i] = itr.next();
            i++;
        }

        assertEquals(expected, actual);
    }
}
