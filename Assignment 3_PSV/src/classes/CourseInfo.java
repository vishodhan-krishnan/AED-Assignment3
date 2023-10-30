/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author visho
 */
public class CourseInfo {
    
    Integer courseID;
    String courseName;
    String courseDesc;
    String profName;
    boolean assessmentType = false; //false if project; True if Exam
    
    
    public CourseInfo(Integer coID, String coName, String coDesc, String pName, boolean examOrProject){
        courseID = coID;
        courseName = coName;
        courseDesc = coDesc;
        profName = pName;
        assessmentType = examOrProject;
     
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public boolean isAssessmentType() {
        return assessmentType;
    }

    public void setAssessmentType(boolean assessmentType) {
        this.assessmentType = assessmentType;
    }
  

    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDetails() {
        return courseDesc;
    }

    public void setCourseDetails(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }
    
 
    
    
    
    
    
    
}
