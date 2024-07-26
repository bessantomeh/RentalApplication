package rentalapplication;

abstract class PaymentMethod {
    private String details;

    public PaymentMethod(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
