/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro;

import Chat.Cliente;
import javax.swing.JFrame;
/**
 *
 * @author Erick
 */


public class Registro extends JFrame {

    /**
     * Creates new form Usuario
     */
    public Registro() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        CajaPuerto = new javax.swing.JTextField();
        CajaIp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnGo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CajaPuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaPuertoActionPerformed(evt);
            }
        });
        getContentPane().add(CajaPuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 150, -1));

        CajaIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaIpActionPerformed(evt);
            }
        });
        getContentPane().add(CajaIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 150, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Puerto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setLabelFor(CajaIp);
        jLabel2.setText("IP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/PREBECHAT.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        BtnGo.setText("Iniciar");
        BtnGo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGoMouseClicked(evt);
            }
        });
        BtnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick .LAPTOP-3QCCTCO7\\Desktop\\PrebeChat\\fondo.jpg")); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1400, 800));
        jLabel4.setMinimumSize(new java.awt.Dimension(1400, 800));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CajaPuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaPuertoActionPerformed
    
    }//GEN-LAST:event_CajaPuertoActionPerformed
       //public int ip=0, puerto=0;
      // Prueba p = new Prueba();
    private void BtnGoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGoMouseClicked
       // ip =Integer.parseInt(this.CajaPuerto.getText());
        //puerto=Integer.parseInt(this.CajaIp.getText());
        
       // p.setIp(ip);
        //p.setPuerto(puerto);
        
       // Sale.setText(Integer.toString(p.getIp()));
        
       
        ////////////////////////////
      Chat.Cliente c = new Chat.Cliente();
      c.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_BtnGoMouseClicked
    public static String address = "localhost";
    public static int port = 9999;
    private void BtnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGoActionPerformed
            address=CajaIp.getText();
            port=Integer.parseInt(CajaPuerto.getText());
          
    }//GEN-LAST:event_BtnGoActionPerformed

    private void CajaIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaIpActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGo;
    private javax.swing.JTextField CajaIp;
    private javax.swing.JTextField CajaPuerto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables

    private void ServidorChat(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
