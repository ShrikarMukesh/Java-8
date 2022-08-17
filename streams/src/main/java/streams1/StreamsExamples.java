package streams1;


import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamsExamples {
    public static void main(String[] args) {
          //student name and there activities in map
        Map<String, List<String>> nameAndActivities =  StudentDataBase.getAllStudents().stream()
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        for(Map.Entry<String, List<String>> stringListEntry : nameAndActivities.entrySet()){
            System.out.println(stringListEntry.getKey() + " " +
                    stringListEntry.getValue());
        }

    }
}
