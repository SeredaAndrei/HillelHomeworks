package employee;

public class Demo {
    public static void main(String[] args) throws Exception {
        QA qa = new QA("Anastasia ", "QA ", 5);
        QA qa1 = new QA("Pineapple ", "seniorQA ", 100500);
        Programmer programmer = new Programmer("Ivan ", "Jr ", 800, "Java ");
        Employee employee = new Programmer("Vera ","genius ", 900, "JavaScript ");
        System.out.println(employee.toSring());
    }
}
