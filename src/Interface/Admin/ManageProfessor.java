/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface.Admin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.admin.Professor;
import Business.admin.ProfessorDetails;
import Business.admin.Student;

/**
 *
 * @author pchok
 */
public class ManageProfessor extends javax.swing.JPanel {

    JPanel userProcessContainer;
    ProfessorDetails facultyDir;
    Professor faculty;

    /**
     * Creates new form ManageFaculty
     */
    public ManageProfessor(JPanel userProcessContainer, ProfessorDetails facultyDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.facultyDir = facultyDir;
        this.hideInOutPanel.setVisible(false);
        this.hideInOutPanel.setVisible(false);
        this.isAccDisabled.setEnabled(false);
        this.saveBtn.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createFacultyBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        facultyIdTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        hideInOutPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pwdTextArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        facultyIdTextArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        isAccDisabled = new javax.swing.JRadioButton();
        updateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        createFacultyBtn.setText("Create  a Professor Profile");
        createFacultyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFacultyBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("or");

        jLabel2.setText("Edit a Professor Profile");

        jLabel3.setText("Professor ID");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        hideInOutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Professor ID");
        hideInOutPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, 72, -1));

        pwdTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdTextAreaActionPerformed(evt);
            }
        });
        hideInOutPanel.add(pwdTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 55, 125, -1));

        jLabel5.setText("Password :");
        hideInOutPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 58, 102, -1));
        hideInOutPanel.add(facultyIdTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 15, 125, -1));

        jLabel6.setText("Disable Login");
        hideInOutPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 102, 102, -1));
        hideInOutPanel.add(isAccDisabled, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        hideInOutPanel.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        hideInOutPanel.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(createFacultyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(facultyIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn)
                            .addComponent(hideInOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(backBtn)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(createFacultyBtn)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facultyIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(searchBtn)
                .addGap(18, 18, 18)
                .addComponent(hideInOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createFacultyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFacultyBtnActionPerformed
        // TODO add your handling code here:
        CreateProfessorLogin createFacultyCredentials = new CreateProfessorLogin(userProcessContainer, facultyDir);
        userProcessContainer.add("createFacultyCredentials", createFacultyCredentials);
        ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_createFacultyBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);

    }//GEN-LAST:event_backBtnActionPerformed

    private void pwdTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdTextAreaActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        updateBtn.setEnabled(false);
        saveBtn.setEnabled(true);
        facultyIdTextArea.setEditable(true);
        pwdTextArea.setEditable(true);
        isAccDisabled.setEnabled(true);

    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String faculty_id = facultyIdTextArea.getText();
        String pwd = pwdTextArea.getText();
        Boolean isAccountDisabled = isAccDisabled.isSelected();
        if (faculty_id.isBlank() || pwd.isBlank()) {
            JOptionPane.showMessageDialog(this, "Credentials cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            this.faculty.setFaculty_id(faculty_id);
            this.faculty.setPwd(pwd);
            this.faculty.setIsAccActive(!isAccountDisabled);
            JOptionPane.showMessageDialog(this, "Information Saved Successfully");
            hideInOutPanel.setVisible(false);
            facultyIdTextArea.setEditable(false);
            pwdTextArea.setEditable(false);
            saveBtn.setEnabled(false);
            updateBtn.setEnabled(true);
            facultyIdTextField.setText("");
            facultyIdTextArea.setText("");
            pwdTextArea.setText("");

        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String id = facultyIdTextField.getText();
        if (id == null) {
            JOptionPane.showMessageDialog(this, "Id cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Professor faculty = facultyDir.getFacultyByFacultyId(id);
            if (faculty == null) {
                JOptionPane.showMessageDialog(this, "Faculty ID NOT FOUND", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                this.faculty = faculty;
                this.isAccDisabled.setEnabled(false);
                this.isAccDisabled.setSelected(!this.faculty.getIsAccActive());
                this.facultyIdTextArea.setText(id);
                this.pwdTextArea.setText(faculty.getPwd());
                hideInOutPanel.setVisible(true);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createFacultyBtn;
    private javax.swing.JTextField facultyIdTextArea;
    private javax.swing.JTextField facultyIdTextField;
    private javax.swing.JPanel hideInOutPanel;
    private javax.swing.JRadioButton isAccDisabled;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField pwdTextArea;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
