package Zadanie4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Key {
    private static final Map<Integer, String> NumbersStars = new LinkedHashMap<>();
    private static final Map<Integer, String> NumbersNumber = new LinkedHashMap<>();

    static {
        NumbersStars.put(0, " **** " + "\n" +
                "*    *" + "\n" +
                "*    *" + "\n" +
                "*    *" + "\n" +
                " **** ");
        NumbersStars.put(1, "   *  " + "\n" +
                "  **  " + "\n" +
                "   *  " + "\n" +
                "   *  " + "\n" +
                "******");
        NumbersStars.put(2, "  **  " + "\n" +
                " *   *" + "\n" +
                "    * " + "\n" +
                "   *  " + "\n" +
                "  ****");
        NumbersStars.put(3, "  ****" + "\n" +
                "     *" + "\n" +
                "  ****" + "\n" +
                "     *" + "\n" +
                "  ****");
        NumbersStars.put(4, "   *  " + "\n" +
                "  **  " + "\n" +
                " * *  " + "\n" +
                "******" + "\n" +
                "   *  ");
        NumbersStars.put(5, "***** " + "\n" +
                "*     " + "\n" +
                "****  " + "\n" +
                "    * " + "\n" +
                "****  ");
        NumbersStars.put(6, "   *  " + "\n" +
                "  *   " + "\n" +
                " ***  " + "\n" +
                "*   * " + "\n" +
                " ***  ");
        NumbersStars.put(7, "***** " + "\n" +
                "    * " + "\n" +
                "   *  " + "\n" +
                "  *   " + "\n" +
                " *    ");
        NumbersStars.put(8, " **** " + "\n" +
                "*    *" + "\n" +
                " **** " + "\n" +
                "*    *" + "\n" +
                " **** ");
        NumbersStars.put(9, " **** " + "\n" +
                "*    *" + "\n" +
                " **** " + "\n" +
                "   *  " + "\n" +
                "  *   ");

    }

    public static Map<Integer, String> getNumbers() {
        return NumbersStars;
    }
}
