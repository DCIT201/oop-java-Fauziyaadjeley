
import static jdk.jfr.FlightRecorder.isAvailable;

class Car extends Vehicle implements Rentable {

    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isAvailableForRental() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rent(Customer customer, int days) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void returnVehicle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private boolean hasGPS;

    public Car() {
        this.hasGPS = hasGPS;
    }

    public boolean hasGPS() {
        return hasGPS;
    }

    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (hasGPS ? 10 * days : 0);
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

        private int getBaseRentalRate() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        private void setAvailable(boolean b) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        private String getModel() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
    
