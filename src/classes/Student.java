/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;



/**
 *
 * @author visho
 */
public class Student {

    String NUID;
    String password;
    CourseCreation selectedCourse;
    ArrayList selectedCourses;

    public Student() {
        this.selectedCourse = new CourseCreation();
        
    }

    public CourseCreation getSelectedCourse() {
        return selectedCourse;
    }

    public void setSelectedCourse(CourseCreation selectedCourse) {
        this.selectedCourse = selectedCourse;
    }

    
    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public String getPassword() {
        return String.valueOf(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
