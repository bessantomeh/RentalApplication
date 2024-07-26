package rentalapplication;

class Shop extends Building {
    private String businessType;

    public Shop(Address address, String name, double size, String businessType) {
        super(address, name, size);
        this.businessType = businessType;
    }

    public String getBusinessType() {
        return businessType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Business Type: " + businessType;
    }
}
