package javabasics.oop.classes;

import java.util.Locale;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //setter of model
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }

    }

    //getter of model
    public String getModel(){
        return this.model;
    }
}
