/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface.Studnet;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.admin.ProfessorDirectory;
import Business.admin.Student;
import Business.admin.StudentDirectory;
import Business.course.CourseCatalog;

/**
 *
 * @author pchok
 */
public class StudentLoginPage extends javax.swing.JPanel {

    /**
     * Creates new form AdminLandingPage
     */
    JPanel userProcessContainer;
    StudentDirectory studentDir;
    ProfessorDirectory facultyDir;
    CourseCatalog courseCatalog;

    public StudentLoginPage(JPanel userProcessContainer, StudentDirectory studentDir, ProfessorDirectory facultyDir, CourseCatalog courseCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.studentDir = studentDir;
        this.facultyDir = facultyDir;
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

        studentIdTextField = new javax.swing.JTextField();
        pwdTextField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        loginBtn.setText("Sign In");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Password :");

        jLabel2.setText("Student ID :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(studentIdTextField)
                        .addComponent(pwdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(loginBtn)
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String student_id = this.studentIdTextField.getText();
        String pwd = String.valueOf(this.pwdTextField.getPassword());
        if (student_id.isBlank() || pwd.isBlank()) {
            JOptionPane.showMessageDialog(this, "Admin id or password is empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Student student = studentDir.getStudentByUserId(student_id);
            if (student != null) {
                if (student.getPwd().equals(pwd) && student.getIsAccActive()==true) {
                    StudentLandingPage studentProfileJPanel = new StudentLandingPage(userProcessContainer, courseCatalog, student);
                    userProcessContainer.add("studentProfileJPanel", studentProfileJPanel);
                    CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
                    cardLayout.next(userProcessContainer);
                } else {
                    JOptionPane.showMessageDialog(this, "Student id or password is incorrect", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Student Account does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField pwdTextField;
    private javax.swing.JTextField studentIdTextField;
    // End of variables declaration//GEN-END:variables
}
