package com.junhyun.designpattern.createinstancepattern.builder;

import com.junhyun.designpattern.createinstancepattern.builder.pattern.Calzone;
import com.junhyun.designpattern.createinstancepattern.builder.pattern.NyPizza;
import com.junhyun.designpattern.createinstancepattern.builder.pattern.Pizza;

public class Test {
    public static void main(String[] args) {
        Pizza nyPizza = new NyPizza.Builder(NyPizza.Size.LARGE)
                .addTopping(Pizza.Topping.HAM).addTopping(Pizza.Topping.ONION)
                .build();

        Pizza Calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.MUSHROOM)
                .addTopping(Pizza.Topping.PEPPER)
                .sauceInside()
                .build();

        System.out.println(nyPizza.toString());
        System.out.println(Calzone.toString());
    }
}
