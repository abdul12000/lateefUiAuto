package org.example;


import java.util.HashSet;
import java.util.Set;

public class MainClass13Set {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("Toyota");
        cars.add("Ferrari");
        cars.add("Nissan");
        cars.add("");
        cars.add("Landrover");
        cars.add("Mercedes");
        cars.add("Mercedes");
        for(String i : cars)
            System.out.println(i);

        //
        System.out.println(cars);
    }
}
