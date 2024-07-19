
package rentalapplication;

import java.time.LocalDate;

public class RentalApplication {

   
    public static void main(String[] args) {
         Building apartment = new Apartment("123 St", "floor Apartment", 95.0, 5);
         Building house = new House("456 St", "Family House", 280.0, 8);
         Building shop = new Shop("789 St", "Bookstore", 70.0, "Books");
         
         Customer customer = new Customer("Bessan", "bessan2019@example.com");
        customer.rentBuilding(apartment);
        customer.rentBuilding(shop);

        LocalDate startDate = LocalDate.now();
        LocalDate endDate1 = startDate.plusDays(30);
        LocalDate endDate2 = startDate.plusDays(60);

        Contract contract1 = new Contract(customer, apartment, startDate, endDate1, 1800.0, new PayPal("bessan2019@example.com"));
        Contract contract2 = new Contract(customer, shop, startDate, endDate2, 780.0, new Visa("777777"));

        System.out.println(customer);
        System.out.println(contract1);
        System.out.println(contract2);
    }
    
}
