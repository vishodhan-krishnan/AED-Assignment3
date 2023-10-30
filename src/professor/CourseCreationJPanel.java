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
        CourseNameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Time2ComboBox = new javax.swing.JComboBox<>();
        Time1ComboBox = new javax.swing.JComboBox<>();
        Day2ComboBox = new javax.swing.JComboBox<>();
        Day1ComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        CourseStartDateTxt = new javax.swing.JTextField();
        CourseEndDatext = new javax.swing.JTextField();
        btnSaveCourse = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TermComboBox = new javax.swing.JComboBox<>();
        CourseRegion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CourseDescTxt = new javax.swing.JTextArea();

        jLabel1.setText("Select Term");

        jLabel4.setText("Select time");

        jLabel5.setText("Name of Course");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Course Creation Panel");

        jLabel7.setText("Course Details");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Course Schedule");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("2 days a week for 2 hours");

        jLabel10.setText("Select day 1");

        jLabel11.setText("Select day 2");

        jLabel12.setText("Select time");

        Time2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9 AM- 11 AM", "11 30 PM - 1 30 PM", "2 PM -  4 PM", "4 30 PM - 6 30 PM", "7 PM - 9 PM", " " }));

        Time1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9 AM- 11 AM", "11 30 PM - 1 30 PM", "2 PM -  4 PM", "4 30 PM - 6 30 PM", "7 PM - 9 PM", " " }));

        Day2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));

        Day1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));

        jLabel13.setText("Course Start date");

        jLabel14.setText("Course End Date");

        CourseStartDateTxt.setEditable(false);
        CourseStartDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseStartDateTxtActionPerformed(evt);
            }
        });

        CourseEndDatext.setEditable(false);
        CourseEndDatext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseEndDatextActionPerformed(evt);
            }
        });

        btnSaveCourse.setText("Save course details");
        btnSaveCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCourseActionPerformed(evt);
            }
        });

        jButton2.setText("Add new course");

        TermComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fall 2023", "Spring 2024", " " }));
        TermComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TermComboBoxActionPerformed(evt);
            }
        });

        CourseRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseRegionActionPerformed(evt);
            }
        });

        jLabel15.setText("Region");

        CourseDescTxt.setColumns(20);
        CourseDescTxt.setRows(5);
        jScrollPane1.setViewportView(CourseDescTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(111, 111, 111))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CourseStartDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGap(85, 85, 85)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(CourseEndDatext, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 125, Short.MAX_VALUE))))
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
                                .addComponent(CourseNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel15)
                                .addGap(33, 33, 33)
                                .addComponent(CourseRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(34, 34, 34)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Day1ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Day2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Time1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Time2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSaveCourse)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addComponent(CourseNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaveCourse)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(58, 58, 58)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseEndDatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseStartDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Day1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(Time1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Day2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(Time2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(87, 87, 87))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CourseStartDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseStartDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseStartDateTxtActionPerformed

    private void CourseEndDatextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseEndDatextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseEndDatextActionPerformed

    private void btnSaveCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCourseActionPerformed

        String Term = null,name = null,courseDesc = null,day1 = null,day2 = null,time1 = null,time2 = null,Region=null;

        if (TermComboBox.getSelectedItem() != null) {
            Term = (String) TermComboBox.getSelectedItem();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a term");
        }

        if (CourseNameTxt.getText() != null) {

            if (CourseNameTxt.getText().matches("^[a-zA-Z]+$")) {
                name = CourseNameTxt.getText();
            } else {
                JOptionPane.showMessageDialog(this, "Please enter only string input");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please select a term");
        }

        if (CourseDescTxt.getText() != null) {

            courseDesc = CourseNameTxt.getText();

        } else {
            JOptionPane.showMessageDialog(this, "Please select a term");
        }

        if (Term.equals("Fall 2023")) {
            String SDate = "7 Sepetember 2023";
            String EDate = "16 December 2023";
            CourseStartDateTxt.setText(SDate);
            CourseEndDatext.setText(EDate);
        }
        if (Term.equals("Spring 2024")) {
            String SDate = "7 Sepetember 2023";
            String EDate = "16 December 2023";
            CourseStartDateTxt.setText(SDate);
            CourseEndDatext.setText(EDate);
        }

        if (Day1ComboBox.getSelectedItem().equals(Day2ComboBox.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "Please select different days for the schedule");
        } else {

            day1 = (String) Day1ComboBox.getSelectedItem();
            day2 = (String) Day2ComboBox.getSelectedItem();
            time1 = (String) Time1ComboBox.getSelectedItem();
            time2 = (String) Time2ComboBox.getSelectedItem();
            Region = (String) CourseRegion.getText();
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

    private void CourseRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseRegionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CourseDescTxt;
    private javax.swing.JTextField CourseEndDatext;
    private javax.swing.JTextField CourseNameTxt;
    private javax.swing.JTextField CourseRegion;
    private javax.swing.JTextField CourseStartDateTxt;
    private javax.swing.JComboBox<String> Day1ComboBox;
    private javax.swing.JComboBox<String> Day2ComboBox;
    private javax.swing.JComboBox<String> TermComboBox;
    private javax.swing.JComboBox<String> Time1ComboBox;
    private javax.swing.JComboBox<String> Time2ComboBox;
    private javax.swing.JButton btnSaveCourse;
    private javax.swing.JButton jButton2;
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
    // End of variables declaration//GEN-END:variables
}