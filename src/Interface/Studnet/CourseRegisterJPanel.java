/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface.Studnet;

import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.admin.Student;
import Business.course.Course;

/**
 *
 * @author pchok
 */
public class CourseRegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CourseRegisterJPanel
     */
    private Course course;
    private JPanel userProcessContainer;
    private Student student;

    public CourseRegisterJPanel(JPanel userProcessContainer, Course course, Student student) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.course = course;
        this.student = student;
        courseIdTextArea.setText(Integer.toString(course.getCourseId()));
        courseNameTextArea.setText(course.getCourseName());
        facultyNameTextArea.setText(course.getFaculty().getFull_name());
        regionTextArea.setText(course.getRegion());
        langTextArea.setText(course.getLang());
        creditsTextArea.setText(String.valueOf(course.getCredit()));
        priceTextArea.setText(String.valueOf(course.getPrice()));
        ratingTextArea.setText(String.valueOf(course.getFaculty().getRating()));

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
        courseIdTextArea = new javax.swing.JTextField();
        courseNameTextArea = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        facultyNameTextArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        regionTextArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        langTextArea = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        creditsTextArea = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ratingTextArea = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        priceTextArea = new javax.swing.JTextField();

        jLabel1.setText("View Course Details");

        jLabel2.setText("Course ID");

        jLabel3.setText("Course Name");

        courseIdTextArea.setEditable(false);

        courseNameTextArea.setEditable(false);
        courseNameTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseNameTextAreaActionPerformed(evt);
            }
        });

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Faculty");

        facultyNameTextArea.setEditable(false);
        facultyNameTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyNameTextAreaActionPerformed(evt);
            }
        });

        jLabel5.setText("Region");

        regionTextArea.setEditable(false);
        regionTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionTextAreaActionPerformed(evt);
            }
        });

        jLabel6.setText("Language");

        langTextArea.setEditable(false);
        langTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                langTextAreaActionPerformed(evt);
            }
        });

        jLabel7.setText("Credits");

        creditsTextArea.setEditable(false);
        creditsTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsTextAreaActionPerformed(evt);
            }
        });

        jLabel8.setText("Rating");

        ratingTextArea.setEditable(false);
        ratingTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingTextAreaActionPerformed(evt);
            }
        });

        jLabel9.setText("Price");

        priceTextArea.setEditable(false);
        priceTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(facultyNameTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(courseNameTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(46, 46, 46)
                                .addComponent(courseIdTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(regionTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(langTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(creditsTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ratingTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(priceTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jButton1)))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(creditsTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(courseIdTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(courseNameTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(priceTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(facultyNameTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ratingTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(regionTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(langTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(51, 51, 51)
                .addComponent(backBtn)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);

    }//GEN-LAST:event_backBtnActionPerformed

    private void facultyNameTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyNameTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyNameTextAreaActionPerformed

    private void regionTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionTextAreaActionPerformed

    private void langTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_langTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_langTextAreaActionPerformed

    private void creditsTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditsTextAreaActionPerformed

    private void ratingTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingTextAreaActionPerformed

    private void priceTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextAreaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        student.addCourseToStudent(course);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void courseNameTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseNameTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseNameTextAreaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField courseIdTextArea;
    private javax.swing.JTextField courseNameTextArea;
    private javax.swing.JTextField creditsTextArea;
    private javax.swing.JTextField facultyNameTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField langTextArea;
    private javax.swing.JTextField priceTextArea;
    private javax.swing.JTextField ratingTextArea;
    private javax.swing.JTextField regionTextArea;
    // End of variables declaration//GEN-END:variables
}
