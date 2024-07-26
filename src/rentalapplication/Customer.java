package rentalapplication;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String contactInfo;
    private List<Building> rentedBuildings;

    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.rentedBuildings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void rentBuilding(Building building) {
        rentedBuildings.add(building);
    }

    public List<Building> getRentedBuildings() {
        return rentedBuildings;
    }

    @Override
    public String toString() {
        return name + " (" + contactInfo + ")";
    }
}
