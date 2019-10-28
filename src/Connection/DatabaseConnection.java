/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author haticeozbakir
 */
public class DatabaseConnection {

  
    public static void main(String[] args){
        DatabaseConnection dc=new DatabaseConnection();
        dc.connectDatabase();
    }

    
    
    
    public static Connection connectDatabase(){
       Connection con=null;
       try{
       Class.forName("org.postgresql.Driver");
       con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/FastRest","postgres","asdf123");
       } catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
       }
       System.out.println("");
       return con;
    }
    
}
