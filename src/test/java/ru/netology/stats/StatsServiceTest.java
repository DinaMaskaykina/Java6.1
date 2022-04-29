package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSalesAmount() {
        StatsService service = new StatsService();
        int[] mounths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.salesAmount(mounths);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageAmount() {
        StatsService service = new StatsService();
        int[] mounths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageAmount(mounths);

        assertEquals(expected, actual);

    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        long[] mounths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(mounths);

        assertEquals(expected, actual);

    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        long[] mounths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(mounths);

        assertEquals(expected, actual);

    }

    @Test
    void shouldSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] mounths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.salesBelowAverage(mounths);

        assertEquals(expected, actual);

    }

    @Test
    void shouldSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] mounths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.salesAboveAverage(mounths);

        assertEquals(expected, actual);

    }

}