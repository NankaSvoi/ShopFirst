package ru.my.retail.model;

public class ProductExample {

    private String name;
    private int price;

    //  ------------------------------------------------------------------------------------------------------

    public ProductExample() {
        this.price = -1;
//        System.out.println("default construct");
    }

    public ProductExample(String name) {
        this();
        this.name = name;
//        this.price = price;
    }

    public ProductExample(String name, int price) {
        this(name);
//        this.name = name;
        this.price = price;
   }
//  ------------------------------------------------------------------------------------------------------

    public int givePrice() {
        System.out.println("33");
        return price;
    }

//    public void buy (){
 //       System.out.println("купили");
 //   }

    public void putInBasket () {
        System.out.println("продукт положен в корзину");
    }

    public void checkName() {
        System.out.println("я продукт");
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