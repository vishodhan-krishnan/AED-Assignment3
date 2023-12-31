/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package professor;

import classes.CourseCreation;
import classes.CourseCreationHistory;
import classes.Professor;
import classes.ProfessorDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saiyam Doshi
 */
public class CourseCreationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CourseCreationJPanel
     */
    private JPanel workareaContainer;
    CourseCreationHistory CourseHistory;
    Professor prof;

    public CourseCreationJPanel(JPanel workareaContainer, CourseCreationHistory CourseHistory, Professor prof) {
        this.workareaContainer = workareaContainer;
        this.CourseHistory = CourseHistory;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comboBoxTime2 = new javax.swing.JComboBox<>();
        comboBoxTime1 = new javax.swing.JComboBox<>();
        comboBoxDay2 = new javax.swing.JComboBox<>();
        comboBoxDay1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCourseStartDate = new javax.swing.JTextField();
        txtCourseEndDate = new javax.swing.JTextField();
        btnSaveCourse = new javax.swing.JButton();
        btnAddNewCourse = new javax.swing.JButton();
        TermComboBox = new javax.swing.JComboBox<>();
        txtCourseRegion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCourseDetails = new javax.swing.JTextArea();

        jLabel1.setText("Select Term");

        jLabel4.setText("Select time");

        jLabel5.setText("Name of Course");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Course Creation Panel");

        jLabel7.setText("Course Details");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Course Schedule");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("2 days a week for 2 hours");

        jLabel10.setText("Select day 1");

        jLabel11.setText("Select day 2");

        jLabel12.setText("Select time");

        comboBoxTime2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9 AM- 11 AM", "11 30 PM - 1 30 PM", "2 PM -  4 PM", "4 30 PM - 6 30 PM", "7 PM - 9 PM", " " }));

        comboBoxTime1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9 AM- 11 AM", "11 30 PM - 1 30 PM", "2 PM -  4 PM", "4 30 PM - 6 30 PM", "7 PM - 9 PM", " " }));

        comboBoxDay2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));

        comboBoxDay1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));

        jLabel13.setText("Course Start date");

        jLabel14.setText("Course End Date");

        txtCourseStartDate.setEditable(false);
        txtCourseStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseStartDateActionPerformed(evt);
            }
        });

        txtCourseEndDate.setEditable(false);
        txtCourseEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseEndDateActionPerformed(evt);
            }
        });

        btnSaveCourse.setText("Save course details");
        btnSaveCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCourseActionPerformed(evt);
            }
        });

        btnAddNewCourse.setText("Add new course");

        TermComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fall 2023", "Spring 2024", " " }));
        TermComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TermComboBoxActionPerformed(evt);
            }
        });

        txtCourseRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseRegionActionPerformed(evt);
            }
        });

        jLabel15.setText("Region");

        txtCourseDetails.setColumns(20);
        txtCourseDetails.setRows(5);
        jScrollPane1.setViewportView(txtCourseDetails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(535, 535, 535))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCourseStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(119, 119, 119)
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCourseEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel7))
                                            .addComponent(jLabel2))
                                        .addGap(608, 608, 608)))
                                .addGap(0, 125, Short.MAX_VALUE))))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addComponent(TermComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(37, 37, 37)
                                .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel15)
                                .addGap(33, 33, 33)
                                .addComponent(txtCourseRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(34, 34, 34)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboBoxDay1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(btnSaveCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddNewCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TermComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCourseRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCourseEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourseStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(comboBoxTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(comboBoxTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveCourse)
                    .addComponent(btnAddNewCourse))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCourseStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseStartDateActionPerformed

    private void txtCourseEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseEndDateActionPerformed

    private void btnSaveCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCourseActionPerformed

        String Term = null,name = null,courseDesc = null,day1 = null,day2 = null,time1 = null,time2 = null,Region=null;

        if (TermComboBox.getSelectedItem() != null) {
            Term = (String) TermComboBox.getSelectedItem();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a term");
        }

        if (txtCourseName.getText() != null) {

            if (txtCourseName.getText().matches("^[a-zA-Z]+$")) {
                name = txtCourseName.getText();
            } else {
                JOptionPane.showMessageDialog(this, "Please enter only string input");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please select a term");
        }

        if (txtCourseDetails.getText() != null) {

            courseDesc = txtCourseName.getText();

        } else {
            JOptionPane.showMessageDialog(this, "Please select a term");
        }

        if (Term.equals("Fall 2023")) {
            String SDate = "7 Sepetember 2023";
            String EDate = "16 December 2023";
            txtCourseStartDate.setText(SDate);
            txtCourseEndDate.setText(EDate);
        }
        if (Term.equals("Spring 2024")) {
            String SDate = "7 Sepetember 2023";
            String EDate = "16 December 2023";
            txtCourseStartDate.setText(SDate);
            txtCourseEndDate.setText(EDate);
        }

        if (comboBoxDay1.getSelectedItem().equals(comboBoxDay2.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "Please select different days for the schedule");
        } else {

            day1 = (String) comboBoxDay1.getSelectedItem();
            day2 = (String) comboBoxDay2.getSelectedItem();
            time1 = (String) comboBoxTime1.getSelectedItem();
            time2 = (String) comboBoxTime2.getSelectedItem();
            Region = (String) txtCourseRegion.getText();
        }
        //Add region code here

        if (Term != null && name != null && courseDesc != null && day1 != null && day2 != null && time1 != null && time2 != null) {
            CourseCreation create = CourseHistory.AddNewCourse();
            create.setCourseDay1(day1);
            create.setCourseDay1Time(time1);
            create.setCourseName(name);
            create.setCourseDay2(day2);
            create.setCourseDay2Time(time2);
            create.setCourseDetails(courseDesc);
            create.setTerm(Term);
            create.setCourseRegion(Region);
            create.setProf(prof);
            System.out.println(prof.getProfNUID());

        }


    }//GEN-LAST:event_btnSaveCourseActionPerformed

    private void TermComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TermComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TermComboBoxActionPerformed

    private void txtCourseRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseRegionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TermComboBox;
    private javax.swing.JButton btnAddNewCourse;
    private javax.swing.JButton btnSaveCourse;
    private javax.swing.JComboBox<String> comboBoxDay1;
    private javax.swing.JComboBox<String> comboBoxDay2;
    private javax.swing.JComboBox<String> comboBoxTime1;
    private javax.swing.JComboBox<String> comboBoxTime2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtCourseDetails;
    private javax.swing.JTextField txtCourseEndDate;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtCourseRegion;
    private javax.swing.JTextField txtCourseStartDate;
    // End of variables declaration//GEN-END:variables
}
