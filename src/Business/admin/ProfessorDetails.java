/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.admin;

import java.util.ArrayList;

/**
 *
 * @author kal
 */
public class ProfessorDetails {

    ArrayList<Professor> facultyDir;

    public ProfessorDetails() {
        facultyDir = new ArrayList<>();
    }

    public void addFacultyToFacultyDir(Professor faculty) {
        facultyDir.add(faculty);
    }

    public void removeStudentFromStudentDir(Professor faculty) {
        facultyDir.remove(faculty);
    }

    public Professor getFacultyByFacultyId(String faculty_id) {
        for (Professor faculty : facultyDir) {
            if (faculty.getFaculty_id().equals(faculty_id)) {
                return faculty;
            }
        }
        return null;
    }

    public boolean doesFacultyProfileExist(String faculty_id) {
        for (Professor faculty : facultyDir) {
            if (faculty.getFaculty_id().equals(faculty_id)) {
                return true;
            }
        }
        return false;
    }
}
