package AbstractPattern.Factory;

public class MainFactory {
    
    public VehicleFactory getVehicleFactory(String s){
        switch (s) {
            case "LUXURY":
                return new LuxuryFactory();
            case "ORDINARY":
                return new OrdinaryFactory();
        
            default:
                return null;
        }
    }


}
