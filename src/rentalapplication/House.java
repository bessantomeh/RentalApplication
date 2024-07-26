package rentalapplication;

class House extends Building {
    private int numberOfRooms;

    public House(Address address, String name, double size, int numberOfRooms) {
        super(address, name, size);
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Rooms: " + numberOfRooms;
    }
}
