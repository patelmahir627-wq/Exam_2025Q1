/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author E5490
 */
package productsales;

public class Main {

    public static void main(String[] args) {

        // Single-dimensional array for the quarter headings
        String[] quarters = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};

        // Two-dimensional array: rows = years, columns = quarters
        int[][] sales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Create the object that does the calculations
        ProductSales productSales = new ProductSales();

        // Print the table headings
        System.out.printf("%-10s", "");
        for (int i = 0; i < quarters.length; i++) {
            System.out.printf("%-12s", quarters[i]);
        }
        System.out.println();

        // Print each year (row) and its quarters (columns)
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-10s", "YEAR " + (i + 1));
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-12d", sales[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // Calculate the results
        int total = productSales.TotalSales(sales);
        double average = productSales.AverageSales(sales);
        int max = productSales.MaxSale(sales);
        int min = productSales.MinSale(sales);

        // Print the report
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("--------------------------------");
        System.out.println("Total sales:   " + total);
        System.out.printf("Average sales: %.0f%n", average);
        System.out.println("Maximum sale:  " + max);
        System.out.println("Minimum sale:  " + min);
        System.out.println("--------------------------------");
    }
}
