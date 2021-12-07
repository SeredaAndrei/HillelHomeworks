import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Bird 1");
        myArrayList.add("Bird 2");
        myArrayList.add("Bird 3");
        myArrayList.add("Bird 4");
        myArrayList.add("Bird 5");
        myArrayList.add("Bird 6");
        myArrayList.add("Bird 7");
        myArrayList.add("Bird 8");
        myArrayList.add("Bird 9");
        myArrayList.add("Bird 10");
        myArrayList.add("Bird 11");

        for (int i = 0; i < 1; i++)
            System.out.println(myArrayList.get(i)); // выводим 1 элемент

        System.out.println(" ");

        for (int i = 0; i < myArrayList.size(); i++)
            System.out.println(myArrayList.get(i)); // выводим все элементы

        System.out.println(" ");

        myArrayList.add(5, "Псевдоптица");

        String birdIndex = "";
        for (String name : myArrayList) {
            birdIndex = birdIndex + name + " ";
        }
        System.out.println(birdIndex); // есть псевдоптица

        System.out.println(" ");

        myArrayList.add("Last Bird element");

        for (int i = 0; i < myArrayList.size(); i++)
            System.out.println(myArrayList.get(i)); // выводим все элементы, включительно с последним


    }
}
