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

    String profNUID;
    String profName;
    String profPassword;
   
    String profEmailID;
    String profPhoneNo;
    int reputationIndex;
    String Specialty;

  
    public String getProfEmailID() {
        return profEmailID;
    }

    public void setProfEmailID(String profEmailID) {
        this.profEmailID = profEmailID;
    }

    public String getProfPhoneNo() {
        return profPhoneNo;
    }

    public void setProfPhoneNo(String profPhoneNo) {
        this.profPhoneNo = profPhoneNo;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String Specialty) {
        this.Specialty = Specialty;
    }

    public int getReputationIndex() {
        return reputationIndex;
    }

    public void setReputationIndex(int reputationIndex) {
        this.reputationIndex = reputationIndex;
    }

    public String getProfNUID() {
        return profNUID;
    }

    public void setProfNUID(String profNUID) {
        this.profNUID = profNUID;
    }

    public String getPassword() {
        return String.valueOf(profPassword);
    }

    public void setPassword(String password) {
        this.profPassword = password;
    }

}
