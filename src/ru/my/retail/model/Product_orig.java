package ru.my.retail.model;

import ru.my.retail.model.dairy.Kefir;

public class Product_orig {

    private String name;
    private String date;
    private float price;

    public Product_orig(String name, String date, float price) {
        this.name = name;
        this.date = date;
        this.price = price;
    }
    public Product_orig(String name) {
        this.name = name;
    }

    public Product_orig() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        return "Название: " + name + ", дата производства: " + date + ", цена: " + price;
    }

    public String haveМoney() {
        boolean money = true;
        String s = money == true ? "покупаю продукт" : "ложусь голодной";
        return s;
    }
    public boolean warmSea() {
        boolean warmSea = true;
        if(warmSea)
            System.out.println(warmSea);
      return warmSea;
        }




}


    /*  private String name;
    private int price;

    public Product_orig(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product_orig(){

    }

    public int givePrice() {
        System.out.println("цена: "+33 +" рубля");
        return price;
    }

    public void buy (){
        System.out.println("купили");
    }

    public void putInBasket () {
        System.out.println("продукт положен в корзину");
    }

    public void checkName() {
        System.out.println("я продукт");
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


   /* public Product(String name, String productionDate, String barCode, int price) {
        this.name = name;
        this.productionDate = productionDate;
        this.barCode = barCode;
        this.price = price;
    }


    public String giveBarcode() {
        System.out.println(22221111);
        return this.barCode;
    }
    public void checkName () {
        System.out.println("я продукт");
    }
    public float checkThePrice () {
        System.out.println("53:" + price);
        return price;
    }
    public void putInBasket () {
        System.out.println("продукт положен в корзину");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    */



