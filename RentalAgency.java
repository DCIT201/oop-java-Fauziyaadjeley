
import java.util.HashMap;
import java.util.Map;
public

// Supporting Class: RentalAgency
class RentalAgency {
    private Map<String, Vehicle> fleet;

    public RentalAgency() {
        this.fleet = new HashMap<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.put(vehicle.getVehicleId(), vehicle);
    }

    public void rentVehicle(String vehicleId, Customer customer, int days) {
        Vehicle vehicle = fleet.get(vehicleId);
        if (vehicle != null && vehicle instanceof Rentable rentable) {
            rentable.rent(customer, days);
            customer.addRental(vehicle);
        } else {
            System.out.println("Vehicle not found or not rentable.");
        }
    }

    public void returnVehicle(String vehicleId) {
        Vehicle vehicle = fleet.get(vehicleId);
        if (vehicle != null && vehicle instanceof Rentable rentable) {
            rentable.returnVehicle();
        } else {
            System.out.println("Vehicle not found or not rentable.");
        }
    }


    
}
