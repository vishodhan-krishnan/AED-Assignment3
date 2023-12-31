/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package student;

import classes.CourseCreationHistory;
import classes.CourseCreation;
import classes.Student;
import classes.StudentDirectory;
import java.awt.CardLayout;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author visho
 */
public class RegisterCoursesJPanel extends javax.swing.JPanel {

    JPanel workareaContainer;
    CourseCreationHistory cc;
    StudentDirectory studentdir;
    Student studentdetails;
    
    

    /**
     * Creates new form RegisterJPanel
     */
    public RegisterCoursesJPanel(JPanel workareaContainer, CourseCreationHistory cc, Student studentdetails, StudentDirectory studentdir) {
        this.workareaContainer = workareaContainer;
        this.cc = cc;
        this.studentdir = studentdir;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablenewCourseDetails = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboTermSelect = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(801, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Register for new courses");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 400));

        tablenewCourseDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Credits", "Location", "Prof Name", "Prof RI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablenewCourseDetails.setPreferredSize(new java.awt.Dimension(300, 210));
        jScrollPane1.setViewportView(tablenewCourseDetails);

        btnViewDetails.setText("VIEW");
        btnViewDetails.setPreferredSize(new java.awt.Dimension(150, 50));
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Select Term:");

        comboTermSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fall", "Spring" }));
        comboTermSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTermSelectActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.setPreferredSize(new java.awt.Dimension(150, 50));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1)
                .addGap(291, 291, 291))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(comboTermSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboTermSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboTermSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTermSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTermSelectActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workareaContainer.remove(this);
        CardLayout layout = (CardLayout) workareaContainer.getLayout();
        layout.previous(workareaContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tablenewCourseDetails.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a course to register.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tablenewCourseDetails.getModel();
        CourseCreation registeredCourse = (CourseCreation) model.getValueAt(selectedRowIndex, 0);
        Student student = new Student();

        student.setSelectedCourse(registeredCourse); //Only updating the arrayList
        studentdetails.addCourseToStudent(registeredCourse); //Updating the arraylist AND THE HASHMAP

//        cc.registerCourse(selectedcourse);
//        displayTable();
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JComboBox<String> comboTermSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablenewCourseDetails;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tablenewCourseDetails.getModel();
        model.setRowCount(0);
        for (CourseCreation courseinfo : cc.getCourseHistory()) {
            Object[] row = new Object[6];
            row[0] = courseinfo;
            row[1] = 4; //credits
            row[2] = courseinfo.getCourseRegion();
            row[3] = courseinfo.getProf().getProfName();
            row[4] = courseinfo.getProf().getReputationIndex();

            model.addRow(row);
        }

    }
}
