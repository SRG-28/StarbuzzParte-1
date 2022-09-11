/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Files {
    File archivo = new File("Bill.txt");
   public ArrayList<Modulo1> getData() throws FileNotFoundException, IOException {
        Bill b;
        //Scanner scan = null;
        BufferedReader reader = null; 
        String idOrder = "", user = "",client = "", status= "", detail = "", coast = "";
        ArrayList<Modulo1> lista = new ArrayList<Modulo1>();
        /*if(!(new File("Bill.txt").isFile())) {
            // Create -- Make sure file exists -- the file before continuing
            java.nio.file.Files.createFile(Paths.get("Bill.txt"));
        }
        
        String data;
        // We will be using a try-with-resource block
        try (BufferedReader reader = new BufferedReader(
                new FileReader("Bill.txt"))) {
            // Access the data from the file
            // Create a new StringBuilder
            StringBuilder string = new StringBuilder();
            
            // Read line-by-line
            String line = reader.readLine();
            // While there comes a new line, execute this
            while(line != null) {
                // Add these lines to the String builder
                string.append(line);
                // Read the next line
                line = reader.readLine();
            }
            data = string.toString();
        } catch (Exception er) {
            // Since there was an error, you probably want to notify the user
            // For that error. So return the error.
            data = er.getMessage();
        }
        // Return the string read from the file
        return data;*/
        
        //op2
       try {
           reader = new BufferedReader(new FileReader("Bill.txt"));
           
           // scan = new Scanner (new FileReader("Bill.txt"));        
            while (reader.ready()) {
             Modulo1 factura = new Modulo1(idOrder,user, client, status, detail,coast);
            factura.setIdOrder(reader.readLine());
            factura.setUser(reader.readLine());
            factura.setClientName(reader.readLine());
            factura.setStatus(reader.readLine());
            factura.setDetail(reader.readLine());
            factura.setCoast(reader.readLine());
          
             //Si el registro cumple la condición se agrega en la lista que se retorna
          /*   if(factura.getClientName()){
                lista.add(perro);
             }
*/
          lista.add(factura);
          
        }                
   } catch (FileNotFoundException e) {
         System.err.println(e);
    } catch (InputMismatchException e) {
         System.err.println(e);
    } catch (java.util.NoSuchElementException e){
         System.err.println(e);
    }
    finally{
         reader.close();
    }

    return lista;
    }
    
    public boolean writeData(String data) throws IOException, FileNotFoundException
    {
        // Save the data to the File
        try (BufferedWriter writer = new BufferedWriter(
                                        new FileWriter("Bill.txt", true))) {
            // Write the data to the File
            writer.write(data);
            //writer.newLine();
            // Return indicating the data was written
            return true;
        } catch (Exception er) {
            return false;
        }
    }
   
}
