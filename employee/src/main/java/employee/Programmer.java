package employee;

public class Programmer extends Employee{


    private String language;
    public Programmer(String name, String jobTitle, double salary, String language){
        super(name, jobTitle, salary);
this.language=language;
    }
    public String getLanguage() {
        return language;
    }
    @Override
    public void work(){
        System.out.println("programmer works");
    }
    @Override
    public boolean drinkTea(String tea){
        return tea!=null;
    }
    public void fixBug(String bugName){
        System.out.println("Bug %10s was fixed" + bugName);
    }
}
