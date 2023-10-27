/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.admin;


import Business.course.Course;
import java.util.ArrayList;

/**
 *
 * @author pchok
 */
public class StudentDetails {
    ArrayList<Student> sd;
    
    public StudentDetails(){
        sd= new ArrayList<>();
    }
    
    public void addStudentToStudentDir(Student student){
        sd.add(student);
    }
    
    public void removeStudentFromStudentDir(Student student){
        sd.remove(student);
    }
    
    public Student getStudentByUserId(String user_id){
        for(Student student : sd)
            if(student.getUser_id().equals(user_id))
                return student;
        return null;     
    }
    
    public boolean doesStudentProfileExist(String student_id){
        for(Student student : sd)
            if(student.getUser_id().equals(student_id))
                return true;
        return false;
    }

    public Iterable<Course> getCourses() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getStudentID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    
}
