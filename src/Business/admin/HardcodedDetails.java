/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.admin;

/**
 *
 * @author pchok
 */
public class HardcodedDetails {

    StudentDetails sd;
    ProfessorDetails pd;

    public HardcodedDetails(StudentDetails sd, ProfessorDetails pd) {

        this.sd = sd;
        this.pd = pd;

        Student student = new Student();
        student.setDomain("MSIS");
        student.setFull_name("Bruce Wayne");
        student.setUser_id("batman");
        student.setPwd("batman");
        sd.addStudentToStudentDir(student);
        System.out.println("Profile created for : " + student);

        Professor faculty = new Professor();
        faculty.setFull_name("Kal Bug");
        faculty.setSpeciality("Java");
        faculty.setFaculty_id("KB01");
        faculty.setPwd("boom");
        this.pd.addFacultyToFacultyDir(faculty);
        System.out.println("Profile created for : " + faculty);
    }

}
