import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_the_database2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection =	DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	Statement statement=	connection.createStatement();

	// The above code is to establish the connection to mysql

	statement.execute("create database facebook");

	// Thsi is query is to create the database to mysql
	
	Connection connection1=DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook","root","root");
	Statement statement1=	connection1.createStatement();

	// i taken as database as facebook after creating the database again we have to create the connection

	statement1.execute("create table user (u_id integer primary key, u_name varchar(55) not null, u_email varchar(55) not null, u_ph integer )");

	// This is the query to create the table with constraints and datatypes

	statement1.execute("insert into user values(1,'tarun','tarun@gmail.com',74123)");
	statement1.execute("insert into user values(2,'ramesh','ramesh@gmail.com',789566)");
	statement1.execute("insert into user values(3,'suresh','suresh@gmail.com',555555)");
	statement1.execute("insert into user values(4,'ravindhar','ravindhar@gmail.com',74123)");
	statement1.execute("insert into user values(5,'kml','kml@gmail.com',963214)");

	// Thsi is the query to insert the values to table
		
	
	/* Hear we are using the ResultSet interface to get the data from database we use one method execute(); 
	to 	Parameters:
			sql any SQL statement
		Returns:
			true if the first result is a ResultSetobject; false if it is an update count or there areno results
	
	(2):-like this we use another method to executeUpdate();
	to	Parameters:
			sql an SQL Data Manipulation Language (DML) statement, such as INSERT, UPDATE or DELETE; 
			or an SQL statement that returns nothing,such as a DDL statement.
		Returns:
			either (1) the row count for SQL Data Manipulation Language (DML) statementsor (2) 0 for SQL statements that return nothing

	(3):-like this we use another method to executeQuery();
	to	Parameters:
			sql an SQL statement to be sent to the database, typically astatic SQL SELECT statement
		Returns:
			a ResultSet object that contains the data producedby the given query; never null*/
	
		
	

	ResultSet resultSet =	statement1.executeQuery("select * from user where u_id=1");
	while(resultSet.next())
	{
	    System.out.println("u_id = "+resultSet.getInt(1)+"   s_nmae = "+resultSet.getString(2)+" s_email = "+resultSet.getString(3)+" s_ph = "+resultSet.getInt(4));
	}
		
	// eg: resultSet.getInt(1) is the index finder and we have match the datatype while printing 
	
		statement1.execute("update user set u_name='siva',u_email='siva@gmail.com',u_pwd=565256 where u_id=5");
		
		// query to update the values
		
		statement1.execute("delete from user where u_id=3");
		
		// query to delete the row
			
		statement1.execute("alter table user add u_ph integer");
		
		// query to add column
		
		statement1.execute("update user set u_ph=85235623 where u_id=1 ");
		
		// query to add values to added column
		
		
		statement1.execute("alter table user drop u_ph");

		// query to drop the column
		
			
		statement1.execute("drop table user");
		// query to drop the table
		statement1.close();	// close the connection
	}

