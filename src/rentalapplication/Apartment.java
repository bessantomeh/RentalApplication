package rentalapplication;

 class Apartment extends Building{
    private int floorNumber;
    
    public Apartment(String address, String name, double size, int floorNumber) {
        super(address, name, size);
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
    
   @Override
    public String toString() {
        return super.toString() + " , NumberOfFloor: " + floorNumber;
    }
}
