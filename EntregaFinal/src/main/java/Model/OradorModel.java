
package Model;

import Controller.Orador;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Conexion;

public class OradorModel {
        
    Conexion conex;
    
    public OradorModel(){   
        conex = new Conexion();
    }    
    
    public void insertOrador(Orador orador){
        String nom = orador.getNombre();
        String ape = orador.getApellido();
        String email = orador.getEmail();
        String tema = orador.getTema();
	Statement st=conex.conectar();
	try{
		Integer insertOk = st.executeUpdate("INSERT INTO oradores (nombre,apellido,email,tema) VALUES ('"+nom+"','" +ape+"','"+email+"', '"+tema+"')");
		
		if(insertOk==1) {
			System.out.println();
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
    } 

    public void modOrador(Orador orador){
        String nom = orador.getNombre();
        String ape = orador.getApellido();
        String email = orador.getEmail();
        String tema = orador.getTema();
        int id = orador.getId();
	Statement st=conex.conectar();
	try{
		Integer updateOk = st.executeUpdate("UPDATE oradores SET nombre='"+nom+"', apellido='"+ape+"', email='"+email+"', tema='"+tema+"' WHERE oradores.id="+id);
		
		if(updateOk==1) {
			System.out.println();
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
    }

    public Orador getOrador(int id) {
        Statement st=conex.conectar();
	try{
		ResultSet orador = st.executeQuery("SELECT * FROM oradores WHERE id = " + id);
		if (orador.next()){
                    int oradorId = orador.getInt("id");
                    String nombre = orador.getString("nombre");
                    String apellido = orador.getString("apellido");
                    String email = orador.getString("email");
                    String tema = orador.getString("tema");
                    
                    return new Orador(id,nombre,apellido,email,tema);
                    
                }
	}
	catch(Exception e){
		e.printStackTrace();
	}
        return null;
    }

    public List<Orador> getOradores() {
        Statement st=conex.conectar();
        List<Orador> oradores = new ArrayList<>();
	try{
            ResultSet ora = st.executeQuery("SELECT * FROM oradores");
            while (ora.next()) {
                Orador orador = new Orador();
                orador.setId(ora.getInt("id"));
                orador.setNombre(ora.getString("nombre"));
                orador.setApellido(ora.getString("apellido"));
                orador.setEmail(ora.getString("email"));
                orador.setTema(ora.getString("tema"));
                oradores.add(orador);
    }
	}
	catch(Exception e){
		e.printStackTrace();
	}
        return oradores;
    }

    public void borrarOrador(int id) {       
	Statement st=conex.conectar();
	try{
		Integer deleteOk = st.executeUpdate("DELETE FROM oradores WHERE id = " + id);
		
		if(deleteOk==1) {
			System.out.println();
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
    }
}
