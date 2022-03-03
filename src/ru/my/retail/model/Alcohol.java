package ru.my.retail.model;

public class Alcohol extends Product_orig {
    private String degrees; // градусы
    private int volume; // объем мл

    public Alcohol (String degrees, int volume, String name, String date, float price) {
        super(name, date, price);
        this.degrees = degrees;
        this.volume = volume;
    }
    public Alcohol (String name, int volume){
        super(name);
        this.volume = volume;
    }

    public Alcohol (String name){
        super(name);
    }

    public Alcohol (){

    }

    public String toString (){
        return "Наименование: " + getName();
    }

    public String adult (){ // взрослый
      int ageСustomer = 18;
      String w = ageСustomer > 18? "можно продать" : "нельзя продавать";
        return w;
    }

    public int possibilityOfPayment(){ // возможность оплаты
       int moneyInWallet = 51;
       int t = moneyInWallet < 20? 30 : 50;
       return t;
    }



}
