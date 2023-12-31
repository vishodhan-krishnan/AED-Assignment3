/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package student;

import classes.CourseCreation;
import classes.Student;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author visho
 */
public class ProfFeedbackJPanel extends javax.swing.JPanel {

    public JPanel workareaContainer;
    Student studentdetails;
    HashMap map;
    ArrayList<CourseCreation> ccList;
    ArrayList<String> ProfessorsList;
    CourseCreation selectedProf;

    /**
     * Creates new form ProfRIJPanel
     */
    public ProfFeedbackJPanel(JPanel jPanel, Student studentdetails) {
        this.workareaContainer = jPanel;
        this.studentdetails = studentdetails;
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

        label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProfCourse = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProfNUID = new javax.swing.JTextField();
        txtProfName = new javax.swing.JTextField();
        txtCourseName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboBoxRI = new javax.swing.JComboBox<>();
        btnUpdateRI = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();

        label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Provide feedback for your professor");

        tableProfCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Professor NUID", "Professor Name", "Course Offered"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableProfCourse);

        jLabel1.setText("Prof NUID");

        jLabel2.setText("Prof Name");

        jLabel3.setText("Course Name");

        jLabel4.setText("Reputation Index");

        comboBoxRI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        btnUpdateRI.setText("UPDATE");
        btnUpdateRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRIActionPerformed(evt);
            }
        });

        btnViewDetails.setText("SELECT");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label)
                .addGap(208, 208, 208))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProfNUID)
                            .addComponent(txtProfName)
                            .addComponent(txtCourseName)
                            .addComponent(comboBoxRI, 0, 80, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(btnUpdateRI, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtProfNUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(txtProfName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboBoxRI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateRI, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableProfCourse.getModel();
        ProfessorsList = new ArrayList<>();
        for (CourseCreation cc : ccList) {
            if (!ProfessorsList.contains(cc.getProf().getProfName())) {
                ProfessorsList.add(cc.getProf().getProfName());
            }
        }

        int selectedProfIndex = tableProfCourse.getSelectedRow();

        if (selectedProfIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a professor to rate!");

        } else {
            selectedProf = (CourseCreation) model.getValueAt(selectedProfIndex, 0);
            txtProfNUID.setText(selectedProf.getProf().getProfNUID());
            txtProfName.setText(selectedProf.getProf().getProfName());
            txtCourseName.setText(selectedProf.getCourseName());
        }

    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnUpdateRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRIActionPerformed

        selectedProf.getProf().setReputationIndex(Integer.parseInt((String) comboBoxRI.getSelectedItem()));
        JOptionPane.showMessageDialog(this, "Feedback added successfully!");


    }//GEN-LAST:event_btnUpdateRIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateRI;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JComboBox<String> comboBoxRI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTable tableProfCourse;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtProfNUID;
    private javax.swing.JTextField txtProfName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tableProfCourse.getModel();
        model.setRowCount(0);
        map = studentdetails.getMapStudenttoCourse();
        //studentdetails will contain only logincred of the current student logged in
        ccList = (ArrayList) map.get(studentdetails.getStudentNUID());

        for (CourseCreation cc : ccList) {
            Object[] row = new Object[5];
            row[1] = cc.getProf().getProfNUID();
            row[2] = cc.getProf().getProfName();
            row[0] = cc;
            model.addRow(row);
        }

    }
}
