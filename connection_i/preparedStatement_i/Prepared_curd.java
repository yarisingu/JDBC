import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Crud_operation_usingprepared {
	public static void main(String[] args) throws Exception {Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "root");boolean b = true;
		Scanner sc = new Scanner(System.in);int a;
		while (b) {
			System.out.println("Select the option 1.insert   2.update  3.delete_the_row   4.fetch the data based on id  "+ "5. retrive data   6. drop table 7. exit");
			System.out.println(" enter the id ");a = sc.nextInt();
			switch (a) {
			case 1: {
				PreparedStatement preparedStatement = connection.prepareStatement("insert into data values(?,?,?,?)");
				System.out.println(" Enter the data in this format numaric , string , string , numaric ");int i = sc.nextInt();
				String s = sc.next();String s1 = sc.next();int i1 = sc.nextInt();preparedStatement.setInt(1, i);
				preparedStatement.setString(2, s);preparedStatement.setString(3, s1);preparedStatement.setInt(4, i1);preparedStatement.execute();
				break;
			}
			case 2: {
				PreparedStatement preparedStatement = connection.prepareStatement("update data set d_name =?, d_email=? , d_ph=? where d_id=?");
				System.out.println(" Enter the data in this format  string , string  , numaric,  id ");
				String s=sc.next();
				String s1=sc.next();
				int i= sc.nextInt();
				int i1= sc.nextInt();
				preparedStatement.setString(1, s);
				preparedStatement.setString(2, s1);
				preparedStatement.setInt(3, i);
				preparedStatement.setInt(4, i1);
				preparedStatement.executeUpdate();
				break;
			} 
			case 3: {
				System.out.println(" Enter the id to delete row ");
				PreparedStatement preparedStatement = connection.prepareStatement("delete from data where d_id=?");
				int i = sc.nextInt();
				preparedStatement.setInt(1, i);
				preparedStatement.execute();
				break;
			}
			case 4:{
				PreparedStatement preparedStatement = connection.prepareStatement("select * from data where d_id=?");
				System.out.println("enter the id to fetch details");
				int i=sc.nextInt();
				preparedStatement.setInt(1, i);
				ResultSet resultSet = preparedStatement.executeQuery();
				while(resultSet.next())
				System.out.println("d_id = "+resultSet.getInt(1)+" d_ename = "+resultSet.getString(2)+" d_email = "+resultSet.getString(3)+" d_ph = "+resultSet.getInt(4));
			}
			case 5:{
				
			}
			case 7:{
				b=false;}}}connection.close();}}

