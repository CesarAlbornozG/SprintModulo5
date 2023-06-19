package cl.awakelab.prevencion.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.prevencion.conexion.DBConnection;
import cl.awakelab.prevencion.model.entity.Cliente;

public class ClienteService {
	DBConnection conexion = DBConnection.getInstance();
	
	public List<Cliente> findAllClientes() {
	    
	    List<Cliente> clientes = new ArrayList<Cliente>();
	    DBConnection conexion = DBConnection.getInstance();
	    String sql = "SELECT  u.*, uc.* FROM usuario_cliente uc JOIN usuario u ON uc.id_usuario = u.id_usuario";
	    
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
				int idCliente				= rs.getInt("uc.id");					
				int telefono				= rs.getInt("uc.telefono");
				String afp					= rs.getString("uc.afp");
				String sistemaSalud			= rs.getString("uc.sistema_salud");
				String direccion			= rs.getString("uc.direccion");
				String comuna				= rs.getString("uc.comuna");
				int edad					= rs.getInt("uc.edad");
				
				Cliente cliente = new Cliente(id,user,password,run,fechaNacimiento,nombre,apellido, tipo_usuario, 
						idCliente,telefono, afp, sistemaSalud, direccion, comuna, edad);
				clientes.add(cliente);	       
	      }		      	      
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }
		return clientes;
	  }

	public Cliente findByIdCliente(int idUsuario) {
	    
	    Cliente cliente = null;
	    String sql = "SELECT u.*, uc.* FROM usuario u JOIN usuario_cliente uc ON u.id_usuario = uc.id_usuario WHERE u.id_usuario = ?";
	    
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
	    	  int id						= rs.getInt("uc.id");
	    	  int telefono					= rs.getInt("uc.telefono");
	    	  String afp					= rs.getString("uc.afp");
	    	  String sistemaSalud			= rs.getString("uc.sistema_salud");
	    	  String direccion				= rs.getString("uc.direccion");
	    	  String comuna					= rs.getString("uc.comuna");
	    	  int edad						= rs.getInt("uc.edad");
	        
	        cliente = new Cliente(idUsuario, nombreUsuario, password, run, fechaNacimiento, nombre, apellido, tipo_usuario, id, telefono, afp, sistemaSalud, direccion, comuna, edad);	        
	      }
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }	    
	    return cliente;
	  }
	
	public void updateCliente(Cliente cliente) {
	    
		String sql = "UPDATE usuario u INNER JOIN usuario_cliente uc ON u.id_usuario = uc.id_usuario "
				+ "SET u.nombre = ?, u.apellido = ?, u.fecha_nacimiento = ?, u.run = ?, "
				+ "uc.telefono = ?, uc.afp = ? , uc.sistema_salud = ? , uc.direccion = ? , uc.comuna = ? , uc.edad = ? "
				+ "WHERE u.id_usuario = ?";
	    
	    try {
	      PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
	      statement.setString(1, cliente.getNombre());
	      statement.setString(2, cliente.getApellido());
	      statement.setString(3, cliente.getFechaNacimiento());
	      statement.setString(4, cliente.getRun());	      
	      statement.setInt(5, cliente.getTelefono());
	      statement.setString(6, cliente.getAfp());
	      statement.setString(7, cliente.getSistemaSalud());
	      statement.setString(8, cliente.getDireccion());
	      statement.setString(9, cliente.getComuna());
	      statement.setInt(10, cliente.getEdad());
	      statement.setInt(11, cliente.getId());
	     
	      statement.executeUpdate();
	      
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }
	  }
	
	public void registroCliente(Cliente cliente) {
	
		String sql = "INSERT INTO usuario_cliente(id_usuario, telefono, afp, sistema_salud, direccion, comuna, edad) VALUES (?,?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
		
			statement.setInt   (1, cliente.getId());
			statement.setInt   (2, cliente.getTelefono());
			statement.setString(3, cliente.getAfp());
			statement.setString(4, cliente.getSistemaSalud());
			statement.setString(5, cliente.getDireccion());
			statement.setString(6, cliente.getComuna());
			statement.setInt   (7, cliente.getEdad());
			
			statement.executeUpdate();
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
}
