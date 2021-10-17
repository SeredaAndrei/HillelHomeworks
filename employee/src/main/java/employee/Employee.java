package employee;

public abstract class Employee {
    private String name;
    private String jobTitle;
    protected double salary;

public Employee(String name, String jobTitle, double salary){
    this.name = name;
    this.jobTitle = jobTitle;
    this.salary = salary;

}
public void setJobTitle(String jobTitle) throws Exception {
    if (jobTitle !=null){
        this.jobTitle = jobTitle;
        return;
    }
    throw new Exception();
}
    public String getName(){
        return name;
    }
    public String jobTitle(){
        return jobTitle;
    }

    public abstract void work();
    public abstract boolean drinkTea(String tea);
    public void sleep(int hours){
        System.out.println("was sleep " + hours);
        if (hours<8){
            System.out.println("tired");
        } else {
            System.out.println("sleep well");
        }
    }
    public String toSring(){
        return name+jobTitle;
    }
}
