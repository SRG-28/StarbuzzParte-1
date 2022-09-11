/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author sofia
 */
public class Modulo1 {
    private String IdOrder;
    private String user;
    private String clientName;
    private String status;
    private String detail;
    private String coast;

    public Modulo1(String IdOrder, String user, String clientName, String status, String detail, String coast) {
        this.IdOrder = IdOrder;
        this.user = user;
        this.clientName = clientName;
        this.status = status;
        this.detail = detail;
        this.coast = coast;
    }

    public String getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(String IdOrder) {
        this.IdOrder = IdOrder;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCoast() {
        return coast;
    }

    public void setCoast(String coast) {
        this.coast = coast;
    }

    @Override
    public String toString() {
        return "\nFactura = " + "\n" +"Id Order=" + IdOrder + "\n" +" Casher name=" + user + "\n" +"Client Name=" + clientName + "\n" +"Status=" + status + "\n" +" Detail=" + detail +"\n" + "Coast= $" + coast;
    }
   
            
}
