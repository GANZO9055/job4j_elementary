package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToSeventeenThenThirty() {
        int start = 0;
        int finish = 17;
        int result = Counter.sumByEven(start, finish);
        int expected = 72;
        assertThat(result).isEqualTo(expected);
    }

}