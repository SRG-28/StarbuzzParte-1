/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.DecoratorJFrame;
import beveragePackage.*;


import Model.Bill;
import java.util.ArrayList;

/**
 *
 * @author Donald
 */
public class Starbuzz {

     Bill m= Bill.instance();
     ArrayList<Bill> billList;
    
    public void startApplication(){
        DecoratorJFrame Jframe=new DecoratorJFrame();
        Jframe.setVisible(true);
    }
    public String mostrarbebidas(){
        String bebidas="";
        int orden=0;
        int can= m.getBeverage().size();
        for(int i=0;i<can;i++){
           
            bebidas=m.getBeverage().get(i).getDescription();
            
        }
        orden++;
        return "Orden:"+orden+"\n"+bebidas;
    }
    public String mostrarPrecio(){
        return m.precioTotal();
    }

    public ArrayList<IBeverage> getList(){
       return m.getBeverage();
    }
    
    public void agregarBebida(IBeverage description) {
        m.getBeverage().add(description);
    }
    
    public void removeIndex(int i){
        m.getBeverage().remove(i);
    }
    
    public void agregarFactura(String n, String c, String t){
        m.setClientName(n);
        m.setUserName(c);
        m.setStatus(t);
        m.setOrderId(0);
    }
    
    public String getUser(){
        return m.getUserName();
    }
    
    public String getClient(){
        return m.getClientName();
    }
    
    public String getStatus(){
        return m.getStatus();
    }
    
    public int getOrderId(){
        return m.getOrderId();
    }
    
    
    public ArrayList<Bill> getBillList(){
       return billList;
    }
    
 
}