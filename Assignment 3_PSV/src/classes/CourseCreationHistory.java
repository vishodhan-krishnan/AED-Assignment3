/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Saiyam Doshi
 */
public class CourseCreationHistory {

    private ArrayList<CourseCreation> CourseHistory;

    public CourseCreationHistory() {
        this.CourseHistory = new ArrayList<>();

    }

    public ArrayList<CourseCreation> getCourseHistory() {
        return CourseHistory;
    }

    public void setCOurseHistory(ArrayList<CourseCreation> COurseHistory) {
        this.CourseHistory = COurseHistory;
    }

    public CourseCreation AddNewCourse() {
        CourseCreation course = new CourseCreation();
        CourseHistory.add(course);
        return course;
    }

   

}
