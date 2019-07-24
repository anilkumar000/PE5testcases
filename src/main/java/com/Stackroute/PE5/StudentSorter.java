package com.Stackroute.PE5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if ((student1.getAge()-student2.getAge())==0){
                if ((student1.getStudentName().compareTo(student2.getStudentName())) == 0) {
                    return (student1.getStudentId()-student2.getStudentId());
                }
                else return (student1.getStudentName().compareTo(student2.getStudentName()));

        }
        else return (student1.getAge()-student2.getAge());

    }
}
