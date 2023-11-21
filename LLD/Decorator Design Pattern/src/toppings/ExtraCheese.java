package toppings;

import pizzaBase.BasePizza;

public class ExtraCheese extends Topping{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+15;
    }
    
}
