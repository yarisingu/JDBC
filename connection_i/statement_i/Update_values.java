import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Whatsapp_data {

	public static void main(String[] args) throws Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");


			Connection connection1 =	DriverManager.getConnection("jdbc:mysql://localhost:3306/whatsapp","root","root");
			Statement statement2 = connection1.createStatement();

      statement2.execute("update user set u_name='siva',u_email='siva@gmail.com',u_pwd=565256 where u_id=5");
			statement2.execute(update table_name set column_name='value',column_name='value'.... where column_name(primary key column)='value')
      
      // by use this code you can update the values to the table
			statement2.close();
			
	}
}
