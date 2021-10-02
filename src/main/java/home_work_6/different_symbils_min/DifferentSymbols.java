package home_work_6.different_symbils_min;

public class DifferentSymbols {
    private static int findWord(String st) {
        StringBuilder buffer = new StringBuilder();
        String character;
        for (int i = 0; i < st.length(); i++) {
            character = String.valueOf(st.charAt(i));
            if (buffer.indexOf(character) == -1)
                buffer.append(character);
        }

        return buffer.length();
    }

    public static void main(String[] args) {
        String[] array = {"fffff", "ab", "f", "1234", "jkjk"};
        String target = array[0];
        for (int i = 1; i < array.length; i++) {
            if (findWord(array[i]) < findWord(target))
                target = array[i];
        }
        System.out.println("Искомое слово: " + target + ", число разных символов: " + findWord(target));
    }
}
