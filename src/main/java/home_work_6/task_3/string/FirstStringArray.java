package home_work_6.task_3.string;

public class FirstStringArray {
    public static void main(String[] args) {
        String s = "Существует вероятность, что я была не права";
        boolean wasFirstCharacterFound = false;
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'я' && wasFirstCharacterFound == false) {
                wasFirstCharacterFound = true;
                System.out.println(i);
            }
        }
    }
}
