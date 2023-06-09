package org.example;

import java.util.ArrayList;
import java.util.List;

public class MainClass12List {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
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
