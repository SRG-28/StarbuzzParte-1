/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControlFiles;
import Model.Modulo1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.soap.Detail;

/**
 *
 * @author Sofía Rubie García 117520883
 * @author Donald Cordoba Campos 304950089
 * @author Kyara Ávalos Escobar 402340732
 * @author Ali Pitti Gózalez 402450140
 *  
 */

/* Module2
Está clase se encarga se inicia para que la cocina, en donde se tiene el boton para las órdenes, de este proceso, se brinda la opción de continuar interactuando con la aplicación.
Los botones que contiene son backorder list,detail of a particular order,
orderprocessing, report of processed orders y back.
*/
/*BackOrder
Está es una de las clases del paquete vista, mismo que se encarga de  trabajar con el paquete modulo y
con el paquete control, en donde al momento en el que el usuario solicita BackOrder List, muestra las órdenes con 
su respectivo id, nombre del cashier, clientName, status, detail de la orden y el monto de dicha orden.
*/
/*
Detail
Muestra el detalle de las órdenes, con respecto a la información de
cada uno de los datos que tiene la clase, el id de la factura, el cashier, clientName, status, detail y el cost total de cada orden.
*/
    /*Processing
Procesa y obtiene las órdenes, las puede visualizar en la cocina, con la finalidad de conviar de estado o definirlo por los encargados 
*/
/*Report
Esta clase se encarga de mostrar el reporte de todas las órdenes procesadas por  la cafetería.
*/
public class Modulo2 extends javax.swing.JFrame {
        ControlFiles controlF = new ControlFiles();
      ArrayList<Modulo1> lista = new ArrayList<Modulo1>();
    /**
     * Creates new form Modulo2
     */
    public Modulo2() {
        initComponents();
        setLocationRelativeTo(null);
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
        cuadroMostrar = new javax.swing.JTextArea();
        Pendientes = new javax.swing.JButton();
        Particular = new javax.swing.JButton();
        Proccess = new javax.swing.JButton();
        Report = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        STATUS = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Proccessing Module");

        cuadroMostrar.setColumns(20);
        cuadroMostrar.setRows(5);
        jScrollPane1.setViewportView(cuadroMostrar);

        Pendientes.setText("Backorder list");
        Pendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PendientesActionPerformed(evt);
            }
        });

        Particular.setText("Detail of a particular order");
        Particular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParticularActionPerformed(evt);
            }
        });

        Proccess.setText(" Order processing");
        Proccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProccessActionPerformed(evt);
            }
        });

        Report.setText("Report of processed orders");
        Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel2.setText("ID BILL");

        jLabel3.setText("STATUS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pendientes)
                                .addGap(49, 49, 49)
                                .addComponent(Particular)
                                .addGap(63, 63, 63)
                                .addComponent(Proccess)
                                .addGap(45, 45, 45)
                                .addComponent(Report)
                                .addGap(40, 40, 40)
                                .addComponent(Back)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(STATUS)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(STATUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pendientes)
                    .addComponent(Particular)
                    .addComponent(Proccess)
                    .addComponent(Report)
                    .addComponent(Back))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        cuadroMostrar.setText("");
        DecoratorJFrame venO = new DecoratorJFrame ();
         venO.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void PendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PendientesActionPerformed
       cuadroMostrar.setText("");
         try {
             lista = new ArrayList<>(controlF.listaBill());
             for(int i = 0; i < lista.size(); i++){
                 cuadroMostrar.append(lista.get(i).toString() + "\n" );
             }
         } catch (IOException ex) {
             Logger.getLogger(Detail.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_PendientesActionPerformed

    private void ParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParticularActionPerformed
       cuadroMostrar.setText("");
       String Id = ID.getText();
      JOptionPane.showMessageDialog(null, "ID Bill a buscar:" + Id);
    }//GEN-LAST:event_ParticularActionPerformed

    private void ProccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProccessActionPerformed
        cuadroMostrar.setText("");
        String Id = ID.getText();
        String status = STATUS.getText();
         JOptionPane.showMessageDialog(null, "ID Bill a buscar:" + Id + "Status" + status);
         
    }//GEN-LAST:event_ProccessActionPerformed

    private void ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportActionPerformed
        cuadroMostrar.setText("");
    }//GEN-LAST:event_ReportActionPerformed
       
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
            java.util.logging.Logger.getLogger(Modulo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modulo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField ID;
    private javax.swing.JButton Particular;
    private javax.swing.JButton Pendientes;
    private javax.swing.JButton Proccess;
    private javax.swing.JButton Report;
    private javax.swing.JTextField STATUS;
    private javax.swing.JTextArea cuadroMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
