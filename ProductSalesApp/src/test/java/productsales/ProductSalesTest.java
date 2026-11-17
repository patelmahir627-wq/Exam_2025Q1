package productsales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductSalesTest {

    // The same data that is used in the report
    int[][] data = {
        {300, 150, 700},
        {250, 200, 600}
    };

    // Checks that the total sales is correct
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        ProductSales productSales = new ProductSales();
        int expected = 2200;
        int actual = productSales.TotalSales(data);
        assertEquals(expected, actual);
    }

    // Checks that the average sales is correct (2200 / 6)
    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        ProductSales productSales = new ProductSales();
        double expected = 2200.0 / 6;
        double actual = productSales.AverageSales(data);
        assertEquals(expected, actual, 0.01);   // 0.01 = allowed difference
    }
}