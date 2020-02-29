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
        Address contact = new Address("2700 Apple Rd.", "Wilmington", 19805);
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

    @Test
    public void fullTheater()
    {
        HashMap<String, Person> reservation = new HashMap<>();
        String seatA = "1A";
        String seatB = "1B";
        String seatC = "1C";
        Person personA = new Person("Robert", 1983);
        Person personB = new Person("Harry", 1981);
        Person personC = new Person ("Marie", 1993);
        Person personD = new Person("James", 1979);

        reservation.putIfAbsent(seatA, personA);
        reservation.putIfAbsent(seatB, personB);
        reservation.putIfAbsent(seatC, personC);
        reservation.putIfAbsent(seatA, personD);

        assertEquals(personA, reservation.get(seatA));
        assertNotEquals(personD, reservation.get(seatA));
        assertEquals(personB, reservation.get(seatB));
        assertEquals(personC, reservation.get(seatC));
    }
}
