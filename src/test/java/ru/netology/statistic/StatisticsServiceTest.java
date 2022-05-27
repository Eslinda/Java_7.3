package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxOne() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 1, 1, 1, 1, 1, 1};
        long expected = 1;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxLarge() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1258, 1, 10, 78_000, 0, 76, 51, 126_000, 620_000_000, 152};
        long expected = 620_000_000;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNegative() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-173, -1, -78_000, -76, -51, -5_357_687};
        long expected = -1;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
