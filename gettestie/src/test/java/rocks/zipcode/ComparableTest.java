package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class ComparableTest
{
    @Test
    public void compareAddresses()
    {
        // GIVEN
        Address home = new Address("Orchard Ave.", "Wilmington", 19805);
        Address vacation = new Address("Manatee Blvd.", "Pensacola", 32520);
        Address office = new Address("L. Street", "District of Colombia", 20005);
        Integer expectedHomeToVacationZips = -12715;
        Integer expectedVacationToHomeZips = 12715;
        Integer expectedCompareSame = 0;
        ArrayList<Address> testAddressArray = new ArrayList<>();
        ArrayList<Address> expectedSort = new ArrayList<>();
        testAddressArray.add(home);
        testAddressArray.add(vacation);
        testAddressArray.add(office);
        expectedSort.add(home);
        expectedSort.add(office);
        expectedSort.add(vacation);

        // WHEN

        Integer actualHomeToVacationZips = home.compareTo(vacation);
        Integer actualVacationToHomeZips = vacation.compareTo(home);
        Integer actualCompareSame = home.compareTo(home);
        Collections.sort(testAddressArray);

        // THEN

        assertEquals(expectedHomeToVacationZips, actualHomeToVacationZips);
        assertEquals(expectedVacationToHomeZips, actualVacationToHomeZips);
        assertEquals(expectedCompareSame, actualCompareSame);
        assertEquals(expectedSort, testAddressArray);
    }
}
