package ru.my.retail.model;

public class Sweets1 {


    private String name;
    private int price;

    public Sweets1(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String toString (){
        return "Конфеты: "+ name + " = " + price + " руб/кг";
    }
}

