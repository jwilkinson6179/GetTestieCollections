package rocks.zipcode;

import org.junit.Test;
import java.util.Comparator;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

public class PriorityQueueTest {
    @Test
    public void testHeapByAge()
    {
        String expectedFirst = "Gary";
        String expectedSecond = "Debbie";
        String expectedStillSecond = "Gary";
        Comparator<Person> byAge = Comparator.comparing(Person::getYearOfBirth);
        PriorityQueue<Person> family = new PriorityQueue<Person>(byAge);
        family.add(new Person("James", 1979));
        family.add(new Person("Zane", 2008));
        family.add(new Person("Debbie", 1953));
        family.add(new Person("Gary", 1952));
        family.add(new Person ("Carrie", 1976));

        String actualFirst = family.poll().getName();
        String actualSecond = family.peek().getName();
        String actualStillSecond = family.poll().getName();

        assertEquals(expectedFirst, actualFirst);
        assertEquals(expectedSecond, actualSecond);
        assertEquals(expectedStillSecond, expectedStillSecond);
    }
}
