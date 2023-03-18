import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
// this code is only used to create connection and create the database
public class App {
	public static void main(String[] args) throws Throwable {
    
    // tis is method used to show the path address of driver class 
    // note:- before adding this add the mysql connector dependency in pom.xml file in maven project
		Class.forName("com.mysql.cj.jdbc.Driver");
    
    // this is the Connection interface to connect the mysql workbench.
    // 3306 is port number might be change and root is username and password it also might be change.
    // springdata is the database name. 
    // note: this is the my database name.
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springdata","root","root");
    
    //this is the statement interface to do the operation in static.
		Statement statement =	connection.createStatement();
    // you can create the database by using this query
    // statement.execute(create database springdata);
    //statement.execute() is to method to execute sql query
 
     statement.execute("create table tyre (t_id integer primary key , t_name varchar(55) not null, t_size integer)");
    // this query is used to create the table
    
			System.out.println("table created sucessfully");
			statement.close();
	}
}
