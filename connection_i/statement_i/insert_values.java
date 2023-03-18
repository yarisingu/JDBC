import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertvaluestotable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
  
  
		Class.forName("com.mysql.cj.jdbc.Driver");
    
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jehe7","root","root");
    
		Statement statement =	connection.createStatement();
    
		statement.execute("insert into std value(1,'tarun','tarun@gamil.com',123456)");
		statement.execute("insert into std value (2,'venkat','venkat@gmail.com',123369)");
		statement.execute("insert into std value(3,'jayaamma','jayaamma@gmail.com',123147)");
		statement.execute("insert into std value(4,'lakshman','lakshman@gmail.com',741231)");
		statement.execute("insert into std value(5,'asdfdfd','asdfgggg@gmail.com',987456)");
    
    //insert 5 rows at a time are else you can insert data one row at onetime
    
    //Hear we insert the data (id,name,gmail,number)
    
    
		System.out.println("data insert sucessfully");
    // print statement comes in console
    
		statement.close();// it is  
	}
}
