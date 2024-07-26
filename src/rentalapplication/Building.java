package rentalapplication;

abstract class Building {
    private Address address;
    private String name;
    private double size;

    public Building(Address address, String name, double size) {
        this.address = address;
        this.name = name;
        this.size = size;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return name + " at " + address;
    }
}
