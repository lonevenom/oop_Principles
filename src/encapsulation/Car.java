package encapsulation;

import abstraction.abstract_classes.BlueTooth;

public class Car{

    //instance variables
    public String make;
    private int year;
    private double price; // require a password
    private boolean isConvertible = true; //

    //Providing indirect access to year to set and get info
    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }


    //Writing - setting info
    public void setPrice(double price, String adminPassword){
        if(adminPassword.equals("abcd1234")) this.price = price;
        else throw new RuntimeException("The password entered is not valid!!!");
    }

    //Reading - getting info
    public double getPrice(){
        return price;
    }

    public boolean getIsConvertible(){
        return isConvertible;
    }

}