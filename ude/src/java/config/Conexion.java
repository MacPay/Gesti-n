/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private String user = "root";
    private String pass ="";
    private String url = "jdbc:mysql://localhost:3306/gestion";
    Connection conn = null;
    public Conexion(){
        try {
            //Busca el Driver de jdbc
            //Class.forName("com.mysql.jdbc.Driver");
            //Carga los datos de la base de datos
            conn = DriverManager.getConnection(url, user, pass);
            //if (conn != null){
                //System.out.println("Conexion exitosa!");
            //}
        //}catch(ClassNotFoundException ex){
           //System.out.println("Error al conectar: "+ex);
        } 
        catch (SQLException ex){
            System.out.println("Error al conectgar SQL: " +ex);
        }
        
        }
    //Retorna la conexión a la base de datos
    public Connection getConnection(){
        return conn;
    }
    }
        
