package com.mycompany.exam2026question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    // Product names used for testing
    String[] products = {
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };

    // Monthly sales used for testing
    int[][] productSales = {
        {25, 18, 20},
        {15, 10, 12},
        {18, 15, 20}
    };

    Product product = new Product(products, productSales);

    // Test the total product sales
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        int expected = 153;

        int actual = product.GetTotalProductsSold();

        assertEquals(expected, actual);
    }

    // Test the average product sales
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        double expected = 17.0;

        double actual = product.GetAverageProductSold();

        assertEquals(expected, actual, 0.001);
    }
}