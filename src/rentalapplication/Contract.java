
package rentalapplication;
import java.time.LocalDate;

class Contract {
    private Customer customer;
    private Building building;
    private LocalDate startDate;
    private LocalDate endDate;
    private double price;
    private PaymentMethod paymentMethod;
    
    public Contract(Customer customer, Building building, LocalDate startDate, LocalDate endDate, double price, PaymentMethod paymentMethod) {
        this.customer = customer;
        this.building = building;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.paymentMethod = paymentMethod;
    }
   @Override
    public String toString() {
        return  customer + " rented " + building +
                "  (from " + startDate + " to " + endDate + " ) " 
                +"for $" + price +
                ", Paid via " + paymentMethod;
    }
}
