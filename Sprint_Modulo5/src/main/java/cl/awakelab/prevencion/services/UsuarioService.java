package cl.awakelab.prevencion.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.prevencion.conexion.DBConnection;
import cl.awakelab.prevencion.model.entity.Usuario;

public class UsuarioService {
	DBConnection conexion = DBConnection.getInstance();
	
	public List<Usuario> findAllUsuarios() {
		    
		    List<Usuario> usuarios = new ArrayList<>();
		    DBConnection conexion = DBConnection.getInstance();
		    String sql = "SELECT * FROM usuario";
		    
		    try {		      
		      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
		      ResultSet rs = statement.executeQuery();
		      
		      while(rs.next()) {
		        int id					 = rs.getInt("id_usuario");
		        String nombreUsuario	 = rs.getString("nombre_usuario");
		        String password			 = rs.getString("password"); 
		        String run				 = rs.getString("run");
		        String fechaNacimiento	 = rs.getString("fecha_nacimiento");
		        String nombre			 = rs.getString("nombre");
		        String apellido			 = rs.getString("apellido");
		        String tipoUsuario		 = rs.getString("tipo_usuario");
		        Usuario usuario = new Usuario(id, nombreUsuario, password, run, fechaNacimiento, nombre, apellido, tipoUsuario);
		        usuarios.add(usuario);	       
		      }		      	      
		    } catch (Exception e) {
		      System.out.println(e.getMessage());
		    }
		    return usuarios;
		  }
	
	public Usuario findByIdUsuario(int id) {
	    
	    Usuario usuario = null;
	    String sql = "SELECT * FROM usuario WHERE id = ?";
	    
	    try {
	      
	      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
	      statement.setInt(1, id);
	      ResultSet rs = statement.executeQuery();
	      
	      if(rs.next()) {
	    	  String nombreUsuario		 = rs.getString("nombre_usuario");
			  String password			 = rs.getString("password"); 
			  String run				 = rs.getString("run");
			  String fechaNacimiento	 = rs.getString("fecha_nacimiento");
			  String nombre				 = rs.getString("nombre");
			  String apellido			 = rs.getString("apellido");
			  String tipoUsuario		 = rs.getString("tipo_usuario");
	        
	        usuario = new Usuario(id, nombreUsuario, password, run, fechaNacimiento, nombre, apellido, tipoUsuario );	        
	      }
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }	    
	    return usuario;
	  }
	
	public Usuario updateUsuario(Usuario usuario) {
	    
	    String sql = "UPDATE usuario SET nombre_usuario = ?, password = ?, run = ? , fecha_nacimiento = ? , nombre = ? , apellido = ? , tipo_usuario = ? WHERE id = ?";
	    
	    try {
	      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
	      statement.setString(1, usuario.getUsuario());
	      statement.setString(2, usuario.getPassword());
	      statement.setString(3, usuario.getRun());
	      statement.setString(4, usuario.getFechaNacimiento());
	      statement.setString(5, usuario.getNombre());
	      statement.setString(6, usuario.getApellido());
	      statement.setString(7, usuario.getTipoUsuario());
	      statement.setInt(8, usuario.getId());
	      // statement.executeQuery(); // aqui estaba el error!! es Update
	      statement.executeUpdate();
	      
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }
	    
	    return usuario;
	  }
	
	public int findIdByRunUsuario(String run) {
		
		int idUsuario = 0;		
		String sql = "SELECT id_usuario FROM usuario WHERE run = ?";
	    
	   try {
	     PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
	     statement.setString(1, run);
	     ResultSet rs = statement.executeQuery();
	      
	     if(rs.next()) {
	       idUsuario = rs.getInt("id_usuario");    
	                
	     }
	   } catch (Exception e) {
	     System.out.println(e.getMessage());
	   }		    
	   return idUsuario;
	 }
	
	public void registroUsuario(Usuario user) {
		
		DBConnection conexion = DBConnection.getInstance();	
		String sql = "INSERT INTO usuario(nombre_usuario, password, run, fecha_nacimiento, nombre, apellido, tipo_usuario) VALUES (?,?,?,?,?,?,?)";
		
		try {			
			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			statement.setString(1, user.getUsuario());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getRun());
			statement.setString(4, user.getFechaNacimiento());
			statement.setString(5, user.getNombre());
			statement.setString(6, user.getApellido());
			statement.setString(7, user.getTipoUsuario());						
			statement.executeUpdate();			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}	
}
