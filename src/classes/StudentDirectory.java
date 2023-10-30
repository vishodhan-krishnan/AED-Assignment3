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

    public Student addStudent(String Name ,String NUID,String password, String EmailID, String PhoneNo) {
        Student s = new Student();
        s.setStudentName(Name);
        s.setStudentNUID(NUID);
        s.setStudentPassword(password);
        s.setStudentEmailID(EmailID);
        s.setStudentPhoneNo(PhoneNo);
        StudentDirectory.add(s);
        return s;
    }

    public Student searchStudent(String nuid) {
        for (Student s : StudentDirectory) {
            if (s.getStudentNUID().equals(nuid)) {
                return s;
            }
        }
        return null;
    }

    public void deleteStudent(Student s) {
        StudentDirectory.remove(s);
    }

    public Student validateStudentLogin(String NUID, char[] Password) {
        for (Student logincred : StudentDirectory) {
            if (logincred.getStudentNUID().equals(NUID) && BCrypt.checkpw(String.valueOf(Password), logincred.getStudentPassword()))
                return logincred;
        }

        return null;

    }
    
   

}
