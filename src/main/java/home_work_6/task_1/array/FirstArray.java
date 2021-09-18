package home_work_6.task_1.array;

public class FirstArray {

    public static void main(String[] args) {
        int[] MyArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < MyArray.length; i++) {
            if (MyArray[i] % 2 == 0)
                System.out.println(MyArray[i]);
        }

    }


}
