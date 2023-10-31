/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package classes;

import classes.CourseCreation;
import classes.CourseCreationHistory;
import classes.Professor;
import classes.Student;
import classes.StudentDirectory;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pchok
 */
public class GradeCoursesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GradeCoursesJPanel
     */
    JPanel workareaContainer;
    Professor prof;
    StudentDirectory studentDir;
    CourseCreationHistory cch;
    HashMap<String, ArrayList> studentCourseHashMap;

    public GradeCoursesJPanel(JPanel jp, StudentDirectory studentDir, CourseCreationHistory CourseHistory, Professor prof) {
        this.prof = prof;
        this.cch = CourseHistory;
        this.workareaContainer = jp;
        this.studentDir = studentDir;
        this.studentCourseHashMap = studentCourseHashMap;

        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FacultyJTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        txtGrade = new javax.swing.JTextField();
        txtUserid = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(0, 0, 0));

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back <");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        FacultyJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Course", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(FacultyJTable);

        txtSearch.setBackground(new java.awt.Color(204, 204, 204));
        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Student ID");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Course");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Grade");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));

        txtCourseName.setBackground(new java.awt.Color(204, 204, 204));
        txtCourseName.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtCourseName.setForeground(new java.awt.Color(0, 0, 0));
        txtCourseName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));

        txtGrade.setBackground(new java.awt.Color(204, 204, 204));
        txtGrade.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtGrade.setForeground(new java.awt.Color(0, 0, 0));
        txtGrade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));

        txtUserid.setBackground(new java.awt.Color(204, 204, 204));
        txtUserid.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtUserid.setForeground(new java.awt.Color(0, 0, 0));
        txtUserid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));

        txtName.setBackground(new java.awt.Color(204, 204, 204));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnUpdate)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSearch, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnUpdate)
                .addContainerGap(169, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        workareaContainer.remove(this);
        ((java.awt.CardLayout) workareaContainer.getLayout()).previous(workareaContainer);
        //       ((java.awt.CardLayout)CardSequencePanel.getLayout()).show(CardSequencePanel, "IdentifyEventTypes");

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchQuery = txtSearch.getText();
        boolean resultFound = false;
        for (Student student : studentDir.getStudentDirectory()) {
            if (searchQuery.equals(student.getStudentNUID())) {
                txtCourseName.setText(student.getSelectedCourse().getCourseName());
                txtUserid.setText(student.getStudentNUID());
                //                txtName.setText(student.getStudentName());
                //                txtGrade.setText(student.getGrade());
                resultFound = true;
                break;
            }
        }
        if (!resultFound) {
            JOptionPane.showMessageDialog(this, "Student does not exist.");
            txtCourseName.setText("");
            txtUserid.setText("");
            txtName.setText("");
            txtGrade.setText("");
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String studentName = txtName.getText();
        String courseName = txtCourseName.getText();
        String updatedGradeText = txtGrade.getText();

        if (studentName.isEmpty() || courseName.isEmpty() || updatedGradeText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }

        try {
            double updatedGrade = Double.parseDouble(updatedGradeText);

            // Find the student in your list of students by name
            StudentDirectory studentToUpdate = null;
//            for (StudentDirectory student : students) {
//                if (student.getName().equals(studentName)) {
//                    studentToUpdate = student;
//                    break;
//                }
//            }

            if (studentToUpdate == null) {
                JOptionPane.showMessageDialog(this, "Student not found.");
            } else {
                // Find and update the grade for the specified course
                boolean courseFound = false;
//                for (Course course : studentToUpdate.getCourses()) {
//                    if (course.getCourseName().equals(courseName)) {
//                        course.setGrade(updatedGrade);
//                        courseFound = true;
//                        break;
//                    }
//                }

                if (courseFound) {
                    // Update the table with the new data
                    populateTable();
                    JOptionPane.showMessageDialog(this, "Grade updated successfully.");
                } else {
                    JOptionPane.showMessageDialog(this, "Course not found for the student.");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid grade value. Please enter a numeric value.");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FacultyJTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtGrade;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUserid;
    // End of variables declaration//GEN-END:variables
  private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) FacultyJTable.getModel();
        dtm.setRowCount(0);
        for (Student s : studentDir.getStudentDirectory()) {
            System.out.println(s.getStudentName());
            System.out.println(s.getEnrolledCourses(s.getStudentNUID()));
            System.out.println(s.getSelectedCoursesList());
            System.out.println(s.getSelectedCourse());
        }

        for (Student student : studentDir.getStudentDirectory()) {
            for (CourseCreation cc : student.getSelectedCoursesList()) {
                Object[] row = new Object[4];
                row[0] = student.getStudentNUID();
                row[2] = cc.getCourseName();
//            row[1] = student.getName();
//            row[2] = course.getCourseName();
//            row[3] = course.getGrade();
                dtm.addRow(row);
            }

        }
    }

}