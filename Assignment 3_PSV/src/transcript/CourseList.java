/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ 
package transcript;

import java.util.ArrayList;

/**
 *
 * @author pchok
 */
public class CourseList {
    
    ArrayList<Course> courseList;
    
    public CourseList() {
        this.courseList = new ArrayList<Course>();
    }


    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
    
    public Course addNewCourse()
    {
        Course course = new Course();
        this.courseList.add(course);
        return course;
    }
    
    
    
}
 