
package personas;
import config.Conexion;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonasC {
    public List<Personas> listarPersonas(){
        Conexion conectar = new Conexion();
        Connection conn = (Connection) conectar.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        String consulta = "select ci, nombre, apellido from persona";
        List<Personas> lista = new ArrayList<>();
        try {
            ps = conn.prepareStatement(consulta);           
            rs = ps.executeQuery();
            while (rs.next()){
                int ci = rs.getInt("ci");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Personas persona = new Personas(ci, nombre, apellido);
                
                lista.add(persona);
            }
            return lista;
            
            
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }      
    }
    public Personas mostrarPersonas(int _ci){
        Conexion conectar = new Conexion();
        Connection conn = (Connection) conectar.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        Personas persona = null;
        try {
            ps = conn.prepareStatement("select ci, nombre, apellido from persona where ci=?");
            ps.setInt(1, _ci);
            rs = ps.executeQuery();
            while (rs.next()){
                int ci = rs.getInt("ci");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                
                persona = new Personas(ci, nombre, apellido);
                
            }
            return persona;
            
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
        
    }
    public boolean insertar(Personas persona){  
        Conexion conectar = new Conexion();
        Connection conn = (Connection) conectar.getConnection();
        PreparedStatement ps;      
        try {
            ps = conn.prepareStatement("insert into persona(ci, nombre, apellido) values (?,?,?)");
            ps.setInt(1, persona.getCi());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getApellido());
            ps.execute();
            return true;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return false;
        }
        
    }
    public boolean actualizar(Personas persona){  
        Conexion conectar = new Conexion();
        Connection conn = (Connection) conectar.getConnection();
        PreparedStatement ps;      
        try {
            ps = conn.prepareStatement("update persona set ci=?, nombre=?, apellido=? where ci=?");
            ps.setInt(1, persona.getCi());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getApellido());
            ps.setInt(4, persona.getCi());
            ps.execute();                
            return true;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return false;
        }
        
    }
    public boolean eliminar(int _ci){  
        Conexion conectar = new Conexion();
        Connection conn = (Connection) conectar.getConnection();
        PreparedStatement ps;      
        try {
            ps = conn.prepareStatement("delete from persona where ci=?");
            ps.setInt(1, _ci);
            ps.execute(); 
            return true;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return false;
        }
        
    }
}
