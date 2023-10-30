/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transcript;

import classes.StudentDirectory;
import classes.ProfessorDirectory;
import classes.Professor;
import classes.Student;

/**
 *
 * @author pchok
 */
public class Business {

    String name;
    StudentDirectory studentdirectory; //all people profiles regardless of the role

    ProfessorDirectory professordirectory;

    public Business(String n) {
        name = n;

        studentdirectory = new StudentDirectory();
        professordirectory = new ProfessorDirectory(this);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentDirectory getStudentdirectory() {
        return studentdirectory;
    }

    public void setStudentdirectory(StudentDirectory studentdirectory) {
        this.studentdirectory = studentdirectory;
    }

    public ProfessorDirectory getProfessordirectory() {
        return professordirectory;
    }

    public void setProfessordirectory(ProfessorDirectory professordirectory) {
        this.professordirectory = professordirectory;
    }

    



}
