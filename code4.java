import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortingExample {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 70000));
        employees.add(new Employee("Bob", 50000));
        employees.add(new Employee("Charlie", 60000));
        employees.add(new Employee("Diana", 80000));

        
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        };

        
        
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
