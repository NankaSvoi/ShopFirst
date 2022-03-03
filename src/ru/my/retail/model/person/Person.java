package ru.my.retail.model.person;

public class Person {
    private int id; // уникальный номер
    private String name;
    private int age;

    public Person (int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(){

    }



    public void hisInfa () {
        for (int i = 0; i < 3; i++) {
            System.out.println("мой уникальный номер "+ id +",меня зовут "+name+", мой возраст "+ age);
        }
    }

    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


}
