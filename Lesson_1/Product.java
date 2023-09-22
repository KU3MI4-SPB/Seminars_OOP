package Lesson_1;

public class Product {

    String name;

    String brand;

    double price;

    Product(){
        name = "<Product>";
        brand = "<Brand>";
        price = 100;
    }

    Product(String name){
        // brand = "ООО";
        // price = 100;
        this.name = name;
    }

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    Product(String brand, String name, double price){
        if (brand == null || brand.length() < 3){
            this.brand = "<Brand>";
        }
        else {
         this.brand = brand;
        }
        this.name = name;
        this.price = price;
    }


    String displayInfo(){
        return String.format("%s - %s - %.2f", brand, name, price);
        }

    
}
