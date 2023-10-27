/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.course;

import Business.admin.Professor;

/**
 *
 * @author pchok
 */
public class Course {

    private int courseId;
    private String courseName;
    private int credit;
    private float price;
    private String region;
    private String lang;
    Professor professor;
    private String semester;
    private HashMap<Student, Double> studentMarks = new HashMap<>();

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Professor getFaculty() {
        return professor;
    }

    public void setFaculty(Professor professor) {
        this.professor = professor;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setStudentMarks(Student student, double marks) {
        // Ensure that marks are within the range of 0 to 4
        if (marks >= 0 && marks <= 4) {
            studentMarks.put(student, marks);
        } else {
            // Handle invalid marks, for example, show an error message.
        }
    }

    public Double getStudentMarks(Student student) {
        return studentMarks.get(student);
    }
    @Override
    public String toString() {
        return String.valueOf(courseId);
    }

    public Object getGrade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
