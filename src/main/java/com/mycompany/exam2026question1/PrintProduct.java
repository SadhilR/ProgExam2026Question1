package com.mycompany.exam2026question1;

public class PrintProduct {

    private final Product product;

    // Constructor to receive the Product object
    public PrintProduct(Product product) {

        this.product = product;
    }

    // Print the total product sales
    public void PrintTotalProductSales() {

        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());
    }

    // Print the average product sales
    public void PrintAverageProductSales() {

        System.out.println("AVERAGE PRODUCT SALES: "
                + Math.round(product.GetAverageProductSold()));
    }

    // Print the most popular product
    public void PrintMostPopularProduct() {

        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct());
    }

    // Print the complete product sales report
    public void PrintReport() {

        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();
        System.out.println("**********************************************");

        PrintTotalProductSales();
        PrintAverageProductSales();
        PrintMostPopularProduct();
    }
}