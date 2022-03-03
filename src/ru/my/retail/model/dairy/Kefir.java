package ru.my.retail.model.dairy;

public class Kefir extends DairyProduct {

    private double volume;

    // public Kefir(double volume, int fats, int carbohydrates, int calories) {
     //   super(fats, carbohydrates, calories);
  //  }

    public Kefir () {
    }

    public void countInKefir(int a){  //считаем кефир на полке
        while (a < 5) {
            a++;
            System.out.println(a);
        }
    }

    public void countInKefir1 (int a, int b) {
        int c = 5, d = 7;
        while (c<9) {
            c++;
            System.out.println(c);
        }
        do {
            d++;
            System.out.println(d);
        } while (d<9);
    }


    public void buy() {
        System.out.println("товар куплен");
    }

    public int maxFinder1(int a, int b) {
        int max;

        if (a < b)
            max = b;
        else
            max = a;

        return max;
    }


}
      // int count = 11, count2 = 11;
      //   while (count < 10) {
      //    count++;
      //  System.out.println(count);
      //  }

    /*private String fatСontent; // жирность
    private float price;


    public Kefir(String fatСontent, float price) {
        this.fatСontent = fatСontent;
        this.price = price;
    }

    public Kefir(){

    }

    public void checkName() {
        System.out.println("жирность 30%" + ", кефир");
    }

    public float checkThePrice(){
        System.out.println("цена кефира:" + 56);
        return 12;
}

    }


    /*public String scanTheBarCode() {
        System.out.println ("сканируем штрихкод");
        return this.barCode1;
    }

    public String giveMyName() {
        System.out.println();
        return this.name1;
    }

    public float checkThePrice(){
        System.out.println("цена кефира:" + 1234);
        return 12;
    }
    public void giveMyCheck(){
        System.out.println("кефир");
    }
}

/*public class Kefir {

    private String date;
    private String percent;
    private String volume;

    public Kefir(String date22, String percent, String volume) {
        this.date = date22;
        this.percent = percent;
        this.volume = volume;
        date = date;
        date = date22;
    }

    public void openABottle(){
        System.out.println ("бутылка кефира открыта");
    }

    public void checkName(){
        System.out.println ("я кефир");
    }

    public String giveMyDate() {
        String date  = "01.10";
        return this.date;
    }

    public String pokajiProcent() {
        String percent  = "20%";
        return this.percent;
    }
}*/


