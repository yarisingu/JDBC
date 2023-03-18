import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Alter_table {

	public static void main(String[] args) throws Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/whatsapp","root","root");
		Statement statement2 = connection1.createStatement(); 

		// from hear establish the connection and ready to execute the query

		statement2.execute("create table user(u_id integer primary key , u_name varchar(55) not null,u_email varchar(55) not null , u_pwd integer not null) ");

		// hear we creating the user table to database whatsapp

		statement2.execute("insert into user values (1,'tarun','tarun@gmail.com',5333233)");
		statement2.execute("insert into user values(2,'suresh','suresh@gmail.com',555555)");
		
		// hear we insert the values to the table user

		statement2.execute("delete from user where u_id=2");
		
		// This is the query to delete the entire row
		
		statement2.execute("alter table user add u_ph integer");
		
		// This is the query to add column to the table

		statement2.execute("update user set u_ph=85235623 where u_id=1 ");
		// Hear we update the value to the new column

		statement2.execute("alter table user drop u_ph");

		// This is the query to alter the table column
		statement2.close();
			
	} 

}
