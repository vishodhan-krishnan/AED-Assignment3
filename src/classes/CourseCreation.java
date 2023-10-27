/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Saiyam Doshi
 */
public class CourseCreation {
    String term;
    //String CourseID;
    String CourseName;
    String CourseDetails;
    String CourseStartDate;
    String CourseEndDate;
    String CourseDay1;
    String CourseDay1Time;
    String CourseDay2;
    String CourseDay2Time;
    Professor prof;
    String region;

    public Professor getProf() {
        return prof;
    }

//    public String getCourseID() {
    public void setProf(Professor prof) {
        this.prof = prof;
    }

//        return CourseID;
//    }
//
//    public void setCourseID(String CourseID) {
//        this.CourseID = CourseID;
//    }
    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getCourseDetails() {
        return CourseDetails;
    }

    public void setCourseDetails(String CourseDetails) {
        this.CourseDetails = CourseDetails;
    }

    public String getCourseDay1() {
        return CourseDay1;
    }

    public void setCourseDay1(String CourseDay1) {
        this.CourseDay1 = CourseDay1;
    }

    public String getCourseDay1Time() {
        return CourseDay1Time;
    }

    public void setCourseDay1Time(String CourseDay1Time) {
        this.CourseDay1Time = CourseDay1Time;
    }

    public String getCourseDay2() {
        return CourseDay2;
    }

    public void setCourseDay2(String CourseDay2) {
        this.CourseDay2 = CourseDay2;
    }

    public String getCourseDay2Time() {
        return CourseDay2Time;
    }

    public void setCourseDay2Time(String CourseDay2Time) {
        this.CourseDay2Time = CourseDay2Time;
    }
    
}
