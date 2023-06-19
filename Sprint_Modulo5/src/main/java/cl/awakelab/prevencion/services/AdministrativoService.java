package cl.awakelab.prevencion.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.prevencion.conexion.DBConnection;
import cl.awakelab.prevencion.model.entity.Administrativo;

public class AdministrativoService {
	DBConnection conexion = DBConnection.getInstance();
	
	public List<Administrativo> findAllAdministrativos() {
		    
		List<Administrativo> administrativos = new ArrayList<Administrativo>();
		DBConnection conexion = DBConnection.getInstance();
		String sql = "SELECT u.*, ua.* FROM usuario_administrativo ua JOIN usuario u ON ua.id_usuario = u.id_usuario";
		    
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
			int idAdministrativo		= rs.getInt("ua.id");				
			String area					= rs.getString("ua.area");
			String experienciaPrevia	= rs.getString("ua.experiencia_previa");

			Administrativo administrativo = new Administrativo(id,user,password,run,fechaNacimiento,nombre,apellido, tipo_usuario, 
					idAdministrativo, area, experienciaPrevia);
			administrativos.add(administrativo);	       
	      }		      	      
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }
		return administrativos;
	}

	public Administrativo findByIdAdministrativo(int idUsuario) {
		    
		Administrativo administrativo = null;
	    String sql = "SELECT u.*, ua.* FROM usuario u JOIN usuario_administrativo ua ON u.id_usuario = ua.id_usuario WHERE u.id_usuario = ?";
		    
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
	    	  int id						= rs.getInt("ua.id");
	    	  String area					= rs.getString("ua.area");
	    	  String experienciaPrevia		= rs.getString("ua.experiencia_previa");
		        
	    	  administrativo = new Administrativo(idUsuario, nombreUsuario, password, run, fechaNacimiento, nombre, apellido, tipo_usuario, id, area, experienciaPrevia);	        
	      }
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }	    
	    return administrativo;
	}
		
	public void updateAdministrativo(Administrativo administrativo) {
		    
		String sql = "UPDATE usuario u INNER JOIN usuario_administrativo ua ON u.id_usuario = ua.id_usuario "
				+ "SET u.nombre = ?, u.apellido = ?, u.fecha_nacimiento = ?, u.run = ?, "
				+ "ua.area = ?, ua.experiencia_previa = ?"
				+ "WHERE u.id_usuario = ?";
		    
	    try {
	      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
	      statement.setString(1, administrativo.getNombre());
	      statement.setString(2, administrativo.getApellido());
	      statement.setString(3, administrativo.getFechaNacimiento());
	      statement.setString(4, administrativo.getRun());	 
	      statement.setString(5, administrativo.getArea());
	      statement.setString(6, administrativo.getExperienciaPrevia());
	      statement.setInt(7, administrativo.getId());
		     
	      statement.executeUpdate();
		      
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }	    
	}
	
	public void registroAdministrativo(Administrativo administrativo) {
		
		String sql = "INSERT INTO usuario_administrativo(id_usuario,area, experiencia_previa) VALUES (?,?,?)";
		
		try {			
			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);			
			statement.setInt(1, administrativo.getId());
			statement.setString(2, administrativo.getArea());
			statement.setString(3, administrativo.getExperienciaPrevia());			
			statement.executeUpdate();								
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
}
