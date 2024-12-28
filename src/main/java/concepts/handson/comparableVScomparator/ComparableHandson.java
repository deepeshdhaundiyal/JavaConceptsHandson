package concepts.handson.comparableVScomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableHandson
{
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(23, "Deepesh"));
        employeeList.add(new Employee(43, "Shruti"));
        employeeList.add(new Employee(26,"Pratyush"));
        employeeList.add(new Employee(41, "Sanjay"));

        Collections.sort(employeeList);

        System.out.println(employeeList);

        for (Employee list : employeeList){
            System.out.println(list);
        }
    }
}

class Employee implements Comparable<Employee>{

    int age;
    String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Employee that) {
        return (this.age > that.age) ? 1 : -1 ;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}