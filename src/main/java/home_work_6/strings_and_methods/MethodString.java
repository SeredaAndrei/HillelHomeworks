package home_work_6.strings_and_methods;

import java.util.Locale;

public class MethodString {
    public static void main(String[] args) {
        compareString("I like Java!!!");
    }

    private static void compareString(String s) {
        System.out.println(s);
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.contains("Java"));
        System.out.println(s.replace('a', 'o'));
        System.out.println(s.toUpperCase(Locale.ROOT));
        System.out.println(s.toLowerCase(Locale.ROOT));
        int firstIndex = s.lastIndexOf("J");
        int lastIndex = s.lastIndexOf("a");
        System.out.println("Позиция подстроки Java " + "Первый символ " + firstIndex + " Последний символ " + lastIndex);
        //Вырезать строку Java c помощью метода String.substring().
        System.out.println(s.substring(firstIndex, ++lastIndex));// инкремент, поскольку последний символ обрезается
        // или - Вырезать строку Java c помощью метода String.substring().
        System.out.println(s.substring(7, 11));
    }
}
