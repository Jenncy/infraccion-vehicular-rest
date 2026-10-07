/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infracciones_db", "root", "");
            System.out.println("Conexion con exito");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public Connection getConnection() {
        return con;
    }
}
