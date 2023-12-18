package streaminterview;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getSampleData();
        long out1 = employees.stream().count();
        long out2 = employees.stream().distinct().count();
        System.out.println(out1 + " " + out2);
    }
}
