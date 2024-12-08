package app;

public class Main {
    public static void main(String[] args) {
        // продукт 1
        String product1Name = "smartphone";
        // цена за единицу в евро
        double product1Price = 799.56;
        //количество единиц проданных в день
        int product1Quantity = 15;
        // количество дней
        int product1Days = 5;

        // Расчеты продукта 1
        double product1TotalSales = product1Price * product1Quantity * product1Days;
        double product1DailySales = product1TotalSales / product1Days;

        // продукт 1
        String product2Name = "laptop";
        // цена за единицу в евро
        double product2Price = 1498.12;
        //количество единиц проданных в день
        int product2Quantity = 10;
        // количество дней
        int product2Days = 7;

        // Расчеты продукта 2
        double product2TotalSales = product2Price * product2Quantity * product2Days;
        double product2DailySales = product2TotalSales / product2Days;

        // Итоги
        System.out.printf("Product No 1: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.\n",
                product1Name, product1Days, product1TotalSales, product1DailySales);
        System.out.printf("Product No 2: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.\n",
                product2Name, product2Days, product2TotalSales, product2DailySales);
    }
}
