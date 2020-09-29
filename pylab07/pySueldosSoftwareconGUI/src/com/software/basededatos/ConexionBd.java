
package com.software.basededatos;

import com.software.dominio.Consultor;
import com.software.dominio.Empleado;
import com.software.dominio.Trabajador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author christopher
 */
public class ConexionBd {
    private Connection cnn;
    
    public ConexionBd() {
        try {
            this.cnn = DriverManager.getConnection("jdbc:mysql://localhost:2525/db_empleados?zeroDateTimeBehavior=convertToNull", "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar base de datos");
        }       
    }
    
    public void agregarTrabajador(Trabajador t){
        
        try {
            
            if (t instanceof Empleado){
                PreparedStatement pst = cnn.prepareStatement("INSERT INTO empleados VALUES(?,?,?,?,?,?,?)");

                pst.setString(1,"0");
                pst.setString(2, t.getNombre().trim());
                pst.setString(3, t.getLegajo().trim());
                pst.setString(4, t.getPuesto().trim());
                pst.setString(5, t.getFechaC().trim());
                pst.setDouble(6, ((Empleado) t).getSueldo());
                pst.setDouble(7, ((Empleado) t).getHsExtra());               
                pst.executeUpdate();
                pst.close();
                cnn.close();
            }
            if (t instanceof Consultor){
                PreparedStatement pst = cnn.prepareStatement("INSERT INTO Consultores VALUES(?,?,?,?,?,?,?)");
                
                pst.setString(1,"0");
                pst.setString(2, t.getNombre().trim());
                pst.setString(3, t.getLegajo().trim());
                pst.setString(4, t.getPuesto().trim());
                pst.setString(5, t.getFechaC().trim());
                pst.setDouble(6, ((Consultor) t).getPrHs());
                pst.setDouble(7, ((Consultor) t).getCantHs());                
                pst.executeUpdate();
                pst.close();
                cnn.close();
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo agregar empleado");
            }
            
        }        
    }
