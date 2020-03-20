import java.util.ArrayList;
import java.util.List;

public class Employee {

    static int counter = 1;
    int id;
    int salary;
    String position;

    public Employee(int salary, String position){
        this.id = counter;
        counter++;
        this.salary = salary;
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "(" + id + ") " + position +" : " + salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        List<Employee> employeesWhoEarnMoreThan7k = new ArrayList<>();
        Employee employee1 = new Employee(12000, "Programmer");
        employeeList.add(employee1);
        Employee employee2 = new Employee(13500, "Programmer");
        employeeList.add(employee2);
        Employee employee3 = new Employee(6500, "Secretary");
        employeeList.add(employee3);
        Employee employee4 = new Employee(8000, "Programmer");
        employeeList.add(employee4);
        Employee employee5 = new Employee(6000, "Programmer");
        employeeList.add(employee5);

        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }

        double avg = 0.0;
        int i = 0;
        for (Employee employee : employeeList) {
            if (employee.position == "Programmer") {
                avg += (employee.getSalary() * 12);
                i++;
            }
        }
        System.out.println("Average annual salary for programmers: " + avg / i +".");

        for(Employee employee : employeeList) {
            if (employee.getSalary() > 7000) {
                employeesWhoEarnMoreThan7k.add(employee);
            }
        }
        System.out.print("Emplyess who earn more than 7k: ");
        for (Employee employee : employeesWhoEarnMoreThan7k) {
                System.out.print(employee.id + ", ");
        }
    }
}
