package problem_4;

public class Employee {
    protected String name;
    protected double basesalary;

    public Employee(String name,double basesalary) 
    {
        this.name=name;
        this.basesalary=basesalary;
    }
   public double calculateSalary(){
        return basesalary;
    }

    
}
