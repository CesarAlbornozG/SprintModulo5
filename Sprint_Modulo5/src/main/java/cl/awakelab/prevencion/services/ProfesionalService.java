package cl.awakelab.prevencion.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.prevencion.conexion.DBConnection;
import cl.awakelab.prevencion.model.entity.Profesional;

public class ProfesionalService {
	DBConnection conexion = DBConnection.getInstance();
	
	public List<Profesional> findAllProfesionales() {
	    
	    List<Profesional> profesionales = new ArrayList<Profesional>();
	    DBConnection conexion = DBConnection.getInstance();
	    String sql = "SELECT u.*, up.* FROM usuario_profesional up JOIN usuario u ON up.id_usuario = u.id_usuario";
	    
	    try {		      
	      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
	      ResultSet rs = statement.executeQuery();
	      
	      while(rs.next()) {				
				int id 						= rs.getInt("u.id_usuario");
				String user 				= rs.getString("u.nombre_usuario");
				String password 			= rs.getString("u.password");
				String run 					= rs.getString("u.run");
				String fechaNacimiento		= rs.getString("u.fecha_nacimiento");
				String nombre 				= rs.getString("u.nombre");
				String apellido				= rs.getString("u.apellido");
				String tipo_usuario			= rs.getString("u.tipo_usuario");		
				int idProfesional			= rs.getInt("up.id");				
				String titulo				= rs.getString("up.titulo");
				String fechaIngreso			= rs.getString("up.fecha_ingreso");

				Profesional profesional = new Profesional(id,user,password,run,fechaNacimiento,nombre,apellido, tipo_usuario, 
						idProfesional, titulo, fechaIngreso);
				profesionales.add(profesional);	       
	      }		      	      
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }
		return profesionales;
	  }

	public Profesional findByIdProfesional(int idUsuario) {
	    
		Profesional profesional = null;
	    String sql = "SELECT u.*, up.* FROM usuario u JOIN usuario_profesional up ON u.id_usuario = up.id_usuario WHERE u.id_usuario = ?";
	    
	    try {
	      
	      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
	      statement.setInt(1, idUsuario);	      
	      ResultSet rs = statement.executeQuery();
	      
	      if(rs.next()) {
	    	  String nombreUsuario			= rs.getString("u.nombre_usuario");
	    	  String password	 			= rs.getString("u.password");
	    	  String run 					= rs.getString("u.run");
	    	  String fechaNacimiento		= rs.getString("u.fecha_nacimiento");
	    	  String nombre 				= rs.getString("u.nombre");
	    	  String apellido				= rs.getString("u.apellido");
	    	  String tipo_usuario			= rs.getString("u.tipo_usuario");		    	  	
	    	  int id						= rs.getInt("up.id");		    	  	
	    	  String titulo					= rs.getString("up.titulo");
	    	  String fechaIngreso			= rs.getString("up.fecha_ingreso");
	        
	        profesional = new Profesional(idUsuario, nombreUsuario, password, run, fechaNacimiento, nombre, apellido, tipo_usuario, id, titulo, fechaIngreso);	        
	      }
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }	    
	    return profesional;
	  }
	
	public void updateProfesional(Profesional profesional) {
	    
		String sql = "UPDATE usuario u INNER JOIN usuario_profesional up ON u.id_usuario = up.id_usuario "
				+ "SET u.nombre = ?, u.apellido = ?, u.fecha_nacimiento = ?, u.run = ?, "
				+ "up.titulo = ?, up.fecha_ingreso = ?"
				+ "WHERE u.id_usuario = ?";
	    
	    try {
	      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
	      statement.setString(1, profesional.getNombre());
	      statement.setString(2, profesional.getApellido());
	      statement.setString(3, profesional.getFechaNacimiento());
	      statement.setString(4, profesional.getRun());	 
	      statement.setString(5, profesional.getTitulo());
	      statement.setString(6, profesional.getFechaIngreso());
	      statement.setInt(7, profesional.getId());
	     
	      statement.executeUpdate();
	      
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }	    
	  }
	
	public void registroProfesional(Profesional profesional) {
		
		String sql = "INSERT INTO usuario_profesional(id_usuario,titulo, fecha_ingreso) VALUES (?,?,?)";
		
		try {			
			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			
			statement.setInt(1, profesional.getId());
			statement.setString(2, profesional.getTitulo());
			statement.setString(3, profesional.getFechaIngreso());
			
			statement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
			
}
