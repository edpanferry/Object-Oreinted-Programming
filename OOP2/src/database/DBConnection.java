package database;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BISU 07
 */
public class DBConnection {
    
    static Connection connect;
    
    static String status;
   
  public static void setConnection()
  {
      try
      {
          Class.forName("com.mysql.jdbc.Driver");                       //db_name,username,password
          connect = DriverManager.getConnection("jdbc:mysql://localhost/accounts_db", "ferry", "1234");
           JOptionPane.showMessageDialog(null, "Succesfully Connected!");
           
      }catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, "Connection Failed");
        //s e.printStackTrace();
          
      }
  }
    public static Connection getConnection()
    {
      
        return connect;
    }
    
     public static String getStatusConnection(){
        if(connect!=null){
           status = "Database Connectivity : Successfully Connected";
        }
        else{
             status = "Database Connectivity: Connection Failed";
        }
        return status;
        
     }
     
      public static void main(String[] args) {
          setConnection();
    }
}




