package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To1And3Then6() {
        int left = 4;
        int right = 1;
        int one = 6;
        int result = Max.max(left, right, one);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To7And6To2Then7() {
        int left = 7;
        int right = 7;
        int one = 6;
        int two = 2;
        int result = Max.max(left, right, one, two);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}