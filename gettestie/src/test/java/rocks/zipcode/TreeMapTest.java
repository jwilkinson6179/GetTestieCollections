package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class TreeMapTest {
    @Test
    public void personTree()
    {
        Comparator<Person> byAge = Comparator.comparing(Person::getYearOfBirth);
        Comparator<Person> byName = Comparator.comparing(Person::getName);
        TreeMap<Person, Address> addressBook = new TreeMap<>(byAge.thenComparing(byName));
        Person mom = new Person("Deb", 1953);
        Person dad = new Person("Gary", 1953);
        Person sister = new Person("Carrie", 1976);
        Person me = new Person("Carrie", 1979);
        Person marie = new Person("Marie", 1993);

        Address home = new Address("Apple Rd.", "Wilmington", "19805");
        Address sisterHome = new Address("Creek Bend", "Newark", "19717");
        Address strangerHome = new Address("Detroit St.", "Denver", "80154");

        addressBook.put(mom, home);
        addressBook.put(dad, home);
        addressBook.put(me, home);
        addressBook.put(sister, sisterHome);
        addressBook.put(marie, strangerHome);

        Person actualFirst = addressBook.firstKey();
        Person actualLast = addressBook.lastKey();

        assertEquals(mom, actualFirst);
        assertEquals(marie, actualLast);
    }
}
