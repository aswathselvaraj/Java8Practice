import com.first.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Employee> employee = Arrays.asList(new Employee(101,"Amy",10000),
                new Employee(602,"Biden",20000),
                new Employee(105,"Cast",140000),
                new Employee(204,"Frank",30000),
                new Employee(103,"John",60000),
                new Employee(406,"Scott",50000)
                );

        System.out.println(employee);

        //sort salary in above 20000
        List<Employee> value = employee.stream().filter(i->i.getEmpSalary() > 20000).sorted((o1,o2)-> o1.getEmpSalary().compareTo(o2.getEmpSalary())).collect(Collectors.toList());
        System.out.println(value);

    }
}