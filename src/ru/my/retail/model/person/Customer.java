package ru.my.retail.model.person;

public class Customer extends Person {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Customer() {
    }

    public void buy (){
    for(int i = 0; i<5; i++)
        System.out.println(i);
    }

    public static boolean HasMoney() {
        return false;
    }

    public boolean NoHasMoney() {
        return true;
    }

    public boolean moneyIsTight() {
        return false;
    }

    public String ageVerification() {
        String ageCustomer = age > 18 ? "Совершеннолетний" : "Не совершеннолетний";
        return ageCustomer;
    }
}





