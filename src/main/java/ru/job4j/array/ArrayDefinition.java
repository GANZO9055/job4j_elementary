package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("ages: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("surname: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("prices: " + prices.length);
        System.out.println();

        String[] names = new String[4];
        names[0] = "Дмитрий";
        names[1] = "Александр";
        names[2] = "Алексей";
        names[3] = "Иванов";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
