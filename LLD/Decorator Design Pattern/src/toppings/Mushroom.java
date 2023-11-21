package toppings;

import pizzaBase.BasePizza;

public class Mushroom extends Topping{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
    
}
