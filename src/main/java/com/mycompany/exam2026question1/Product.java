package com.mycompany.exam2026question1;

public class Product implements IProduct {

    private final String[] products;
    private final int[][] productSales;

    // Constructor to receive product names and sales
    public Product(String[] products, int[][] productSales) {

        this.products = products;
        this.productSales = productSales;
    }

    // Calculate the total number of products sold
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {

                total += productSales[i][j];
            }
        }

        return total;
    }

    // Calculate the average product sales
    @Override
    public double GetAverageProductSold() {

        int count = 0;

        for (int i = 0; i < productSales.length; i++) {

            count += productSales[i].length;
        }

        return (double) GetTotalProductsSold() / count;
    }

    // Find the highest monthly product sale
    @Override
    public String GetMostPopularProduct() {

        int highestSale = productSales[0][0];
        int productIndex = 0;

        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {

                if (productSales[i][j] > highestSale) {

                    highestSale = productSales[i][j];
                    productIndex = i;
                }
            }
        }

        return products[productIndex] + "(" + highestSale + ")";
    }
}