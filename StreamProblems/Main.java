import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int id;
    private int age;

    public Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        //  list of employees
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alice", 101, 30));
        employeeList.add(new Employee("Bob", 102, 25));
        employeeList.add(new Employee("Charlie", 103, 28));
        employeeList.add(new Employee("David", 104, 35));
        employeeList.add(new Employee("Anna", 105, 22));
        employeeList.add(new Employee("Eve", 106, 40));
// Use Stream API to filter employees based on criteria
       
        Map<String,Employee> filteredMap=employeeList.stream().filter(emp->emp.getName().startsWith("A")).filter(x->x.getId()%2!=0).filter(x->x.getAge()%2==0).collect(Collectors.toMap(Employee::getName,employee->employee));

        // Display the filtered employees
        filteredMap.forEach((name, employee) ->
                System.out.println("Name: " + name + ", ID: " + employee.getId() + ", Age: " + employee.getAge()));
    
 List<Integer> list = Arrays.asList(1,2,3,4,5,6,8);
List<Integer> sumlist=list.stream().filter(x->x%2==0).collect(Collectors.toList());
               int sum=sumlist.stream().mapToInt(x->x*x).sum();          
                   System.out.println(sum);

		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
                              List<String> longestStrings=strings.stream().collect(Collectors.groupingBy(String::length)).entrySet().stream().max((e1,e2)->e1.getKey().compareTo(e2.getKey()))
                                                           .map(e->e.getValue()).orElse(null);
                            System.out.println("Longest Strings: " + longestStrings);

}
}
