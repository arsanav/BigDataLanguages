package com.company.Lab4;

import java.util.ArrayList;
import java.util.HashMap;

public class Mobile {
    private String brand;
    private ArrayList<Model> models;

    public Mobile(String brand){
        this.brand = brand;
        this.models = new ArrayList<>();
    }

    public void addModel(Model model){
        this.models.add(model);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", models=" + models +
                '}';
    }

    public static class Model{
        private String model;
        private HashMap<String, String> params;

        public Model(String model){
            this.model = model;
            this.params = new HashMap<>();
        }

        public void addParam(String param_name, String value){
            this.params.put(param_name, value);
        }

        @Override
        public String toString() {
            return "Model{" +
                    "model='" + model + '\'' +
                    ", params=" + params +
                    '}';
        }
    }
}
