/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author capacitacion
 */
public class Consultas extends Conexion{
    public boolean Autenticacion(String user, String pass) throws SQLException
    {
        Statement st = conn.createStatement();
        ResultSet rs = null;
        String consulta = "Select * from USUARIOS";
        rs = st.executeQuery(consulta);
        
        while(rs.next())
        {
            if (user.equals(rs.getString("USUARIO"))&&pass.equals(rs.getString("CONTRASENA"))) {
                return true;
            }
        }
        return false;
    }

}
