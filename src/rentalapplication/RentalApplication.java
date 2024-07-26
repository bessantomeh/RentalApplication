package rentalapplication;

import java.time.LocalDate;

public class RentalApplication {

    public static void main(String[] args) {
        Address apartmentAddress = new Address("123 St", "City", "12345");
        Address houseAddress = new Address("456 St", "City", "67890");
        Address shopAddress = new Address("789 St", "City", "11223");

        Building apartment = new Apartment(apartmentAddress, "5th Floor Apartment", 85.0, 5);
        Building house = new House(houseAddress, "Family House", 150.0, 4);
        Building shop = new Shop(shopAddress, "Grocery Store", 60.0, "Groceries");

        Customer customer = new Customer("Bessan", "bessan2019@example.com");
        Owner owner = new Owner("John Doe", "owner@example.com");

        customer.rentBuilding(apartment);
        customer.rentBuilding(shop);

        Contract contract1 = new Contract(customer, owner, apartment, LocalDate.now(), LocalDate.now().plusDays(30), 1200.0, new PayPal("bessan2019@example.com"));
        Contract contract2 = new Contract(customer, owner, shop, LocalDate.now(), LocalDate.now().plusDays(60), 800.0, new Visa("777777"));

        System.out.println(customer);
        System.out.println(contract1);
        System.out.println(contract2);
    }
}
