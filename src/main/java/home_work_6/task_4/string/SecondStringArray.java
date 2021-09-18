package home_work_6.task_4.string;

public class SecondStringArray {
    public static void main(String[] args) {
        String s = "Существует вероятность, что я была не права";
        boolean wasLastCharacterFound = false;
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[j] == 'я' && wasLastCharacterFound == false) {
                    wasLastCharacterFound = true;
                    System.out.println(j);
                }
            }
        }
        {

        }
    }
}
