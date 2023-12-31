package cl.awakelab.prevencion.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

  private static final String DB = "prevencionDB";
  private static final String PORT = "3306";
  private static final String LOGIN = "prevencion";
  private static final String PASSWORD = "projectprevencion";
  private static final String URL_CONEXION = "jdbc:mysql://localhost:"+PORT+"/"+DB;
  // jdbc:mysql://localhost:3306/prevencion
  
  // PATRON SINGLETON
  private static DBConnection instance = null;
  private Connection connection = null;
  
  private DBConnection() {
    try {
      
      Class.forName("com.mysql.cj.jdbc.Driver"); // utilizamos el driver o cargamos el driver
      // Class.forName("org.mariadb.jdbc.Driver");
      connection = DriverManager.getConnection(URL_CONEXION, LOGIN, PASSWORD);
      
      if(connection != null) {
        System.out.println("La conexión a : " + DB + " ha sido exitosa");
      } else {
        System.out.println("La conexión a : " + DB + " ha fallado");
      }
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  public static DBConnection getInstance() {
    if(instance == null) {
      instance = new DBConnection();
    }
    return instance;
  }
  
  
  public Connection getConnection() {
    return connection;
  }
  

  public void disconnect() {
    if(connection != null ) {
      try {
        connection.close();
        System.out.println("La conexión a: " + DB + " Ha sido cerrado correctamente");
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    connection = null;
  }
}
