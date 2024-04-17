package ru.job4j.calculator;

public class Fit {
    private static final short BASE_HEIGHT_MAN = 100;
    private static final short BASE_HEIGHT_WOMAN = 110;
    private static final double WEIGHT_COEFFICIENT = 1.15;

    public static double calculateManWeight(int height) {
        double rsl = (height - BASE_HEIGHT_MAN) * WEIGHT_COEFFICIENT;
        return rsl;
    }

    public static double calculateWomanWeight(int height) {
        double rsl = (height - BASE_HEIGHT_WOMAN) * WEIGHT_COEFFICIENT;
        return rsl;
    }

    public static void main(String[] args) {
        int height = 187;
        double man = Fit.calculateManWeight(height);
        double woman = Fit.calculateWomanWeight(height);
        System.out.printf("Man 187 is %.2f \n", man);
        System.out.printf("Woman 187 is %.2f \n", woman);
    }
}
