package com.Stackroute.PE5;

import java.util.Collections;
import java.util.List;

public class StudentDetailsManager {
    private StudentSorter studentSorter=new StudentSorter();

    public List<Student> managingStudentDetails(List<Student> studentList){
        Collections.sort(studentList,studentSorter);
        return studentList;

    }
}
