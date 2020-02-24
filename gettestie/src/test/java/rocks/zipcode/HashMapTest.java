package rocks.zipcode;


import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class HashMapTest {
    HashMap<Address, Person> addyBook;

    @Test
    public void containsKeyTest()
    {
        // GIVEN

        addyBook = new HashMap<>();
        Address contact = new Address("2700 Apple Rd.", "Wilmington", "19805");
        Person mom = new Person("Deb", 1953);
        Person dad = new Person("Gary", 1953);

        // WHEN

        addyBook.put(contact, mom);

        // THEN

        assertTrue(addyBook.containsKey(contact));
        assertTrue(addyBook.containsValue(mom));
        assertFalse(addyBook.containsKey(dad));
    }

    @Test
    public void getOrDefault()
    {
        // GIVEN

        HashMap<Character, Integer> testMap = new HashMap<>();
        Integer expected = -1;
        testMap.put('A', 1);
        testMap.put('B', 4);

        // WHEN

        Integer actual = testMap.getOrDefault('C', -1);

        // THEN

        assertEquals(expected, actual);
    }
}
