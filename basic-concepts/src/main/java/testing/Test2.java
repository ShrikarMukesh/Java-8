package testing;

import java.util.ArrayList;
import java.util.List;

class Teacher{
    private int id;
    private String name;
    private List<String> subjects;
    private List<Department> departments;
}
class Department{
    private int id;
    private String deptName;
}

public class Test2 {
    //Teacher1 -- Math
    //Teacher2 -- English
    //Teacher3 -- Math, Science, English
    public static void main(String[] args) {
       List<Teacher> teacherList = new ArrayList<>();
      // teacherList.stream().anyMatch(teacher -> teacher.subjects.stream().anyMatch(s -> ))
//      teacherList.stream().filter(teacher -> teacher.departments.stream()
//               .filter(department -> getDepartmant() == "Math"))
//              .map(teacher -> teacher.getName())
//               .collect(() -> teacherList.get(Teacher::getName()));
    }
}
