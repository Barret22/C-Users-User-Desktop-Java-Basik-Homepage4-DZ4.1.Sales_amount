package app;

public class Main {
    public static void main(String[] args) {
        // продукт 1
        String productName = "smartphone";
        // цена за единицу в евро
        double productPrice = 799.56;
        //количество единиц проданных в день
        int productQuantity = 15;
        // количество дней
        int productDays = 5;

        // Расчеты продукта 1
        double productTotalSales = productPrice * productQuantity * productDays;
        double productDailySales = productTotalSales / productDays;

        // Итог
        System.out.printf("Product No 1: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.\n",
                productName, productDays, productTotalSales, productDailySales);

        // продукт 2
        productName = "laptop";
        // цена за единицу в евро
        productPrice = 1498.12;
        //количество единиц проданных в день
        productQuantity = 10;
        // количество дней
        productDays = 7;

        // Расчеты продукта 2
        productTotalSales = productPrice * productQuantity * productDays;
        productDailySales = productTotalSales / productDays;

        // Итог
        System.out.printf("Product No 2: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.\n",
                productName, productDays, productTotalSales, productDailySales);
    }
}
