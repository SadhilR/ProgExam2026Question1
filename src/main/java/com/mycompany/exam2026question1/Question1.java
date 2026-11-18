package com.mycompany.exam2026question1;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Single-dimensional array for product names
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // Two-dimensional array for three months of sales
        int[][] productSales = new int[products.length][3];

        // Capture the monthly sales for each product
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for "
                        + products[i] + " mattress: ");

                productSales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        // Create the Product object
        Product product = new Product(products, productSales);

        // Create and display the sales report
        PrintProduct report = new PrintProduct(product);

        report.PrintReport();

        input.close();
    }
}