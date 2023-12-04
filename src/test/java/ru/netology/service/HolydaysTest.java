
package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class HolydaysTest {
    @ParameterizedTest
    @CsvFileSource (files="src/test/resources/parameters.csv")

    public void shouldCalculateMoneyMonths1(int income, int expenses, int threshold, int expected) {
        HolydaysServise service = new HolydaysServise();
        //int income = 10_000;
       // int expenses = 3_000;
        //int threshold = 20_000;
        //int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

   // @Test
   // public void shouldCalculateMoneyMonths2() {
       // HolydaysServise service = new HolydaysServise();
       // int income = 100_000;
        //int expenses = 60_000;
        //int threshold = 150_000;
       // int expected = 2;

        //int actual = service.calculate(income, expenses, threshold);
        //Assertions.assertEquals(expected, actual);
   // }

}


