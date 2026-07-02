package problem_4;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter employee name: ");
    String empName = sc.nextLine();

    System.out.print("Enter employee base salary: ");
    double empSalary = sc.nextDouble();
    sc.nextLine();
    Employee emp = new Employee(empName, empSalary);

    System.out.print("Enter manager name: ");
    String mgrName = sc.nextLine();

    System.out.print("Enter manager base salary: ");
    double mgrSalary = sc.nextDouble();

    System.out.print("Enter manager bonus: ");
    double bonus = sc.nextDouble();

    Manager mgr = new Manager(mgrName, mgrSalary, bonus);

    System.out.println(emp.calculateSalary());
    System.out.println(mgr.calculateSalary());

    sc.close();
}
}