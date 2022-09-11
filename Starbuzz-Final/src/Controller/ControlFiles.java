/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Files;
import Model.Modulo1;
import View.BeverageJFrame;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author sofia
 */
public class ControlFiles {
        public String getMessage() {
        try {
            Files model = new Files();
            String g = "";
            return g;
            //return model.getData();
        } catch (Exception er) {
            return "There was an error.";
        }
        
    }
    
    public boolean writeMessage(String message) {
        try {
            Files model = new Files();
            return model.writeData(message);
        } catch (Exception er) {
            return false;
        }
    }
    
  public ArrayList<Modulo1> listaBill() throws IOException{
      Files model = new Files();
      return model.getData();
  }
}
