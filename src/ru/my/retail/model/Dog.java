package ru.my.retail.model;

public class Dog {

        private int weight; // вес

  public Dog() {
            System.out.println("создаем щенка");
            weight = 0;
        }
public Dog(int startingWeight){
            weight = startingWeight;
            System.out.println("Создание нового щенка весом " + weight + " кг.");
        }
        public void info() {
            System.out.println("щенок массой " + weight + " кг.");
        }
        public void info(String s) {
            System.out.println(s + ": щенок массой " + weight + " кг.");
        }


        }




