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
public class CourseLoad {

    private ArrayList<CourseInfo> CourseLoad;

    public CourseLoad() {
        this.CourseLoad = new ArrayList<>();
    }

    public ArrayList<CourseInfo> getCourseLoad() {
        return CourseLoad;
    }

    public void setCourseLoad(ArrayList<CourseInfo> CourseLoad) {
        this.CourseLoad = CourseLoad;
    }

    public CourseInfo addCourseLoad(Integer coID, String coName, String coDesc, String pName, boolean ExamOrProject) {
        CourseInfo c = new CourseInfo(coID, coName, coDesc, pName,ExamOrProject);
        CourseLoad.add(c);
        return c;
    }

}
