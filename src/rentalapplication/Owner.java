package rentalapplication;

class Owner {
    private String name;
    private String contactInfo;

    public Owner(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    @Override
    public String toString() {
        return name + " (" + contactInfo + ")";
    }
}
