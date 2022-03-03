package ru.my.retail.model;

public class ProductSolid extends Product {
        //  ------------------------------------------------------------------------------------------------------

        public ProductSolid () {
            super();
        }

        public ProductSolid(String name) {
            super(name);
        }

        public ProductSolid(String name, int price) {
            super(name, price);
        }

        public ProductSolid (String name, int price, String data){
            super(name, price, data);
        }

        public String  showMeDate() {
            System.out.println(222);
            return this.getData();
        }





   // public void setName(String name) {
       // this.name = name;

    //public String showMeDate() {
     //   System.out.println(888);
      //  return this.data;
//  ------------------------------------------------------------------------------------------------------




}