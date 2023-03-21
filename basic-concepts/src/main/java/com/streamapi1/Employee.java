package com.streamapi1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static com.streamapi1.Gender.MALE;
import static com.streamapi1.Gender.FEMALE;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String department;
    private long salary;
    private String address;
    private LocalDate dob;
    private Enum gender;

    public static List<Employee> getEmployees(){
         return Arrays.asList(
                new Employee(6,"Yash", "Chopra", 25,"HR",10000,"Bangalore", LocalDate.of(1994,05,19),MALE),
                new Employee(2,"Suman", "Sharma", 28,"Dev",20000,"Kochi",LocalDate.of(2000,05,20),MALE),
                new Employee(3,"Aruna", "Yaadav", 52,"Testing",30000,"Mysore",LocalDate.of(2022,12,31),FEMALE),
                new Employee(5,"David", "Kameron", 19 ,"Dev", 15000, "Bangalore", LocalDate.of(2000,05,19),MALE),
                new Employee(4,"James", "Hedge", 72,"HR",12000,"Mysore",LocalDate.of(1994,05,19),MALE),
                new Employee(7,"Pooja", "Sharma", 59,"Testing",12333,"Kochi",LocalDate.of(1995,05,19),FEMALE),
                new Employee(8,"Balaji", "Subbu", 88,"DevOps",98980,"Bangalore",LocalDate.of(2005,05,19),MALE),
                new Employee(1,"Lokesh", "Gupta", 32,"Admin",12344,"Bangalore",LocalDate.of(2005,05,19),MALE),
                new Employee(9,"Vishu", "Bissi", 33,"DevOps",1456,"Bangalore",LocalDate.of(2005,05,19),MALE),
                new Employee(10,"Hema", "Ramachandran", 21,"Admin",1456,"Bangalore",LocalDate.of(2005,05,19),FEMALE)
        );
    }
}
enum Gender{
   MALE, FEMALE;
}