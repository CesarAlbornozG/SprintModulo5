package cl.awakelab.prevencion.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.prevencion.conexion.DBConnection;
import cl.awakelab.prevencion.model.entity.Contacto;

public class ContactoService {
	DBConnection conexion = DBConnection.getInstance();
	
	public void registroContacto(Contacto contacto) {
		String sql = "INSERT INTO contacto(nombrecompleto, email, asunto, mensaje) VALUES (?,?,?,?)";
		
		try {
			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			statement.setString(1, contacto.getNombreCompleto());
			statement.setString(2, contacto.getEmail());
			statement.setString(3, contacto.getAsunto());
			statement.setString(4, contacto.getMensaje());	
			
			statement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public List<Contacto> findAllContactos() {
	    
	    List<Contacto> contactos = new ArrayList<>();
	    DBConnection conexion = DBConnection.getInstance();
	    String sql = "SELECT * FROM contacto";
	    
	    try {		      
	      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
	      ResultSet rs = statement.executeQuery();
	      
	      while(rs.next()) {				
	    	  int id					 = rs.getInt("id");
		      String nombreCompleto		 = rs.getString("nombrecompleto");
		      String email				 = rs.getString("email"); 
		      String asunto				 = rs.getString("asunto");
		      String mensaje			 = rs.getString("mensaje");		    

		      Contacto contacto = new Contacto(id,nombreCompleto, email, asunto, mensaje);
		      contactos.add(contacto);	       
	      }		      	      
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }
	    return contactos;
	  }
}
