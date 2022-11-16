package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Car,Mashina> hashMap = new LinkedHashMap<>();
        hashMap.put(new Car(1,2004 ,"BMW"),
        new Mashina(2022,"BMW",14999,"seriy"));

        for (Map.Entry entry: hashMap.entrySet()){
            Car a = (Car) entry.getKey();
            Mashina b = (Mashina) entry.getValue();

            System.out.println(a);
            System.out.println(b);
        }
    }
}
