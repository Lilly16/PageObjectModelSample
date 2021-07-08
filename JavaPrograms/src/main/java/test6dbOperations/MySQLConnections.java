package test6dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnections {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		//http://localhost/phpmyadmin
		//1.mention the type of db to be used like mysql,oracle sql....
		Class.forName("com.mysql.cj.jdbc.Driver");

		//2.Create the connection with DB by giving the DB details
		Connection connection = DriverManager.
				getConnection("jdbc:mysql://root@localhost/database");
		/*suppose if you're giving username and password
		("jdbc:mysql://root@localhost:3306(here you give port number)"
		+ "/database","root(user name)","root(password)"); */
		
		//3.create a statement
		Statement statement = connection.createStatement();
		
		ResultSet results = statement.executeQuery("Select * from tabl_login");

		while(results.next()) {
			
			System.out.println("id "+ results.getString(1)+" username "
					+results.getString(2)+" password "+results.getString(3));
		}



	}

}
