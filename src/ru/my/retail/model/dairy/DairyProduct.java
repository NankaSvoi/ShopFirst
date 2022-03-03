package ru.my.retail.model.dairy;

import ru.my.retail.model.Product_orig;

public class DairyProduct  extends Product_orig {

    private int fats; // жиры
    private int carbohydrates; //углеводы
    private int calories;


    public DairyProduct(int fats, int carbohydrates, int calories, String name, String date, float price) {
       super (name, date, price);
       this.fats = fats;
       this.carbohydrates = carbohydrates;
       this.calories = calories;

    }

    public DairyProduct() {
    }

    public String contains () {
        return ". жиры: "+fats+ ", углеводы: "+ carbohydrates+ ", калорийность: "+calories;
    }

    public void setCal(int calories) {
        this.calories = calories;

    }
}



/*extends Product {

    private String name;
    private int calories;

    public DairyProduct(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public DairyProduct() {
    }

    public void setCal(int calories) {
        this.calories = calories;
    }
    public int getCal() {
        return calories;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } */
