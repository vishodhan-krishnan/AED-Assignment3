/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package student;

import classes.CourseCreation;
import classes.Student;
import classes.StudentDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author visho
 */
public class DisplayCoursesJPanel extends javax.swing.JPanel {

    public JPanel workareaContainer;
    StudentDirectory studentdir;
    Student studentdetails;
    HashMap map;
    ArrayList<CourseCreation> ccList;
    ProfFeedbackJPanel feedbackJPanel;
    ArrayList<String> completedcourseList;

    /**
     * Creates new form displayCoursesJPanel
     */
    public DisplayCoursesJPanel(JPanel jPanel, Student studentdetails, StudentDirectory studentdir) {
        this.workareaContainer = jPanel;
        this.studentdir = studentdir;
        this.studentdetails = studentdetails;
        initComponents();
        btnMarkCourseCompleted.setEnabled(false);
        btnRateProfessor.setEnabled(false);
        btnUpdateRI.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRateProfessor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCourseDetails = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDisplayCourses = new javax.swing.JButton();
        btnMarkCourseCompleted = new javax.swing.JButton();
        btnUpdateRI = new javax.swing.JButton();

        btnRateProfessor.setText("RATE PROFESSOR");
        btnRateProfessor.setPreferredSize(new java.awt.Dimension(150, 50));
        btnRateProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRateProfessorActionPerformed(evt);
            }
        });

        jScrollPane2.setPreferredSize(new java.awt.Dimension(500, 400));

        tableCourseDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Course Name", "Professor Name", "Day 1", "Day 1 Time", "Day 2", "Day 2 Time", "Credits"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableCourseDetails.setPreferredSize(new java.awt.Dimension(300, 210));
        jScrollPane2.setViewportView(tableCourseDetails);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Enrolled courses");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnBack.setText("BACK");
        btnBack.setPreferredSize(new java.awt.Dimension(150, 50));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDisplayCourses.setText("VIEW");
        btnDisplayCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayCoursesActionPerformed(evt);
            }
        });

        btnMarkCourseCompleted.setText("<html>MARK COURSES  <br>AS COMPLETE</html>");
        btnMarkCourseCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkCourseCompletedActionPerformed(evt);
            }
        });

        btnUpdateRI.setText("UPDATE");
        btnUpdateRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(389, 389, 389))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnUpdateRI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnRateProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnMarkCourseCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnDisplayCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMarkCourseCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRateProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDisplayCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdateRI, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(134, 134, 134)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workareaContainer.remove(this);
        CardLayout layout = (CardLayout) workareaContainer.getLayout();
        layout.previous(workareaContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDisplayCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayCoursesActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableCourseDetails.getModel();
        model.setRowCount(0);
        map = studentdetails.getMapStudenttoCourse();
        //studentdetails will contain only logincred of the current student logged in
        ccList = (ArrayList) map.get(studentdetails.getStudentNUID());

        for (CourseCreation cc : ccList) {
            Object[] row = new Object[8];
            row[0] = cc;
//            row[1] = cc.getCourseName();
            row[1] = cc.getProf().getProfName();
            row[2] = cc.getCourseDay1();
            row[3] = cc.getCourseDay1Time();
            row[4] = cc.getCourseDay2();
            row[5] = cc.getCourseDay2Time();
            row[6] = cc.getCourseCredits();
            model.addRow(row);
        }
        btnMarkCourseCompleted.setEnabled(true);


    }//GEN-LAST:event_btnDisplayCoursesActionPerformed

    private void btnRateProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRateProfessorActionPerformed
        // TODO add your handling code here:
//        ProfFeedbackJPanel panel = new ProfFeedbackJPanel();
//        workareaContainer.add("ProfRIJPanel", panel);
//        CardLayout layout = (CardLayout) workareaContainer.getLayout();
//        layout.next(workareaContainer);
        DefaultTableModel model = (DefaultTableModel) tableCourseDetails.getModel();
        tableCourseDetails.removeColumn(tableCourseDetails.getColumn("Day 1"));
        tableCourseDetails.removeColumn(tableCourseDetails.getColumn("Course Name"));
        tableCourseDetails.removeColumn(tableCourseDetails.getColumn("Day 1 Time"));
        tableCourseDetails.removeColumn(tableCourseDetails.getColumn("Day 2"));
        tableCourseDetails.removeColumn(tableCourseDetails.getColumn("Day 2 Time"));

        tableCourseDetails.getColumnModel().getColumn(1).setHeaderValue("Reputation Index");
        tableCourseDetails.setEditingColumn(1);
        

        btnUpdateRI.setVisible(true);


    }//GEN-LAST:event_btnRateProfessorActionPerformed

    private void btnMarkCourseCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkCourseCompletedActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) tableCourseDetails.getModel();
        completedcourseList = new ArrayList<>();

        int completedCourseIndex = tableCourseDetails.getSelectedRow();

        if (completedCourseIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a course !");

        } else {
            CourseCreation completedCourse = (CourseCreation) model.getValueAt(completedCourseIndex, 0);
            completedCourse.setCourseCompleted(true);
            completedcourseList.add(completedCourse.getProf().getProfNUID());
            JOptionPane.showMessageDialog(this, "Courses marked as completed!");

        }

        btnRateProfessor.setEnabled(true);

    }//GEN-LAST:event_btnMarkCourseCompletedActionPerformed

    private void btnUpdateRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRIActionPerformed
        // TODO add your handling code here:
        Set<CourseCreation> ccSet = new HashSet<>(ccList);
        ccSet.forEach(cc -> {
            Object[] row = new Object[2];
            row[0] = cc.getProf().getProfName();
            
            if (Integer.parseInt( row[1].toString()) < 0 || Integer.parseInt(row[1].toString()) > 5) {
                JOptionPane.showMessageDialog(this, "Invalid rating!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                cc.getProf().setReputationIndex(Integer.parseInt((String) row[1]));
            }
        });
        
    }//GEN-LAST:event_btnUpdateRIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDisplayCourses;
    private javax.swing.JButton btnMarkCourseCompleted;
    private javax.swing.JButton btnRateProfessor;
    private javax.swing.JButton btnUpdateRI;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableCourseDetails;
    // End of variables declaration//GEN-END:variables
}
