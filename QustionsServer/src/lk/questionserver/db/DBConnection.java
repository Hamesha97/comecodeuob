package lk.questionserver.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
	
	 private static DBConnection dbConnection;
	 private Connection connection;
	    
	 private DBConnection() {
	        
	       try {
	        
	           String ip = "localhost";
	           String port = "3306";
	           String database = "questiondb";
	           String username = "root";
	           String password = "1234";
	            
	           Class.forName("com.mysql.jdbc.Driver");
	            
	           String url = "jdbc:mysql://" + ip + ":" + port + "/" + database;
	            
	           connection = DriverManager.getConnection(url,username,password);
	        
	       } catch (ClassNotFoundException ex) {
	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (SQLException ex) {
	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	    
	    public static DBConnection getInstance() {
	        if (dbConnection == null){
	            dbConnection = new DBConnection();
	        }
	        return dbConnection;
	    }
	    
	    public Connection getConnection(){
	        return connection;
	    }

}
