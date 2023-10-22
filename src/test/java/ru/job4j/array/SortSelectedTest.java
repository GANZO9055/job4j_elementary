package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort7() {
        int[] data = new int[] {3, 4, 1, 2, 5, 6, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort11() {
        int[] data = new int[] {3, 4, 1, 2, 5, 16, 15, 13, 12, 10, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 10, 11, 12, 13, 15, 16};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort4() {
        int[] data = new int[] {56, 43, 21, 92};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {21, 43, 56, 92};
        assertThat(result).containsExactly(expected);
    }
}