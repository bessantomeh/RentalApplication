package rentalapplication;
import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String CustomerInfo;
    private List<Building> rentedBuildings;
    
     public Customer(String name, String CustomerInfo) {
        this.name = name;
        this.CustomerInfo = CustomerInfo;
        this.rentedBuildings = new ArrayList<>();
    }
     
    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return CustomerInfo;
    }

    public void rentBuilding(Building building) {
        rentedBuildings.add(building);
    }

    public List<Building> getRentedBuildings() {
        return rentedBuildings;
    }
    
    @Override
    public String toString() {
        return name + " (" + CustomerInfo + ")";
    }
}
