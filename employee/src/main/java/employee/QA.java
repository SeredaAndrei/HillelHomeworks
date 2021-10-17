package employee;

public class  QA extends Employee {
    public QA(String name, String jobTitle, double salary) throws Exception{
        super(name, jobTitle, salary);

    }

    @Override
    public void work() {
        System.out.println("Testing and creating bugs");
    }

    @Override
    public boolean drinkTea(String tea) {
        switch (tea) {
            case "Green tea":
                return true;
            default:
                return false;
        }

    }
    public String reportBugs (int bugID){
        return "Bug_with_bug_ID " + bugID;
    }
}
