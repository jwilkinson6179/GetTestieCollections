package rocks.zipcode;

public class Address implements Comparable<Address>
{
    private String street;
    private String town;
    private Integer zipCode;
    private String country;

    /**
     * Construct an Address without country
     */
    public Address(String street, String town, Integer zipCode) {
        this(street, town, zipCode, "");
    }

    /**
     * Construct an Address with full details
     */
    public Address(String street, String town, Integer zipCode, String country) {
        this.street = street;
        this.town = town;
        this.zipCode = zipCode;
        this.country = country;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString() {
        return street + "\n" + town + " " + zipCode + "\n" + country + "\n";
    }

    @Override
    public int compareTo(Address secondAddress) {
        return this.zipCode - secondAddress.zipCode;
    }
}
