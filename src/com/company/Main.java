package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        Product p = new Product();
        Category c = new Category();
        System.out.println("Enter the product id:");
        int id = sc.nextInt();
        p.setProductId(id);
        System.out.println("Enter the product name:");
        String name = sc.next();
        p.setProductName(name);
        System.out.println("Enter the price:");
        double price = sc.nextDouble();
        p.setPrice(price);
        System.out.println("Enter the category id:");
        int catId = sc.nextInt();
        c.setCategoryId(catId);
        System.out.println("Enter the category name:");
        String catName = sc.next();
        c.setCategoryName(catName);

        p.setCategoryObject(c);

        p.applyCoupon();

        System.out.println("You need to pay "+p.getPrice()+" for the "+c.getCategoryName()+" - "+p.getProductName());
    }
}
