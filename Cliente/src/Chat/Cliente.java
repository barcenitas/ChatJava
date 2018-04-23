package Chat;

import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import java.lang.*;



public class Cliente extends JFrame
{
   String username=""; 
    ArrayList<String> users = new ArrayList();
  
    Boolean isConnected = false;
    
    Socket sock;
    BufferedReader reader;
    PrintWriter writer;
    
    //--------------------------//
    
    public void ListenThread() 
    {
         Thread IncomingReader = new Thread(new IncomingReader());
         IncomingReader.start();
    }
    
    //--------------------------//
    
    public void userAdd(String data) 
    {
         users.add(data);
    }
    
    //--------------------------//
    
    public void userRemove(String data) 
    {
         ta_chat.append(data + " is now offline.\n");
    }
    
    //--------------------------//
    
    public void writeUsers() 
    {
         String[] tempList = new String[(users.size())];
         users.toArray(tempList);
         for (String token:tempList) 
         {
             //users.append(token + "\n");
         }
    }

    
    public Cliente() 
    {
        initComponents();
    }
    

    
    public class IncomingReader implements Runnable
    {
        @Override
        public void run() 
        {
            String[] data;
            String stream, done = "Done", connect = "Connect", disconnect = "Disconnect", chat = "Chat";

            try 
            {
                
                while ((stream = reader.readLine()) != null) 
                {
                     data = stream.split(":");

                     if (data[2].equals(chat)) 
                     {
                        ta_chat.append(data[0] + ": " + data[1] + "\n");
                        ta_chat.setCaretPosition(ta_chat.getDocument().getLength());
                     } 
                     else if (data[2].equals(connect))
                     {
                        ta_chat.removeAll();
                        userAdd(data[0]);
                     } 
                     else if (data[2].equals(disconnect)) 
                     {
                         userRemove(data[0]);
                     } 
                     else if (data[2].equals(done)) 
                     {
                        
                        writeUsers();
                        users.clear();
                     }
                }
           }catch(Exception e) { }
        }
    }

    //--------------------------//
    
