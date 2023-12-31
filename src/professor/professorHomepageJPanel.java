/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package professor;

import classes.CourseCreationHistory;
import classes.Professor;
import classes.StudentDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author visho
 */
public class professorHomepageJPanel extends javax.swing.JPanel {
    public JPanel workareaContainer;
    CourseCreationHistory CourseHistory;
    Professor prof;
    StudentDirectory studentDir;
    /**
     * Creates new form facultyHomePageJPanel
     */
    public professorHomepageJPanel(JPanel workareaContainer, StudentDirectory studentDir, CourseCreationHistory cch,Professor prof) {
        this.workareaContainer = workareaContainer;
        this.studentDir = studentDir;
        this.CourseHistory = cch;
        this.prof = prof;
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

        btnCreateCourses = new javax.swing.JButton();
        btnRegisterCourses = new javax.swing.JButton();
        btnGraduate = new javax.swing.JButton();
        btnViewTranscript = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 800));

        btnCreateCourses.setText("CREATE COURSES");
        btnCreateCourses.setPreferredSize(new java.awt.Dimension(150, 50));
        btnCreateCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCoursesActionPerformed(evt);
            }
        });

        btnRegisterCourses.setText("REGISTER COURSES");
        btnRegisterCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCoursesActionPerformed(evt);
            }
        });

        btnGraduate.setText("GRADE COURSEWORK");
        btnGraduate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraduateActionPerformed(evt);
            }
        });

        btnViewTranscript.setText("VIEW TRANSCRIPT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnViewTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131)
                .addComponent(btnRegisterCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btnGraduate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegisterCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGraduate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addComponent(btnViewTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCoursesActionPerformed
        // TODO add your handling code here:
        CourseCreationJPanel panel = new CourseCreationJPanel( workareaContainer, CourseHistory, prof );
        workareaContainer.add("DisplayCoursesJPanel",panel);
        CardLayout layout = (CardLayout) workareaContainer.getLayout();
        layout.next(workareaContainer);
    }//GEN-LAST:event_btnCreateCoursesActionPerformed

    private void btnRegisterCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCoursesActionPerformed
        // TODO add your handling code here:
//        RegisterCoursesJPanel panel = new RegisterCoursesJPanel(workareaContainer,cch);
//        workareaContainer.add("RegisterCoursesJPanel",panel);
//        CardLayout layout = (CardLayout) workareaContainer.getLayout();
//        layout.next(workareaContainer);
    }//GEN-LAST:event_btnRegisterCoursesActionPerformed

    private void btnGraduateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraduateActionPerformed
        // TODO add your handling code here:
        
        GradeCoursesJPanel panel = new GradeCoursesJPanel( workareaContainer,studentDir, CourseHistory, prof );
        workareaContainer.add("GradeCoursesCoursesJPanel",panel);
        CardLayout layout = (CardLayout) workareaContainer.getLayout();
        layout.next(workareaContainer);
    }//GEN-LAST:event_btnGraduateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCourses;
    private javax.swing.JButton btnGraduate;
    private javax.swing.JButton btnRegisterCourses;
    private javax.swing.JButton btnViewTranscript;
    // End of variables declaration//GEN-END:variables
}
