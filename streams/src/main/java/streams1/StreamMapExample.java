package streams1;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class StreamMapExample {
    public static List<String> namesList(){

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .toList();
    }
    public static Set<String> setOfNames(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toSet());
    }
    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(setOfNames());

        List<Student> students = StudentDataBase.getAllStudents();
        students.stream().forEach(student -> student.getGpa());



        List<Student> req = StudentDataBase.getAllStudents();

    }
}
