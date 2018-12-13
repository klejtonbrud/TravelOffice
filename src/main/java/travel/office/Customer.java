package travel.office;

public class Customer
{
    private String name;
    private Address address;
    private Trip trip;

    Customer(String customer_name)
    {
        name = customer_name;
    }

    public String getName()
    {
        return name;
    }

    public void setAddress(Address customer_address)
    {
        address = customer_address;
    }

    public void assignTrip(Trip customer_trip)
    {
        trip = customer_trip;
    }

    @Override
    public String toString()
    {
        return "\ntravel.office.Customer info:\nName: " + name + "\ntravel.office.Address: " + address.toString() + "\nTrip: " + trip.toString() + "\n";
    }
}
