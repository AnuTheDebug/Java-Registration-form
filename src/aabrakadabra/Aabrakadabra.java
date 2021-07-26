/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aabrakadabra;

/**
 *
 * @author Anubha
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Aabrakadabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter your name :");
            String name = ob.nextLine();
            System.out.println("Enter Contact No. :");
            int contact = ob.nextInt();
            ob.nextLine();
            System.out.println("Enter your address :");
            String address = ob.nextLine();
            System.out.println("Enter your job profile :");
            String profile = ob.nextLine();
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
                   PreparedStatement ps = con.prepareStatement("insert into registration(name,contact,address,job_profile)values(?,?,?,?)");
     ps.setString(1, name);
            ps.setInt(2, contact);
            ps.setString(3, address);
            ps.setString(4, profile);
            int i = ps.executeUpdate();
            if(i>0){
                System.out.println("Registration Successfull");
            }else{
                System.out.println("Something went wrong");
            }
            
        }  catch (Exception e) {
            
        }

    }

}
