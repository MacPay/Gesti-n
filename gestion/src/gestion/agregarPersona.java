package gestion;
/* Importacion de las librerias que se van a usar*/
import java.util.Calendar;
import java.util.*;
/* Importacion de librerias para imagen*/
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFileChooser;


import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
/*Importacion de librerias para correo*/
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.imageio.ImageIO.read;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.filechooser.FileNameExtensionFilter;




public class agregarPersona extends javax.swing.JFrame {
    private PreparedStatement preparedStatement;
    

    public agregarPersona() {
        initComponents();
        setSize(600, 500);
        setLocationRelativeTo(null);
        setTitle("Agregar Persona");
        TextPrompt ci = new TextPrompt("12345678", txtciadd);
        TextPrompt textnom1 = new TextPrompt("Nombre", txtnombreadd);
        TextPrompt textnom2 = new TextPrompt("Segundo Nombre", txtnom2add);
        TextPrompt textape1 = new TextPrompt("Apellido", txtapellidoadd);
        TextPrompt textape2 = new TextPrompt("Segundo Apeliido", txtapellido2add);
        TextPrompt textcel = new TextPrompt("Ej: 099876543", txtceladd);
        TextPrompt textdir = new TextPrompt("Luis menoni Nº345", txtdiradd);
        TextPrompt textmail = new TextPrompt("ejemplo@ejemplo.com", txtmailadd);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblciagregar = new javax.swing.JLabel();
        lblprinom = new javax.swing.JLabel();
        lblpriapellido = new javax.swing.JLabel();
        txtciadd = new javax.swing.JTextField();
        txtnombreadd = new javax.swing.JTextField();
        txtapellidoadd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnom2add = new javax.swing.JTextField();
        txtapellido2add = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmailadd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtceladd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdiradd = new javax.swing.JTextField();
        jdt1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        lblfoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblciagregar.setText("C.I:");

        lblprinom.setText("Primer Nombre:");

        lblpriapellido.setText("Primer Apellido:");

        jLabel1.setText("Segundo Nombre:");

        jLabel2.setText("Segundo Apellido:");

        txtnom2add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnom2addActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha Nacimiento:");

        jLabel4.setText("Foto:");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Sexo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino", "Otro" }));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jLabel6.setText("Agregar Persona");

        jLabel7.setText("Correo:");

        jLabel8.setText("Celular:");

        jLabel9.setText("Dirección:");

        jdt1.setMinSelectableDate(new java.util.Date(-62135755128000L));

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnagregar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblprinom)
                                                .addComponent(lblciagregar)
                                                .addComponent(lblpriapellido)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel3))))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtceladd)
                                    .addComponent(txtapellidoadd)
                                    .addComponent(txtnombreadd)
                                    .addComponent(txtciadd))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmailadd)
                            .addComponent(txtdiradd)
                            .addComponent(txtnom2add, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtapellido2add)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)))))
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnbuscar)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblciagregar)
                            .addComponent(txtciadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtnom2add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblprinom)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtnombreadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(txtapellido2add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtapellidoadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpriapellido)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(txtmailadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtceladd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtdiradd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jdt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbuscar)
                            .addComponent(jLabel4))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(jButton2))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        //*Verifica que los campos requeridos no esten vacíos
        if (txtciadd.getText().length() != 0 && txtnombreadd.getText().length() != 0 && txtapellidoadd.getText().length() != 0){

            int numero = Integer.parseInt(txtciadd.getText());
            String insert = "insert into persona (ci, nombre, apellido,fecha_nac, fecha_ing,edad) values (?,?,?,?,?,?)";
            DateTimeFormatter fecha_ingreso = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
            /* Toma los datos del jdatechooser y los pasa a un string*/
            String dia = Integer.toString(jdt1.getCalendar().get(Calendar.DATE));
            String mes = Integer.toString(jdt1.getCalendar().get(Calendar.MONTH)+1);
            String año = Integer.toString(jdt1.getCalendar().get(Calendar.YEAR));
            String fechanac = (año + "-" + mes + "-" + dia);

            /*Toma los datos de jdatechooser(fecha de nacimiento) y la fecha actual
            y calcula la edad*/
            Date date = new Date();
            ZoneId timeZone = ZoneId.systemDefault();
            LocalDate getLocalDate = date.toInstant().atZone(timeZone).toLocalDate();
            int diff_año =  getLocalDate.getYear() - Integer.parseInt(año);
            int diff_mes =  getLocalDate.getMonthValue() - Integer.parseInt(mes);
            int diff_dia =  getLocalDate.getDayOfMonth() - Integer.parseInt(dia);
            if(diff_mes<0 ||(diff_mes==0 && diff_dia<0)){
                diff_año = diff_año-1;
            }

            try {
                /*Abre la conexion con la bd*/
                Conexion conectar = new Conexion();
                Connection conn = (Connection) conectar.getConnection();
                /*Prepara la consulta y la carga en la variable preparedStatement*/
                preparedStatement = conn.prepareStatement(insert);
                /*Coloca los datos correspondientes en las tablas*/
                preparedStatement.setInt(1, numero);
                preparedStatement.setString(2, txtnombreadd.getText());
                preparedStatement.setString(3, txtapellidoadd.getText());
                preparedStatement.setString(4, fechanac);
                preparedStatement.setObject(5, fecha_ingreso.format(LocalDateTime.now()));
                preparedStatement.setInt(6, diff_año);
                /*Ejecuta la actializacion*/
                preparedStatement.executeUpdate();

                /*Cierra el preparedStatement y la conexion a la bd*/
                preparedStatement.close();
                conn.close();
                /*Envia Mensaje de que se realizo un ingrso de persona al correo*/
                /* Creacion de propiedades de envio*/
                //                Properties props = new Properties();
                //                props.setProperty("mail.smtp.host","smtp.gmail.com");
                //                props.setProperty("mail.smtp.starttls.enable","true");
                //                props.setProperty("mail.smtp.port","587");
                //                props.setProperty("mail.smtp.auth","true");
                //                /* Crea sesion y carga las propiedades*/
                //                Session session = Session.getDefaultInstance(props);
                //
                //                /*Datos de la cuenta que envia*/
                //                String mailre = "pruebacorreojava1234@gmail.com";
                //                String passre ="MacPay12.";
                //
                //                /*Datos correo que recibe*/
                //                String correoreceptor = "castellanosmatias24@gmail.com";
                //                /*Mensaje que se envia*/
                //                String mensaje = ("Se agrego a: " +numero);
                //                String asunto ="Prueba";
                //
                //                MimeMessage message = new MimeMessage(session);
                //                message.setFrom(new InternetAddress(mailre));
                //
                //                message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoreceptor));
                //                message.setSubject(asunto);
                //                message.setText(mensaje);
                //
                //                Transport t = session.getTransport("smtp");
                //                t.connect(mailre,passre);
                //                t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
                //                t.close();
                JOptionPane.showMessageDialog(null, "Se agrego correctamente.");
                Log myLog = new Log("./log.txt");
                myLog.addLine("Se agregó a: "+ txtnombreadd.getText()+ " "+ txtapellidoadd.getText() +" " + numero);
                /*Abre la ventana anterior y cierra*/
                mainmenu newFrame = new mainmenu();
                newFrame.setVisible(true);
                this.dispose();
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error: "+ex);
            } catch (IOException ex) {
                Logger.getLogger(agregarPersona.class.getName()).log(Level.SEVERE, null, ex);
            } /*catch (AddressException ex) {
                Logger.getLogger(agregarPersona.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MessagingException ex) {
                Logger.getLogger(agregarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }else {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos vacios");
        }

    }//GEN-LAST:event_btnagregarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        mainmenu newFrame = new mainmenu();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:      
        JFileChooser elegir = new JFileChooser();
        elegir.setSize(500,500);
        
        elegir.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif"); 
        elegir.setFileFilter(imgFilter);
        String fotito = "";
        int result = elegir.showOpenDialog(this);
        if (result != JFileChooser.CANCEL_OPTION) {
            File fileName = elegir.getSelectedFile();
            
        
            if ((fileName == null) || (fileName.getName().equals(""))) {
                JOptionPane.showMessageDialog(null, "No seleccionó ninguna foto");
            } else {
                fotito= fileName.getAbsolutePath();
                File file = new File(fotito);
                try {

                    BufferedImage bufferedImage = ImageIO.read(file);                    
                    Image scaledInstance = bufferedImage.getScaledInstance(100, 100, Image.SCALE_DEFAULT);                   
                    lblfoto.setIcon(new ImageIcon(scaledInstance));
                    jPanel2.setSize(100,100);
                } catch (IOException ex) {
                    Logger.getLogger(agregarPersona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
        

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtnom2addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnom2addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom2addActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(agregarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new agregarPersona().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
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
    private com.toedter.calendar.JDateChooser jdt1;
    private javax.swing.JLabel lblciagregar;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel lblpriapellido;
    private javax.swing.JLabel lblprinom;
    private javax.swing.JTextField txtapellido2add;
    private javax.swing.JTextField txtapellidoadd;
    private javax.swing.JTextField txtceladd;
    private javax.swing.JTextField txtciadd;
    private javax.swing.JTextField txtdiradd;
    private javax.swing.JTextField txtmailadd;
    private javax.swing.JTextField txtnom2add;
    private javax.swing.JTextField txtnombreadd;
    // End of variables declaration//GEN-END:variables
}
