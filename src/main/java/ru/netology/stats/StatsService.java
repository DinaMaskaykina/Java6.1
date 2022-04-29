package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total = total + sale;
        }
        return total;
    }

    public int averageAmount(int[] sales) {
        int total = salesAmount(sales);
        int averageAmount = total / sales.length;

        return averageAmount;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int mounthCount = 0;
        int averageSales = averageAmount(sales);
        for (int sale : sales) {
            if (sale < averageSales) {
                mounthCount++;
            }
        }
        return mounthCount;
    }

    public int salesAboveAverage(int[] sales) {
        int mounthCount = 0;
        int averageSales = averageAmount(sales);
        for (int sale : sales) {
            if (sale > averageSales) {
                mounthCount++;
            }
        }
        return mounthCount;
    }
}
