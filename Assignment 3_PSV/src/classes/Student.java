/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author visho
 */
public class Student {

    String studentNUID;
    String studentName;
    String password;
    String studentEmailID;
    String studentPhoneNo;
    boolean isProfessor=false;
    CourseCreation selectedCourse;
    ArrayList<CourseCreation> selectedCoursesList;
    Professor prof;
    HashMap<String, ArrayList> mapStudenttoCourse;
   
    public Student() {
        this.selectedCourse = new CourseCreation();
        this.selectedCoursesList = new ArrayList<>();
        this.prof = new Professor();
        mapStudenttoCourse = new HashMap();
        
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmailID() {
        return studentEmailID;
    }

    public void setStudentEmailID(String studentEmailID) {
        this.studentEmailID = studentEmailID;
    }

    public String getStudentPhoneNo() {
        return studentPhoneNo;
    }

    public void setStudentPhoneNo(String studentPhoneNo) {
        this.studentPhoneNo = studentPhoneNo;
    }

    public boolean isIsProfessor() {
        return isProfessor;
    }

    public void setIsProfessor(boolean isProfessor) {
        this.isProfessor = isProfessor;
    }
    
 

    public HashMap<String, ArrayList> getMapStudenttoCourse() {
        return mapStudenttoCourse;
    }

    public void setMapStudenttoCourse(HashMap<String, ArrayList> mapStudenttoCourse) {
        this.mapStudenttoCourse = mapStudenttoCourse;
    }
    

    public ArrayList<CourseCreation> getSelectedCoursesList() {
        return selectedCoursesList;
    }

    public void setSelectedCoursesList(ArrayList selectedCoursesList) {
        this.selectedCoursesList = selectedCoursesList;
    }

    public CourseCreation getSelectedCourse() {
        return selectedCourse;
    }

    public void setSelectedCourse(CourseCreation selectedCourse) {
        this.selectedCourse = selectedCourse;
    }

    public String getStudentNUID() {
        return studentNUID;
    }

    public void setStudentNUID(String studentNUID) {
        this.studentNUID = studentNUID;
    }

    public String getStudentPassword() {
        return String.valueOf(password);
    }

    public void setStudentPassword(String password) {
        this.password = password;
    }
    
     public void addCourseToStudent(CourseCreation newCourse) {
        for (CourseCreation course : selectedCoursesList) {
            if (newCourse.getCourseName().equals(course.getCourseName())) {
                JOptionPane.showMessageDialog(null, "This Course has already been registered", "Warning", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        selectedCoursesList.add(newCourse);
        mapStudenttoCourse.put(studentNUID, selectedCoursesList);
         
        JOptionPane.showMessageDialog(null, "Course has been registered successfully!");

    }
     
      public ArrayList getEnrolledCourses(String studentNUID) {

        return mapStudenttoCourse.get(studentNUID);

    }

}
