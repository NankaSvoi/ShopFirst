package ru.my.retail.model.dairy;

public class Curd {

    private String name;
    private double price;
    private String barCode;

    public Curd (String name, double price, String barCode) {
        this.name = name;
        this.price = price;
        this.barCode = barCode;
    }

          public Curd(String name) {
            this.name = "name";
        }

//public int countTheCurdOnTheShelf(){    //посчитать творог на полке
   //     return (ss) ;
  //  }

    public double giveMyCenu() {
        System.out.println("57");
        return price;


    }


}