package home_work_6.task_2.array;

public class SecondArray {
    public static void main(String[] args) {

        int[] MyArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int j = 0;
        for (int i = 0; i < MyArray.length; i++) {
            if (MyArray[i] % 2 == 0)
                j += i;

        }
        System.out.println(j);

    }
}
