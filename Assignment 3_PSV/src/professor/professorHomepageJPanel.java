/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package professor;

import classes.GradeCoursesJPanel;
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

        setBackground(new java.awt.Color(255, 222, 180));
        setPreferredSize(new java.awt.Dimension(800, 800));

        btnCreateCourses.setBackground(new java.awt.Color(204, 204, 204));
        btnCreateCourses.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btnCreateCourses.setForeground(new java.awt.Color(0, 0, 0));
        btnCreateCourses.setText("CREATE COURSES");
        btnCreateCourses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        btnCreateCourses.setPreferredSize(new java.awt.Dimension(150, 50));
        btnCreateCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCoursesActionPerformed(evt);
            }
        });

        btnRegisterCourses.setBackground(new java.awt.Color(204, 204, 204));
        btnRegisterCourses.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btnRegisterCourses.setForeground(new java.awt.Color(0, 0, 0));
        btnRegisterCourses.setText("REGISTER COURSES");
        btnRegisterCourses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        btnRegisterCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCoursesActionPerformed(evt);
            }
        });

        btnGraduate.setBackground(new java.awt.Color(204, 204, 204));
        btnGraduate.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btnGraduate.setForeground(new java.awt.Color(0, 0, 0));
        btnGraduate.setText("GRADE COURSEWORK");
        btnGraduate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        btnGraduate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraduateActionPerformed(evt);
            }
        });

        btnViewTranscript.setBackground(new java.awt.Color(204, 204, 204));
        btnViewTranscript.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btnViewTranscript.setForeground(new java.awt.Color(0, 0, 0));
        btnViewTranscript.setText("VIEW TRANSCRIPT");
        btnViewTranscript.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCreateCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnGraduate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegisterCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(481, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateCourses, btnGraduate, btnRegisterCourses, btnViewTranscript});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnCreateCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegisterCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGraduate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateCourses, btnGraduate, btnRegisterCourses, btnViewTranscript});

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
