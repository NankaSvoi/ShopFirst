package ru.my.retail.model;

public class ProductLiquid extends Product {
    //  ------------------------------------------------------------------------------------------------------


    private int cal;

    public ProductLiquid () {
        super();
    }

    public ProductLiquid(String name) {
        super(name);
    }

    public ProductLiquid(String name, int price) {
        super(name, price);
    }

    public ProductLiquid(String name, int price, String data) {
        super(name, price, data);
    }
//  ------------------------------------------------------------------------------------------------------


    public String showMeDate() {
        System.out.println(444);
        return this.getData();
    }


}