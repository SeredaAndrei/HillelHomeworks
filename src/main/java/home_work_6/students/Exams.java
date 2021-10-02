package home_work_6.students;

import java.util.Formatter;

public class Exams {
    public static void main(String[] args) {
        print("Иванов", 5, "Математике");
        print("Петрова", 4, "Физике");
        print("Сидорова", 3, "Программированию");
    }
    private static void print (String fullName, int mark, String subject){
        System.out.printf("Студент %-15s получил %-3s по %-10s \n", fullName, mark, subject);
    }
}
