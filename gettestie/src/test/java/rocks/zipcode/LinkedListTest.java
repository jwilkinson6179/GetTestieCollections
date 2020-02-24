package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    LinkedList<Person> listOfPeople;

    @Test
    public void addToMiddle()
    {
        listOfPeople = new LinkedList<>();
        Person a = new Person("Aaron", 1988);
        Person b = new Person("Charlie", 1956);
        Person c = new Person("Becky", 1983);

        listOfPeople.add(a);
        listOfPeople.add(b);
        listOfPeople.add(1, c);

        Person expectedFirst = listOfPeople.get(0);
        Person expectedSecond = listOfPeople.get(1);
        Person expectedThird = listOfPeople.get(2);

        assertEquals(a, expectedFirst);
        assertEquals(c, expectedSecond);
        assertEquals(b, expectedThird);
    }
}
