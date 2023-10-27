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

    ArrayList<CourseCreation> CourseHistory;
    //ArrayList<CourseCreation> courseOffered;

    public CourseCreationHistory() {
        this.CourseHistory = new ArrayList<>();
        //this.courseOffered = new ArrayList<>();

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

    public CourseCreation addCourseOffered(String coName, String coID, String term, String pName, String coDay1, String coDay2, String time1, String time2) {
        CourseCreation newcourse = new CourseCreation();
        newcourse.setTerm(term);
        //newcourse.setCourseID(coID);
        newcourse.setCourseDay1(coDay1);
        newcourse.setCourseDay1Time(time1);
        newcourse.setCourseDay2(coDay2);
        newcourse.setCourseDay2Time(time2);
        newcourse.setCourseName(coName);
        newcourse.setCourseDetails(coDay2);

        CourseHistory.add(newcourse);
        return newcourse;
    }

}
