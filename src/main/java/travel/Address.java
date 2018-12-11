public class Address
{
    private String street;
    private String zip;
    private String city;

    Address(String street_name, String zipcode, String city_name)
    {
        street = street_name;
        zip = zipcode;
        city = city_name;
    }

    @Override
    public String toString()
    {
        return street + "\n" + zip + ", " + city;
    }
}
