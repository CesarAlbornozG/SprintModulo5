package cl.awakelab.prevencion.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.prevencion.conexion.DBConnection;
import cl.awakelab.prevencion.model.entity.Capacitacion;

public class CapacitacionService {
	
	DBConnection conexion = DBConnection.getInstance();	

	public void registroCapacitacion(Capacitacion capacitacion) {
		
		String sql = "INSERT INTO capacitacion(rutcliente, dia, hora, lugar, duracion, cantidadasistentes) VALUES (?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			statement.setString(1, capacitacion.getRutCliente());
			statement.setString(2, capacitacion.getDia());
			statement.setString(3, capacitacion.getHora());
			statement.setString(4, capacitacion.getLugar());
			statement.setString(5, capacitacion.getDuracion());
			statement.setInt(6, capacitacion.getCantidadDeAsistentes());
			
			statement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public List<Capacitacion> findAllCapacitaciones() {
		
		List<Capacitacion> capacitaciones = new ArrayList<>();		
		String sql = "SELECT * FROM capacitacion";
		
		try {
			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			ResultSet rs = statement.executeQuery();			
			
			while(rs.next()) {				
				
				int id 					= rs.getInt("id");
				String rut 				= rs.getString("rutcliente");
				String dia 				= rs.getString("dia");
				String hora 			= rs.getString("hora");
				String lugar			= rs.getString("lugar");
				String duracion 		= rs.getString("duracion");
				int cantAsistentes		= rs.getInt("cantidadasistentes");
				
				Capacitacion capacitacion = new Capacitacion(id,rut,dia,hora,lugar,duracion,cantAsistentes);
				capacitaciones.add(capacitacion);				
			}			
		} catch (Exception e) {
			System.out.println(e.getMessage());			
		}
		return capacitaciones;
	}
}
