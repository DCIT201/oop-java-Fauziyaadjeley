class Motorcycle extends Vehicle implements Rentable {
public class Motorcycle {
    private boolean hasSidecar;

    public Motorcycle() {
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (hasSidecar ? 15 * days : 0);
    }

    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println(getModel() + " rented for " + days + " days.");
        } else {
            System.out.println(getModel() + " is not available for rental.");
        }
    }

    public void returnVehicle() {
        setAvailable(true);
        System.out.println(getModel() + " has been returned.");
    }
}
    
}
