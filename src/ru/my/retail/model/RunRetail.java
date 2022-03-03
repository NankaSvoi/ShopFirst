package ru.my.retail.model;

import ru.my.retail.model.dairy.Curd;

public class RunRetail {

    public static void main(String[] args) {


        Meat[] container = {new Meat(700, "Говядина"), new Meat(450, "Свинина"), new Meat(600, "Баранина"), new Meat(500, "Оленина")};
        for (Meat meat : container) {
            System.out.println(meat);
        }
        System.out.println();

        Alcohol[] box = {new Alcohol("Пиво"), new Alcohol("Вино"), new Alcohol("Коньяк")};
        for (int alko = 0; alko < box.length; alko++) {
            System.out.println(box[alko]);
        }
        System.out.println();

        Sweets1 candy[];
        candy = new Sweets1[4];
        candy[0] = new Sweets1("Сникерс", 50);
        candy[1] = new Sweets1("Молочный шоколад", 100);
        candy[2] = new Sweets1("Баунти", 40);
        candy[3] = new Sweets1("Барни", 30);
        for (Sweets1 sweets : candy) {
            System.out.println(sweets);
        }

        System.out.println();

        Sweets1[] chocolate = {new Sweets1("Шоколадные", 350), new Sweets1("Молочные", 400), new Sweets1("Белые", 300)};
        int i = 0;
        while (i < chocolate.length) {
            System.out.println(i);
            i++;
        }
        System.out.println();

      Drinks [] drinks = new Drinks[5];
        drinks[0] = new Drinks("Pepsi", 60);
        drinks[1] = new Drinks("Fanta", 45);
        drinks[2] = new Drinks("Cola", 70);
        drinks[3] = new Drinks("Sprite", 50);
        drinks[4] = new Drinks("Water", 30);
        int c = 0;
        while (c < drinks.length) {
            System.out.println(c);
            c++;
           for (Drinks water: drinks){
               System.out.println(water);}
        //   while (chocolate<3) {
        //        chocolate++;

            }}}

            //  int i = 1;
            //  while(i < 11){
            //     System.out.println("i= " + i);
            //   i++;
            //  }



        // Meat[] container = new Meat[5];
        // container[0] = new Meat("Говядина");
        //container[1] = new Meat("Свинина");
        // container[2] = new Meat("Баранина");
        // container[3] = new Meat("Оленина");
        //  container[4] = new Meat("Медвежатина");
        //  for (int i = 0; i < container.length; i++)
        //     System.out.println(container[i]);
        //  System.out.println();
        //     System.out.println("Говядина"+container[0]);
        //      System.out.println("Свинина"+container[1]);
        //  System.out.println();


        //  int [] array = {10,3,7,8};

        //  for (int i = 0; i < array.length; i++) {
        //      System.out.println(array[i]);
        //  }




