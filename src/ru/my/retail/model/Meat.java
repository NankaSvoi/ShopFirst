package ru.my.retail.model;

public class Meat {

    private int price;
    private String name;

    public Meat(int price, String name) {
        this.price = price;
        this.name = name;
    }
    public Meat(String name) {
        this.name = name;
    }
    public Meat() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int givPrice() {
        return price;
    }
    public String toString (){
        return "Мясо: "+ name + " = " + price + " руб/кг";
    }
}
   /* public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int maxFinder(int a, int b) {
        int max;

        if (a < b)
            max = b;
        else
            max = a;

        return max;
    }
*/
