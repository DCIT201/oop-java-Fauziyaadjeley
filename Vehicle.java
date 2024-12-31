public abstract class Vehicle {

    // Abstract Class: Vehicle
        private String vehicleId;
        private String model;
        private double baseRentalRate;
        private boolean isAvailable;
    
        public Vehicle(String vehicleId, String model, double baseRentalRate) {
            this.vehicleId = vehicleId;
            this.model = model;
            this.baseRentalRate = baseRentalRate;
            this.isAvailable = true;
        }
    
    
        public String getModel() {
            return model;
        }
    
        public double getBaseRentalRate() {
            return baseRentalRate;
        }
    
        public boolean isAvailable() {
            return isAvailable;
        }
    
        public void setAvailable(boolean available) {
            isAvailable = available;
        }
    
        public abstract double calculateRentalCost(int days);
    
        public abstract boolean isAvailableForRental();

    String getVehicleId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
    
    

