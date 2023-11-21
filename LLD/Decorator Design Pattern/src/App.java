import pizzaBase.BasePizza;
import pizzaBase.Margeritha;
import toppings.ExtraCheese;
import toppings.Mushroom;
import toppings.Topping;

public class App {
    public static void main(String[] args) throws Exception {
        BasePizza basePizza=new Margeritha();

        Topping topping1=new Mushroom(basePizza);
        Topping topping2=new ExtraCheese(topping1);

        System.out.println(topping2.cost());
    }
}