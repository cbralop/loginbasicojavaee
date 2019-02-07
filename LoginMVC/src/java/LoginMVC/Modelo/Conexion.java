/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.Modelo;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author capacitacion
 */
public class Conexion {
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String HOST = "localhost";
    public static final String PORT = "3306";//por defecto para mysql
    public static final String DATABASE = "codigofacilito";
    public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    
    public java.sql.Connection conn;
    
    public Conexion() throws SQLException
    {
        try{
            Class.forName(CLASSNAME);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Error");
        }
            
    }
}
