package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] products = new Product[3];
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            System.out.println(product.getName() + " - " + product.getCount());
        }
        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        products[0] = oil;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            System.out.println(product.getName() + " - " + product.getCount());
        }
        System.out.println("Shown only product.count > 10");
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product.getCount() > 10) {
                System.out.println(product.getName() + " - " + product.getCount());
            }
        }

        Product[] productsV2 = new Product[5];
        productsV2[0] = new Product("Milk", 10);
        productsV2[1] = new Product("Bread", 4);
        productsV2[2] = new Product("Egg", 19);

        for (int i = 0; i < productsV2.length; i++) {
            Product product = productsV2[i];
            /* проверяем, что объект не равен null. Т.к. у нас массив не заполнен целиком. */
            if (product != null) {
                System.out.println(product.getName());
            }
        }
    }
}
