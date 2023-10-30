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

    private String term;
    private String CourseName;
    private String CourseCredits;
    private String CourseRegion;
    private String CourseDetails;
    private String CourseStartDate, CourseEndDate;
    private String CourseDay1, CourseDay1Time, CourseDay2, CourseDay2Time;
    Professor prof;
    private String grades;
    private boolean assessmentType = false; //false if project; True if Exam

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    
    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public String getCourseCredits() {
        return CourseCredits;
    }

    public void setCourseCredits(String CourseCredits) {
        this.CourseCredits = CourseCredits;
    }

    public String getCourseRegion() {
        return CourseRegion;
    }

    public void setCourseRegion(String CourseRegion) {
        this.CourseRegion = CourseRegion;
    }

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
    
     @Override
    public String toString(){
        return CourseName;
    }

}
