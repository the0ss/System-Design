package FactoryPattern;

public class ShapeFactory {
    public Shape getShape(String s){
        
        switch (s) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
