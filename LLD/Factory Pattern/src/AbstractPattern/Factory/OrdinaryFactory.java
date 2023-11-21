package AbstractPattern.Factory;

import AbstractPattern.Hyundai;
import AbstractPattern.Vehicle;

public class OrdinaryFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle() {
        return new Hyundai();
    }
    
}
