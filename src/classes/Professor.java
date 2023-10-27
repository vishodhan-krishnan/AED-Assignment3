/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author visho
 */
public class Professor {
    
    String profname;
    String profUserName;
    String password;
    
    Arraylist<CourseCreation> course;
    
    

    public String getProfname() {
        return profname;
    }

    public void setProfname(String profname) {
        this.profname = profname;
    }

    public String getProfUserName() {
        return profUserName;
    }

    public void setProfUserName(String profUserName) {
        this.profUserName = profUserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Arraylist<CourseCreation> getCourse() {
        return course;
    }

    public void setCourse(Arraylist<CourseCreation> course) {
        this.course = course;
    }
   
            

    
    
}
