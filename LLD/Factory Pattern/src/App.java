import AbstractPattern.Factory.MainFactory;
import AbstractPattern.Factory.VehicleFactory;
import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;

public class App {
    public static void main(String[] args) throws Exception {

        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shapeObj=shapeFactory.getShape("RECTANGLE");
        shapeObj.draw();

        // Vehicle Factory
        MainFactory mainFactory=new MainFactory();
        VehicleFactory vehicleFactoryObj=mainFactory.getVehicleFactory("ORDINARY");
        vehicleFactoryObj.getVehicle().avg();;
    }
}
