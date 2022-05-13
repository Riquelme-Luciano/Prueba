package institucion.controlador;

import institucion.modelo.Inscripcion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InscripcionData {
    private Connection conexion=null;
    
    public InscripcionData(Conexion conexion) {
        try {
            this.conexion=conexion.getConexion();
        } catch(SQLException e) {
            
            JOptionPane.showMessageDialog(null,"Error en la  conexion");
        }
    }
    
    public void inscribir(Inscripcion ins) {
        String sql="INSERT INTO inscripcion ";
        try {
            
        } catch (Exception e) {
        }
    }
}
