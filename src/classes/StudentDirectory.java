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
public class StudentDirectory {

    private ArrayList<Student> StudentDirectory;

    public ArrayList<Student> getStudentDirectory() {
        return StudentDirectory;
    }

    public void setStudentDirectory(ArrayList<Student> StudentDirectory) {
        this.StudentDirectory = StudentDirectory;
    }

    public Student addStudent(String NUID, String password) {
        Student s = new Student();
        StudentDirectory.add(s);
        return s;
    }

    public Student searchStudent(String nuid) {
        for (Student s : StudentDirectory) {
            if (s.getNUID().equals(nuid)) {
                return s;
            }
        }
        return null;
    }
    
    public void deleteStudent(Student s){
    StudentDirectory.remove(s);
    }
    
    

}
