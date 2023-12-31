/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import admin.adminHomepageJPanel;
import classes.CourseCreationHistory;
import classes.Professor;
import classes.ProfessorDirectory;
import classes.Student;
import classes.StudentDirectory;
import professor.professorHomepageJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.mindrot.jbcrypt.BCrypt;
import student.HomepageJPanel;

/**
 *
 * @author visho
 */
public class LoginJPanel extends javax.swing.JPanel {

    private JPanel workareaContainer;
    StudentDirectory studentDir;
    ProfessorDirectory Pdirectory;
    CourseCreationHistory cch;
    Professor prof;
    Student studentdetails;

    /**
     * Creates new form SecondJPanel
     */
    public LoginJPanel(JPanel jPanel, CourseCreationHistory cch, Professor prof, Student studentdetails) {
        studentDir = new StudentDirectory();
        studentDir.addStudent( "Student1","123456", BCrypt.hashpw("123456", BCrypt.gensalt()), "stud1@neu.edu", "1234512345");
        studentDir.addStudent( "Student2","123", BCrypt.hashpw("123", BCrypt.gensalt()), "stud2@neu.edu", "123123123");
        studentDir.addStudent( "Student3","1234", BCrypt.hashpw("1234", BCrypt.gensalt()), "stud3@neu.edu", "1111122222");

        Pdirectory = new ProfessorDirectory();
        Pdirectory.addProfessor("Prof1", "1234", BCrypt.hashpw("1234", BCrypt.gensalt()),"Java", "prof1@neu.edu", "1234123412");
        Pdirectory.addProfessor("Prof2", "123", BCrypt.hashpw("123", BCrypt.gensalt()),"Software Dev", "prof2@neu.edu", "1231231231");
        Pdirectory.addProfessor("Prof1", "12345", BCrypt.hashpw("12345", BCrypt.gensalt()),"Python", "prof3@neu.edu", "1234512345");


        this.workareaContainer = jPanel;
        this.cch = cch;
        this.prof = prof;
        this.studentdetails = studentdetails;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNUID = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ddRoleSelector = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();

        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome! Please login to continue");

        jLabel2.setText("NUID:");

        jLabel3.setText("PASSWORD:");

        LoginBtn.setText("LOGIN");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("ROLE:");

        ddRoleSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Professor", "Admin" }));
        ddRoleSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddRoleSelectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(329, 329, 329))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNUID)
                            .addComponent(ddRoleSelector, 0, 126, Short.MAX_VALUE)
                            .addComponent(txtPassword))
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(447, 447, 447))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNUID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ddRoleSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(430, 430, 430))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        if (ddRoleSelector.getSelectedItem().equals("Student")) {
            studentdetails = studentDir.validateStudentLogin(txtNUID.getText(), txtPassword.getPassword());
            if (studentdetails == null) {
                JOptionPane.showMessageDialog(this, "Student does not exist! \n or Incorrect credentials! ");
                txtNUID.setText("");
                txtPassword.setText("");
            } else {

                JOptionPane.showMessageDialog(this, "Login Successful!");
                txtNUID.setText("");
                txtPassword.setText("");
                HomepageJPanel hjp = new HomepageJPanel(workareaContainer, cch, prof, studentdetails, studentDir);
                workareaContainer.add("HomepageJPanel", hjp);
                CardLayout layout = (CardLayout) workareaContainer.getLayout();
                layout.next(workareaContainer);
            }
        } else if (ddRoleSelector.getSelectedItem().equals("Professor")) {
            prof = Pdirectory.validateProfessorLogin(txtNUID.getText(), txtPassword.getPassword());
            if (prof == null) {
                JOptionPane.showMessageDialog(this, "Professor does not exist! \n or Incorrect credentials! ");
                txtNUID.setText("");
                txtPassword.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                professorHomepageJPanel hjp = new professorHomepageJPanel(workareaContainer, studentDir, cch, prof);
                workareaContainer.add("professorHomepageJPanel", hjp);
                CardLayout layout = (CardLayout) workareaContainer.getLayout();
                layout.next(workareaContainer);

            }
        } else if (ddRoleSelector.getSelectedItem().equals("Admin")) {
            if (txtNUID.getText().equals("admin") && (String.valueOf(txtPassword.getPassword())).equals("admin")) {
                adminHomepageJPanel hjp = new adminHomepageJPanel(workareaContainer, studentDir, Pdirectory);
                workareaContainer.add("adminHomepageJPanel", hjp);
                CardLayout layout = (CardLayout) workareaContainer.getLayout();
                layout.next(workareaContainer);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials!");
            }

        }


    }//GEN-LAST:event_LoginBtnActionPerformed

    private void ddRoleSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddRoleSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddRoleSelectorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JComboBox<String> ddRoleSelector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JTextField txtNUID;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

}
