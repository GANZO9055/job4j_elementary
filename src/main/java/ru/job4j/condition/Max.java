package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int one) {
        return left >= right ? (left >= one ? left : one)
                : (right >= one ? right : one);
    }

    public static int max(int left, int right, int one, int two) {
        int zero = one >= two ? one : two;
        return left >= right ? (left >= zero ? left : zero)
                : (right >= zero ? right : zero);
    }
}
