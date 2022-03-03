package ru.my.retail.model;

public class Product {

    private String name;
    private int price;
    private String data;

    public Product () {
        this.price = 11;
 //       System.out.println("default construct");
    }

    public Product(String name) {
        this();
        this.name = name;
//        this.price = price;
    }

    public Product(String name, int price) {
        this(name);
        this.name = name;
        this.price = price;
   }

    public Product (String name, int price, String data) {
        this.name = name;
        this.price = price;
        this.data = data;
    }

    public int getCal() {
//        System.out.println(this.price);
        return this.price;
    }

    public String getName() {
        return this.name;
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

    public String getData() {
        return this.data;
    }
    public void setData(String data) {
        this.data = data;
    }
//    public void checkName() {
//        System.out.println("я продукт");
//    }

    //    public int givePrice() {
//        System.out.println("33");
//        return price;
//    }


    /**
     * Укажи прайс
     * @param price
     */

    /**
     *
     */




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

    }
