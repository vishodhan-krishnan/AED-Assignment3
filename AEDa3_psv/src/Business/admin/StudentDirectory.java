/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.admin;


import java.util.ArrayList;

/**
 *
 * @author pchok
 */
public class StudentDirectory {
    ArrayList<Student> studentDir;
    
    public StudentDirectory(){
        studentDir= new ArrayList<>();
    }
    
    public void addStudentToStudentDir(Student student){
        studentDir.add(student);
    }
    
    public void removeStudentFromStudentDir(Student student){
        studentDir.remove(student);
    }
    
    public Student getStudentByUserId(String user_id){
        for(Student student : studentDir)
            if(student.getUser_id().equals(user_id))
                return student;
        return null;     
    }
    
    public boolean doesStudentProfileExist(String student_id){
        for(Student student : studentDir)
            if(student.getUser_id().equals(student_id))
                return true;
        return false;
    }
  
    
}
