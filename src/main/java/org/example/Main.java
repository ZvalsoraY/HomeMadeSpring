package org.example;

import org.example.framework.Context;
import org.example.model.Car;
import org.example.model.Engine;
import org.example.model.Motorbike;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        Context context = Context.load("org.example.model");
        System.out.println(context.getLoadedClasses());

        try {
            Car car = (Car) context.get("Car");
            System.out.println(car.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            Motorbike motrbike = (Motorbike) context.get("Motorbike");
            System.out.println(motrbike.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}