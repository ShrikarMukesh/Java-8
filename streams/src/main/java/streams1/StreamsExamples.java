package streams1;


import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class StreamsExamples {
    public static void main(String[] args) {
          //student name and there activities in map
        Predicate<Student> studentGradePredicate = student -> student.getGradeLevel() >= 3;
        Predicate<Student> studentGpaPredicate = student -> student.getGpa() > 3.9;

        Map<String, List<String>> nameAndActivities =  StudentDataBase.
                getAllStudents()
                .stream()
                .filter(studentGradePredicate)
                .filter(studentGpaPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        for(Map.Entry<String, List<String>> stringListEntry : nameAndActivities.entrySet()){
            //System.out.println(stringListEntry.getKey() + " " + stringListEntry.getValue());
        }
        //debugging stream api
        Map<String, List<String>> nameAndActivities2 =  StudentDataBase.
                getAllStudents()
                .stream()
//                .peek((student -> {
//                    System.out.println(student);
//
//                }))
                .filter(studentGradePredicate)
                .peek((student -> {
                    System.out.println(student);

                }))
                .filter(studentGpaPredicate)
                .peek((student -> {
                    System.out.println("*******************");
                    System.out.println("2nd filetr" + student);

                }))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        //System.out.println(nameAndActivities2);
    }
}
