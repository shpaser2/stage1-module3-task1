package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public List<String> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);
        List<String> secondList = new ArrayList<>(firstList);
        return secondList;
    }

    public <T> T genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3
    public void cloneMethod(List consumer, List producer) {
        consumer.addAll(producer);
    }

}
