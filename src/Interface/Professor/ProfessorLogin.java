/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface.Professor;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.admin.ProfessorDetails;
import Business.admin.StudentDetails;
import Business.course.CourseCatalog;
import Business.admin.Professor;

/**
 *
 * @author pchok
 */
public class ProfessorLogin extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorLogin
     */
    JPanel userProcessContainer;
    StudentDetails sd;
    ProfessorDetails pd;
    CourseCatalog courseCatalog;

    public ProfessorLogin(JPanel userProcessContainer, StudentDetails sd, ProfessorDetails pd, CourseCatalog courseCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.sd = sd;
        this.pd = pd;
        this.courseCatalog = courseCatalog;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProfessorID = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        txtProfessorID = new javax.swing.JTextField();
        lblProfessorPassword = new javax.swing.JLabel();
        txtprofessorpassword = new javax.swing.JTextField();

        lblProfessorID.setText("Professor ID");

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        lblProfessorPassword.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProfessorID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtProfessorID))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProfessorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginBtn)
                                .addGap(0, 96, Short.MAX_VALUE))
                            .addComponent(txtprofessorpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfessorID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProfessorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfessorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprofessorpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(loginBtn)
                .addContainerGap(389, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String faculty_id = txtProfessorID.getText();
        String pwd = txtprofessorpassword.getText();
        if (faculty_id.isBlank() || pwd.isBlank())
            JOptionPane.showMessageDialog(this, "Textfields cannot be left empty!", "ERROR", JOptionPane.ERROR_MESSAGE);
        else {
            Professor faculty = this.pd.getFacultyByFacultyId(faculty_id);
            if (faculty != null) {
                if (faculty.getPwd().equals(pwd) && faculty.getIsAccActive()==true) {
                    ProfessordashboardJPaanel Professordashboard = new ProfessordashboardJPaanel(userProcessContainer, sd, faculty, courseCatalog);
                    this.userProcessContainer.add("Professordashboard", Professordashboard);
                    ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
                } else {
                    JOptionPane.showMessageDialog(this, "Faculty id or password incorrect", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblProfessorID;
    private javax.swing.JLabel lblProfessorPassword;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField txtProfessorID;
    private javax.swing.JTextField txtprofessorpassword;
    // End of variables declaration//GEN-END:variables
}
