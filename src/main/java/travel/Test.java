public class Test
{
    public static void main(String[] args)
    {
        TravelOffice niceTravelOffice = new TravelOffice();

        niceTravelOffice.addCustomer(new Customer("Adam"));
        niceTravelOffice.addCustomer(new Customer("Usun"));

        niceTravelOffice.findCustomerByName("Adam").setAddress(new Address("Sarmacka", "93-320", "Lodz"));
        niceTravelOffice.findCustomerByName("Usun").setAddress(new Address("usun", "93-320", "usun"));

        niceTravelOffice.addTrip(0L, new AbroadTrip(new Date("21.02.2018"), new Date("24.02.2018"),"Moscow", 5000, 1000));
        niceTravelOffice.addTrip(1L, new DomesticTrip(new Date("21.02.2018"), new Date("24.02.2018"),"Walbrzych", 1000, 100));

        niceTravelOffice.findCustomerByName("Adam").assignTrip(niceTravelOffice.trips.get(0L));
        niceTravelOffice.findCustomerByName("Usun").assignTrip(niceTravelOffice.trips.get(1L));

        System.out.print(niceTravelOffice.getAllCustomers());

        niceTravelOffice.removeCustomer(niceTravelOffice.findCustomerByName("Usun"));

        System.out.print(niceTravelOffice.getAllCustomers());

        System.out.print(niceTravelOffice.getAllTrips());

        niceTravelOffice.removeTrip(1L);

        System.out.print(niceTravelOffice.getAllTrips());

        System.out.print(niceTravelOffice.toString());
    }
}