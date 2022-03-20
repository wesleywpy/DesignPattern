package com.wesley.pizza.factory;

import com.wesley.pizza.model.*;

/**
 * 原料工厂
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    /**
     * @return 蔬菜
     */
    Veggies[] createVeggies();

    /**
     * @return 意大利辣香肠
     */
    Pepperoni createPepperoni();

    /**
     * @return 蛤蜊
     */
    Clams createClam();

}
