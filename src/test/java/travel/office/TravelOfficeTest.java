package travel.office;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TravelOfficeTest
{

    private TravelOffice niceTravelOffice;

    @Before
    public void setUp() throws Exception
    {
        niceTravelOffice = new TravelOffice();

        niceTravelOffice.addCustomer(new Customer("Adam"));
        niceTravelOffice.addCustomer(new Customer("Usun"));

        niceTravelOffice.findCustomerByName("Adam").setAddress(new Address("Sarmacka", "93-320", "Lodz"));
        niceTravelOffice.findCustomerByName("Usun").setAddress(new Address("usun", "93-320", "usun"));

        niceTravelOffice.addTrip(0L, new AbroadTrip(new Date("21.02.2018"), new Date("24.02.2018"),"Moscow", 5000, 1000));
        niceTravelOffice.addTrip(1L, new DomesticTrip(new Date("21.02.2018"), new Date("24.02.2018"),"Walbrzych", 1000, 100));

        niceTravelOffice.findCustomerByName("Adam").assignTrip(niceTravelOffice.trips.get(0L));
        niceTravelOffice.findCustomerByName("Usun").assignTrip(niceTravelOffice.trips.get(1L));
    }

    @Test
    public void getCustomerCount()
    {
        assertEquals(2, niceTravelOffice.getCustomerCount());
    }

    @Test
    public void addCustomer()
    {
        int countBefore = niceTravelOffice.getCustomerCount();
        Customer test_customer = new Customer("test_customer");
        niceTravelOffice.addCustomer(test_customer);
        assertEquals(countBefore+1, niceTravelOffice.getCustomerCount());
        assertEquals(test_customer, niceTravelOffice.findCustomerByName("test_customer"));
    }

    @Test
    public void findCustomerByName()
    {
        assertNotNull(niceTravelOffice.findCustomerByName("Adam"));
    }

    @Test
    public void removeCustomer()
    {
        assertEquals(true, niceTravelOffice.removeCustomer(niceTravelOffice.findCustomerByName("Usun")));
        assertNull(niceTravelOffice.findCustomerByName("Usun"));
    }

    @Test
    public void getAllCustomers()
    {
        String expectedString = "\n" +
                "travel.office.Customer info:\n" +
                "Name: Adam\n" +
                "travel.office.Address: Sarmacka\n" +
                "93-320, Lodz\n" +
                "Trip: \n" +
                "Trip to Moscow\n" +
                "start: 21.2.2018\n" +
                "end: 24.2.2018\n" +
                "Price: 6000.0\n" +
                "\n" +
                "\n" +
                "travel.office.Customer info:\n" +
                "Name: Usun\n" +
                "travel.office.Address: usun\n" +
                "93-320, usun\n" +
                "Trip: \n" +
                "Trip to Walbrzych\n" +
                "start: 21.2.2018\n" +
                "end: 24.2.2018\n" +
                "Price: 900.0\n" +
                "\n";
        assertEquals(expectedString, niceTravelOffice.getAllCustomers());
    }

    @Test
    public void addTrip()
    {
        Trip testTrip = new AbroadTrip(new Date("01.01.2018"), new Date("02.02.2018"),"Paris",999,999);
        niceTravelOffice.addTrip(2L, testTrip);
        assertEquals(testTrip, niceTravelOffice.trips.get(3L));
    }

    @Test
    public void removeTrip()
    {
        niceTravelOffice.removeTrip(1L);
        assertNull(niceTravelOffice.trips.get(1L));
    }

    @Test
    public void getAllTrips()
    {
        String expectedString = "\n" +
                "Trip to Moscow\n" +
                "start: 21.2.2018\n" +
                "end: 24.2.2018\n" +
                "Price: 6000.0\n" +
                "\n" +
                "Trip to Walbrzych\n" +
                "start: 21.2.2018\n" +
                "end: 24.2.2018\n" +
                "Price: 900.0\n";
        assertEquals(expectedString, niceTravelOffice.getAllTrips());
    }

    @Test
    public void toStringTest()
    {
        String expectedString = "\n" +
                "travel.office.TravelOffice{customers=\n" +
                "travel.office.Customer info:\n" +
                "Name: Adam\n" +
                "travel.office.Address: Sarmacka\n" +
                "93-320, Lodz\n" +
                "Trip: \n" +
                "Trip to Moscow\n" +
                "start: 21.2.2018\n" +
                "end: 24.2.2018\n" +
                "Price: 6000.0\n" +
                "\n" +
                "\n" +
                "travel.office.Customer info:\n" +
                "Name: Usun\n" +
                "travel.office.Address: usun\n" +
                "93-320, usun\n" +
                "Trip: \n" +
                "Trip to Walbrzych\n" +
                "start: 21.2.2018\n" +
                "end: 24.2.2018\n" +
                "Price: 900.0\n" +
                "\n" +
                ", trips=\n" +
                "Trip to Moscow\n" +
                "start: 21.2.2018\n" +
                "end: 24.2.2018\n" +
                "Price: 6000.0\n" +
                "\n" +
                "Trip to Walbrzych\n" +
                "start: 21.2.2018\n" +
                "end: 24.2.2018\n" +
                "Price: 900.0\n" +
                "}";
        assertEquals(expectedString, niceTravelOffice.toString());
    }
}