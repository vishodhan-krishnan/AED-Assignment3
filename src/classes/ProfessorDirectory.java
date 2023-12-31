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
public class ProfessorDirectory {

    private ArrayList<Professor> ProfDirectory;
    

    public ProfessorDirectory() {
        this.ProfDirectory = new ArrayList<>();
        
        
    }

    public ArrayList<Professor> getProfDirectory() {
        return ProfDirectory;
    }

    public void setProfDirectory(ArrayList<Professor> ProfDirectory) {
        this.ProfDirectory = ProfDirectory;
    }

    public Professor addProfessor(String profName, String profNUID, String password,String specialty, String EmailID, String phoneNo) {
        Professor p = new Professor();
        p.setProfName(profName);
        p.setProfNUID(profNUID);
        p.setPassword(password);
        p.setSpecialty(specialty);
        p.setProfEmailID(EmailID);
        p.setProfPhoneNo(phoneNo);
        ProfDirectory.add(p);
        return p;
    }

    public Professor searchProf(String nuid) {
        for (Professor p : ProfDirectory) {
            if (p.getProfNUID().equals(nuid)) {
                return p;
            }
        }
        return null;
    }

    

    public Professor validateProfessorLogin(String NUID, char[] Password) {
        for (Professor logincred : ProfDirectory) {
            if (logincred.getProfNUID().equals(NUID) &&
                    BCrypt.checkpw(String.valueOf(Password), (String) logincred.getPassword().toString()))
                return logincred;
        }

        return null;

    }

}

