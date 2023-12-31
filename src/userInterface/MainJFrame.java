/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userInterface;

import classes.CourseCreationHistory;
import classes.Professor;
import classes.Student;
import classes.StudentDirectory;
import java.awt.CardLayout;



/**
 *
 * @author visho
 */
public class MainJFrame extends javax.swing.JFrame {
    
    CourseCreationHistory cch;
    Professor prof;
    StudentDirectory SDirectory;
    Student studentdetails;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        this.cch = new CourseCreationHistory();
        this.prof = new Professor();
        this.SDirectory= new StudentDirectory();
        this.studentdetails = new Student();
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

        jSplitPane1 = new javax.swing.JSplitPane();
        btnJPanel = new javax.swing.JPanel();
        btnWelcome = new javax.swing.JButton();
        workAreaContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setMaximumSize(new java.awt.Dimension(1000, 800));
        jSplitPane1.setMinimumSize(new java.awt.Dimension(1000, 800));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1000, 800));

        btnJPanel.setBackground(new java.awt.Color(0, 255, 51));
        btnJPanel.setMaximumSize(new java.awt.Dimension(1000, 200));
        btnJPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        btnJPanel.setPreferredSize(new java.awt.Dimension(1000, 200));

        btnWelcome.setText("WELCOME");
        btnWelcome.setMaximumSize(new java.awt.Dimension(100, 25));
        btnWelcome.setMinimumSize(new java.awt.Dimension(100, 25));
        btnWelcome.setPreferredSize(new java.awt.Dimension(150, 50));
        btnWelcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWelcomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnJPanelLayout = new javax.swing.GroupLayout(btnJPanel);
        btnJPanel.setLayout(btnJPanelLayout);
        btnJPanelLayout.setHorizontalGroup(
            btnJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnJPanelLayout.createSequentialGroup()
                .addContainerGap(798, Short.MAX_VALUE)
                .addComponent(btnWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        btnJPanelLayout.setVerticalGroup(
            btnJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnJPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(btnJPanel);

        workAreaContainer.setBackground(new java.awt.Color(0, 102, 204));
        workAreaContainer.setMinimumSize(new java.awt.Dimension(600, 300));
        workAreaContainer.setPreferredSize(new java.awt.Dimension(1000, 800));
        workAreaContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workAreaContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWelcomeActionPerformed
        LoginJPanel panel = new LoginJPanel(workAreaContainer,cch,prof,studentdetails);
        workAreaContainer.add("LoginJPanel",panel);
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        layout.next(workAreaContainer);
    }//GEN-LAST:event_btnWelcomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnJPanel;
    public javax.swing.JButton btnWelcome;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel workAreaContainer;
    // End of variables declaration//GEN-END:variables
}