    @SuppressWarnings("")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CajaPuerto = new javax.swing.JTextField();
        CajaIp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnGo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lb_username = new javax.swing.JLabel();
        lb_address = new javax.swing.JLabel();
        tf_address = new javax.swing.JTextField();
        tf_username = new javax.swing.JTextField();
        lb_port = new javax.swing.JLabel();
        tf_port = new javax.swing.JTextField();
        b_connect = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tf_chat = new javax.swing.JTextField();
        b_send = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_chat = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        b_disconnect = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        CajaPuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaPuertoActionPerformed(evt);
            }
        });

        CajaIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaIpActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Puerto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("IP");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Registro/PREBECHAT.jpg"))); // NOI18N

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

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick .LAPTOP-3QCCTCO7\\Desktop\\PrebeChat\\fondo.jpg")); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(1400, 800));
        jLabel6.setMinimumSize(new java.awt.Dimension(1400, 800));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick .LAPTOP-3QCCTCO7\\Desktop\\PrebeChat\\SI.jpg")); // NOI18N
        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat - Client's frame");
        setMaximumSize(new java.awt.Dimension(2147483647, 800));
        setName("client"); // NOI18N
        setPreferredSize(new java.awt.Dimension(295, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_username.setForeground(new java.awt.Color(255, 255, 255));
        lb_username.setText("USUARIO");
        jPanel1.add(lb_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, -1));

        lb_address.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_address.setForeground(new java.awt.Color(255, 255, 255));
        lb_address.setText("IP");
        jPanel1.add(lb_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, -1));

        tf_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_addressActionPerformed(evt);
            }
        });
        jPanel1.add(tf_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 89, -1));

        tf_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 89, 23));

        lb_port.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_port.setForeground(new java.awt.Color(255, 255, 255));
        lb_port.setText("PUERTO:");
        jPanel1.add(lb_port, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, -1));

        tf_port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_portActionPerformed(evt);
            }
        });
        jPanel1.add(tf_port, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 90, -1));

        b_connect.setText("CONECTAR");
        b_connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_connectActionPerformed(evt);
            }
        });
        jPanel1.add(b_connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick .LAPTOP-3QCCTCO7\\Desktop\\PrebeChat\\PREBECHAT.jpg")); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 290, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick .LAPTOP-3QCCTCO7\\Desktop\\PrebeChat\\IU.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 260, 370));

        jTabbedPane1.addTab("LOG IN", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_chatActionPerformed(evt);
            }
        });
        jPanel2.add(tf_chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 150, 30));

        b_send.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Chat/PREBECHAT.jpg"))); // NOI18N
        b_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sendActionPerformed(evt);
            }
        });
        jPanel2.add(b_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 321, 50, 30));

        ta_chat.setColumns(20);
        ta_chat.setRows(5);
        jScrollPane1.setViewportView(ta_chat);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 370));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick .LAPTOP-3QCCTCO7\\Desktop\\PrebeChat\\fondo.jpg")); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 300, 150));

        jTabbedPane1.addTab("CHAT", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_disconnect.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b_disconnect.setForeground(new java.awt.Color(0, 204, 204));
        b_disconnect.setText("ABANDONAR");
        b_disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_disconnectActionPerformed(evt);
            }
        });
        jPanel3.add(b_disconnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 140, 90));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick .LAPTOP-3QCCTCO7\\Desktop\\PrebeChat\\SI.jpg")); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 370));

        jTabbedPane1.addTab("LOG OUT", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 390));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick .LAPTOP-3QCCTCO7\\Desktop\\PrebeChat\\aj.jpg")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public static String address = "localhost";
    public static int port = 9999;
    private void b_disconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_disconnectActionPerformed
      //  sendDisconnect();
        //Disconnect();
        System.exit(0);
    }//GEN-LAST:event_b_disconnectActionPerformed

    private void b_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sendActionPerformed
        String nothing = "";
        if ((tf_chat.getText()).equals(nothing)) {
            tf_chat.setText("");
            tf_chat.requestFocus();
        } else {
            try {
               writer.println(username + ":" + tf_chat.getText() + ":" + "chat");
               writer.flush(); // flushes the buffer
            } catch (Exception ex) {
                ta_chat.append("El mensaje no fué enviado \n");
            }
            tf_chat.setText("");
            tf_chat.requestFocus();
        }

        tf_chat.setText("");
        tf_chat.requestFocus();
    }//GEN-LAST:event_b_sendActionPerformed

    private void tf_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_chatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_chatActionPerformed

    private void CajaPuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaPuertoActionPerformed

    }//GEN-LAST:event_CajaPuertoActionPerformed

    private void CajaIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaIpActionPerformed

    private void BtnGoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGoMouseClicked
        // ip =Integer.parseInt(this.CajaPuerto.getText());
        //puerto=Integer.parseInt(this.CajaIp.getText());

        // p.setIp(ip);
        //p.setPuerto(puerto);

        // Sale.setText(Integer.toString(p.getIp()));

        ////////////////////////////
       /* Chat.Cliente c = new Chat.Cliente();
        c.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_BtnGoMouseClicked

    private void BtnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGoActionPerformed
        //address=CajaIp.getText();
//        port=Integer.parseInt(CajaPuerto.getText());

    }//GEN-LAST:event_BtnGoActionPerformed

    private void tf_portActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_portActionPerformed

    }//GEN-LAST:event_tf_portActionPerformed

    private void b_connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_connectActionPerformed
        if (isConnected == false)
        {
            username = tf_username.getText();
            tf_username.setEditable(false);
            address=tf_address.getText();
            port=Integer.parseInt(tf_port.getText());

            try
            {
                sock = new Socket(address, port);
                InputStreamReader streamreader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(streamreader);
                writer = new PrintWriter(sock.getOutputStream());
                writer.println(username + ":se ha conectado");
                writer.flush();
                isConnected = true;
            }
            catch (Exception ex)
            {
                ta_chat.append("Error 404\n");
                tf_username.setEditable(true);
            }

            ListenThread();

        } else if (isConnected == true)
        {
            ta_chat.append("Ya estás conectado\n");
        }
    }//GEN-LAST:event_b_connectActionPerformed

    private void tf_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_addressActionPerformed

    }//GEN-LAST:event_tf_addressActionPerformed

    private void tf_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_usernameActionPerformed

    }//GEN-LAST:event_tf_usernameActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new Cliente().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGo;
    private javax.swing.JTextField CajaIp;
    private javax.swing.JTextField CajaPuerto;
    private javax.swing.JButton b_connect;
    private javax.swing.JButton b_disconnect;
    private javax.swing.JButton b_send;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb_address;
    private javax.swing.JLabel lb_port;
    private javax.swing.JLabel lb_username;
    private javax.swing.JTextArea ta_chat;
    private javax.swing.JTextField tf_address;
    private javax.swing.JTextField tf_chat;
    private javax.swing.JTextField tf_port;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
