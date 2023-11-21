package AbstractPattern.Factory;

import AbstractPattern.Mercedes;
import AbstractPattern.Vehicle;

public class LuxuryFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle() {
        return new Mercedes();
    }
    
}
