package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    ArrayList<Person> testArray;

    @Test
    public void setTestArray()
    {
        // GIVEN

        testArray = new ArrayList<Person>();
        Person testPersonA = new Person("James", 1979);
        Person testPersonB = new Person("Gary", 1953);
        Person testPersonC = new Person("Zane", 2011);

        // WHEN

        testArray.add(testPersonA);
        testArray.add(testPersonB);
        testArray.add(testPersonC);


        // THEN

        assertEquals(1, 2);
    }
}
