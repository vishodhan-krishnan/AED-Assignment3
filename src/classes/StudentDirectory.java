/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author visho
 */
public class StudentDirectory {

    private ArrayList<Student> StudentDirectory;
    StudentDirectory sd;

    public StudentDirectory() {
        this.StudentDirectory = new ArrayList<>();
        
        
    }

    public ArrayList<Student> getStudentDirectory() {
        return StudentDirectory;
    }

    public void setStudentDirectory(ArrayList<Student> StudentDirectory) {
        this.StudentDirectory = StudentDirectory;
    }

    public Student addStudent(String NUID, String password) {
        Student s = new Student();
        s.setNUID(NUID);
        s.setPassword(password);
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

    public void deleteStudent(Student s) {
        StudentDirectory.remove(s);
    }

    public boolean validateStudentLogin(String NUID, char[] Password) {
        for (Student logincred : StudentDirectory) {
            if (logincred.getNUID().equals(NUID) && BCrypt.checkpw(String.valueOf(Password), logincred.getPassword()))
                return true;
        }

        return false;

    }

}
