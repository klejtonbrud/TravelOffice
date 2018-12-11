import java.util.*;

public class TravelOffice
{
    Collection<Customer> customers = new HashSet<>();

    public int getCustomerCount()
    {
        return customers.size();
    }

    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }

    public Customer findCustomerByName(String name)
    {
        for(Iterator<Customer> i = customers.iterator(); i.hasNext();)
        {
            Customer element = i.next();
            if(element.getName() == name)
            {
                return element;
            }
        }
        return null;
    }

    public boolean removeCustomer(Customer customer)
    {
        int size = customers.size();
        customers.remove(customer);
        if(customers.size() < size)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getAllCustomers()
    {
        String result = "";

        for(Iterator<Customer> i = customers.iterator(); i.hasNext();)
        {
            Customer c = i.next();
            result += c.toString();
        }

        return result;
    }

    Map<Long, Trip> trips = new HashMap<>();

    public void addTrip(Long id, Trip trip)
    {
        trips.put(id,trip);
    }

    public boolean removeTrip(Long id)
    {
        int size = trips.size();
        trips.remove(id);
        if(trips.size()<size)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getAllTrips()
    {
        String result = "";

        for(long i=0; i<trips.size(); i++)
        {
            result += trips.get(i).toString();
        }

        return result;
    }

    @Override
    public String toString()
    {
        return "\nTravelOffice{" +
                "customers=" + getAllCustomers() +
                ", trips=" + getAllTrips() +
                '}';
    }
}
