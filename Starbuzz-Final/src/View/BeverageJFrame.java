/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.ControlFiles;
import javax.swing.ListSelectionModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sofía Rubie García 117520883
 * @author Donald Cordoba Campos 304950089
 * @author Kyara Ávalos Escobar 402340732
 * @author Ali Pitti Gózalez 402450140
 *  
 */

/*BeverageJFrame
Está clase see encarga de mostrarle al usuario la ventana en donde solicita el nombre del usuario,
también muestra las bebidas de los decoradores de las bebidas base, 
también muestra las posibles bebidas extra y la selección del Whipped Cream o no del mismo, en caso que el usuario no lo desee */
import beveragePackage.*;

import Controller.Starbuzz;


public class BeverageJFrame extends javax.swing.JFrame {
   
    IBeverage beverage;
    IExtras extra;
    int orderId;
    ArrayList<IBeverage> beverageList;
    Starbuzz buzz;
  CommercialInvoice commercial;
    /**
     * Creates new form BeverageJFrame
     */
    public BeverageJFrame() {
        initComponents();
        BeverageList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setLocationRelativeTo(null);
        beverageList = new ArrayList<>();
        buzz =new Starbuzz();
       commercial=new CommercialInvoice();
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
        BeverageList = new javax.swing.JList<>();
        PrincipalLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        BillButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ExtrasList = new javax.swing.JList<>();
        DrinkLabel = new javax.swing.JLabel();
        ExtrasLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        RemoveLabel = new javax.swing.JLabel();
        RemoveTextField = new javax.swing.JTextField();
        LookButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        InfoTextArea = new javax.swing.JTextArea();
        CasherName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BeverageList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "House Blend", "Dark Roast", "Decaf", "Espresso" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(BeverageList);

        PrincipalLabel.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        PrincipalLabel.setText("Which Beverage do you want?");

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        BillButton.setText("Make Bill");
        BillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillButtonActionPerformed(evt);
            }
        });

        ExtrasList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Caramel", "Mocha", "Soy", "Steamed Milk", "Whipped Cream" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ExtrasList);

        DrinkLabel.setText("Base Drink");

        ExtrasLabel.setText("Extras");

        NameLabel.setText("Client Name");

        AddButton.setText("Add Beverage");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        RemoveLabel.setText("Remove Beverage(Index)");

        LookButton.setText("Look BeverageList");
        LookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LookButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("For multiple selection ctrl+click");

        InfoTextArea.setColumns(20);
        InfoTextArea.setRows(5);
        jScrollPane3.setViewportView(InfoTextArea);

        jLabel2.setText("Casher Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(PrincipalLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NameTextField)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveTextField)
                    .addComponent(RemoveButton)
                    .addComponent(RemoveLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(CasherName))
                .addGap(18, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DrinkLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LookButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ExtrasLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(121, 121, 121))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PrincipalLabel)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DrinkLabel)
                            .addComponent(ExtrasLabel)
                            .addComponent(NameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CasherName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RemoveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RemoveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackButton)
                            .addComponent(BillButton)
                            .addComponent(AddButton)
                            .addComponent(LookButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RemoveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clear(){
        ExtrasList.clearSelection();
        BeverageList.clearSelection();
        NameTextField.setText("");
        CasherName.setText("");
        beverageList.clear();
        buzz.getList().clear();
    }
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        clear();
        DecoratorJFrame venD = new DecoratorJFrame();
        venD.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillButtonActionPerformed
        buzz.agregarFactura(NameTextField.getText(), CasherName.getText(), "Pendiente");
        setVisible(false);
        commercial.setVisible(true);
        
        
    }//GEN-LAST:event_BillButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        
        int opc=0;
        if(BeverageList.isSelectionEmpty()){
           beverage=null;
        }
        if(BeverageList.isSelectedIndex(0)){
           beverage = new HouseBlend();
           //buzz.agregarBebida(beverage);
        }
        if(BeverageList.isSelectedIndex(1)){
           beverage = new DarkRoast();
           //buzz.agregarBebida(beverage);
        }
        if(BeverageList.isSelectedIndex(2)){
           beverage = new Decaf();
           //buzz.agregarBebida(beverage);
        }
        if(BeverageList.isSelectedIndex(3)){
           beverage = new Espresso();
           //buzz.agregarBebida(beverage);
        }

        if(ExtrasList.isSelectionEmpty()){
            beverage=null;
        }
        if(ExtrasList.isSelectedIndex(0)){
            beverage = new Caramel(beverage);
            //buzz.agregarBebida(beverage);
        }
        if(ExtrasList.isSelectedIndex(1)){
            beverage = new Mocha(beverage);
             //buzz.agregarBebida(beverage);
            
        }
        if(ExtrasList.isSelectedIndex(2)){
            beverage = new Soy(beverage);
           //buzz.agregarBebida(beverage);
        }
        if(ExtrasList.isSelectedIndex(3)){
            beverage = new SteamedMilk(beverage);
          //buzz.agregarBebida(beverage);
        }
        if(ExtrasList.isSelectedIndex(4)){
            beverage = new WhippedCream(beverage);
           //buzz.agregarBebida(beverage);
        }
        
        buzz.agregarBebida(this.beverage);
        
        if(beverageList.add(this.beverage)){
            System.out.println("Drink added correctly... ");
        }
        else{
            System.out.println("Could not add the drink... ");
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        // TODO add your handling code here:
        int indx = Integer.parseInt(RemoveTextField.getText());
        beverageList.remove(indx);
        buzz.removeIndex(indx);
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void LookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LookButtonActionPerformed
        // TODO add your handling code here:
        InfoTextArea.setText("");
        for(int i=0; i< beverageList.size(); i++){
            InfoTextArea.append("Index:" + i + "\nDescription: " + beverageList.get(i).getDescription()  + "\nCost: " + beverageList.get(i).getCost() + "\n");
        }
    }//GEN-LAST:event_LookButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JList<String> BeverageList;
    private javax.swing.JButton BillButton;
    private javax.swing.JTextField CasherName;
    private javax.swing.JLabel DrinkLabel;
    private javax.swing.JLabel ExtrasLabel;
    private javax.swing.JList<String> ExtrasList;
    private javax.swing.JTextArea InfoTextArea;
    private javax.swing.JButton LookButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PrincipalLabel;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JLabel RemoveLabel;
    private javax.swing.JTextField RemoveTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}