// 10й урок - инициализация
/*Dog tuzik = new Dog(12); // перегрузка методов
  tuzik.info();
  tuzik.info("rrr");

Dog tuzik1 = new Dog();
  tuzik1.info("мой ");



        // PrimitiveOverloading nnn = new PrimitiveOverloading();
       // nnn.fl(1000000000);


        String s = "Проверка";
        char[] charArray = s.toCharArray();

        printCharsWithForEach(charArray);
        printCharsWithFor(charArray);

    }

    private static void printCharsWithFor(char[] charArray) {
        if(true) return;
        for (int i = 5; i < charArray.length; i++) {
      //      System.out.println(charArray[i]);
        }
    }

    private static void printCharsWithForEach(char[] charArray){
            for (char selectChar : charArray) {
                for (char s2 : charArray) {
                    break;
                }
            }
        }
    }


        // for (int i = 0; i < charArray.length; i++) {
        //    System.out.println(charArray[i]);
        //}



           /*Customer vova = new Customer("Владимир", 18);

           if (vova.HasMoney ()) {     // у вовы есть деньги
            System.out.println("продать продукт");
          boolean vovaAtZero = vova.NoHasMoney();             // вова на нуле
            System.out.println (vovaAtZero);
        } else if (vova.NoHasMoney ()){                       // если у вовы денег нет, продукт не продавать
            System.out.println("НЕ продать продукт");
        } else if (vova.moneyIsTight()){                      // если у вовы денег мало, предложить товар дешевле
            System.out.println("предложить товар дешевле");
        } else {
            System.out.println("не важно, что тут");
        }
*/


     /*   Kefir burenka = new Kefir();
         burenka.countInKefir(0);
         System.out.println(burenka);

        burenka.countInKefir1(0, 0);
        System.out.println(burenka);

}}

    /* Product_orig bread = new Product_orig("Хлеб Бородинский", "22.01", 40);
        bread.toString();
        String breadCanBuy = bread.haveМoney();
        System.out.println(breadCanBuy);
        String breadInfo = bread.toString();
        System.out.println(breadInfo);


        DairyProduct milk = new DairyProduct(12, 30, 120, "Молоко Агро", "12.01", 45);
        String milkContains = milk.contains();
        String MilkInfo = milk.toString();
        System.out.println(MilkInfo + milkContains);

         Alcohol beer = new Alcohol("8%", 1, "Пиво", "12.02", 70);
         String ageCustomer = beer.adult();
        System.out.println(ageCustomer);


        int moneyIn = beer.possibilityOfPayment();
        System.out.println(moneyIn);


    }
}

//int milkPrice = milk.getCal();
//        System.out.println(milkPrice);




 /*       Product orange = new Product("Апельсин Марокко", 70, "01.10");
        Product apple = new Product("Яблоки Кубанские", 50, "06.02");
        Product iceСream = new DairyProduct("Эскимо", 200);
        Kefir agrokompleks = new Kefir("20%", 10.50f);
        agrokompleks.checkName();

        String orangeName = orange.getName();
        int orangePrice = orange.getPrice();
        String orangeData = orange.getData();
        apple.setPrice(5);
        apple.setData("05.02");

        String appleName = apple.getName();
        int applePrice = apple.getPrice();
        String appleData = apple.getData();

        String iceСreamName = iceСream.getName();
        int iceСreamCal = iceСream.getCal();
        int iceCreamPrice = iceСream.getPrice();

        System.out.println("Название: " + appleName + ", цена " + applePrice + " рублей" + ", дата сортировки " + appleData);
        System.out.println("Название: " + orangeName + ", цена " + orangePrice + " рублей" + ", дата сортировки " + orangeData);
        System.out.println("Название: " + iceСreamName + " , " + iceСreamCal + " каллорий, цена " + iceCreamPrice + " рублей");


        int pen, pen1;
        float pensil, pensil1;
        double notebook;
        pen = 20 / 5;
        pen1 = 15 * 2;
        pensil = 10.50f;
        pensil = pensil / 4;
        pensil1 = 10.30f;
        pensil1 = pensil1 + 5.20f;
        notebook = 200.333;
        notebook = notebook - 150.222;
        System.out.println("pen=" + pen + " pen1=" + pen1);
        System.out.println("pensil=" + pensil + " pensil1=" + pensil1 + " notebook=" + notebook);


        Test nn = new Test(12);
       Kefir d = new Kefir(1,12,3,4,"");
        System.out.println(nn.maxFinder(5,8));
        d.maxFinder1(2,1);
        System.out.println(d.maxFinder1(5,1));
*/


/*
//        System.out.println(
//            String.format("Ваше имя%s ++++++++++++++ \n" +
//                            "  %s " +
//                    "\n __________________ " +
//                    "\n     %d"
//
//                    , "111111", "22222222222", 33) // => sdfsdfsdfsdf
//        );

//

       // Kefir molochnik = new Kefir("300",40);
        //molochnik.checkThePrice();


        Product unknown = new Product(); // херня с китая
        Product milk = new ProductLiquid("Молоко"); // не знаем цену
        Product butter = new ProductSolid("Масло", 10); // все ок
        Product bob = new ProductSolid("Бобы", 30, "22.09");

        bob.setName("Боба");
        bob.setPrice(6);
        bob.setData("07.07");

//        if (milk.getPrice() == 0) {
        int userPrice = 5;
            milk.setPrice(userPrice);
//        }

        int milkPrice = milk.getCal();
        System.out.println(milkPrice);

        unknown.setName("Хлеб");
        unknown.setPrice(12);

        System.out.println( String.format("unknown = Product: %s Price: %d", unknown.getName(), unknown.getPrice()) );
        System.out.println( String.format("milk = Product: %s Price: %d", milk.getName(), milk.getPrice()) );
        System.out.println( String.format("butter = Product: %s Price: %d", butter.getName(), butter.getPrice()) );
        System.out.println( String.format("bob = ProductSolid: %s Price: %d Data: %s", bob.getName(), bob.getPrice(), bob.getData()) );

 */



