/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import Business.course.Course;

/**
 *
 * @author pchok
 */
public class Student {

    String full_name;
    String user_id;
    String pwd;
    String domain;
    Int grade;
    Boolean isAccActive;
    ArrayList<Course> courseList;
    Map<String, List<Course>> map;


    public Map<String, List<Course>> getMap() {
        return map;
    }

    public void setMap(Map<String, List<Course>> map) {
        this.map = map;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourseToStudent(Course newCourse) {
        for (Course course : courseList) {
            if (newCourse.getCourseId() == course.getCourseId()) {
                JOptionPane.showMessageDialog(null, "Registered Courses can't be taken again!", "Warning", JOptionPane.ERROR_MESSAGE);
                return;
            }

        }
        courseList.add(newCourse);
        map.put(newCourse.getSemester(), courseList);
        JOptionPane.showMessageDialog(null, "Course taken successfully!");

    }
    public void deleteCourseToStudent(Course newCourse) {
        courseList.remove(newCourse);
       

    }

    public Boolean getIsAccActive() {
        return isAccActive;
    }

    public void setIsAccActive(Boolean isAccActive) {
        this.isAccActive = isAccActive;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getDomain() {
        return domain;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return user_id;
    }
}
