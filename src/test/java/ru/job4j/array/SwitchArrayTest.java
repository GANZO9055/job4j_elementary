package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to10() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 0;
        int dest = input.length - 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {8, 2, 3, 4, 5, 6, 7, 1, 9, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to9() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 3;
        int dest = input.length - 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 6, 5, 4, 7, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}