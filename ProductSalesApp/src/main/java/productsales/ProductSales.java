/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author E5490
 */
package productsales;

// This class does the calculations on the 2D sales array
public class ProductSales implements IProduct {

    // Adds up every sale in the array
    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;

        // Outer loop = years (rows), inner loop = quarters (columns)
        for (int[] productSale : productSales) {
            for (int j = 0; j < productSale.length; j++) {
                total = total + productSale[j];
            }
        }
        return total;
    }

    // Average = total divided by the number of sales
    @Override
    public double AverageSales(int[][] productSales) {
        int total = TotalSales(productSales);
        int count = 0;

        // Count how many sales values there are
        for (int[] productSale : productSales) {
            count = count + productSale.length;
        }

        // Cast to double so the division keeps the decimals
        return (double) total / count;
    }

    // Finds the highest sale
    @Override
    public int MaxSale(int[][] productSales) {
        int max = productSales[0][0];   // start with the first value
        for (int[] productSale : productSales) {
            for (int j = 0; j < productSale.length; j++) {
                if (productSale[j] > max) {
                    max = productSale[j];
                }
            }
        }
        return max;
    }

    // Finds the lowest sale
    @Override
    public int MinSale(int[][] productSales) {
        int min = productSales[0][0];   // start with the first value
        for (int[] productSale : productSales) {
            for (int j = 0; j < productSale.length; j++) {
                if (productSale[j] < min) {
                    min = productSale[j];
                }
            }
        }
        return min;
    }
}