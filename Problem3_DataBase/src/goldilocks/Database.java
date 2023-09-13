package goldilocks;

import java.sql.Connection;

public class Database {
	public static void main(String[] args) {
		Connection con=null;
		String url="jdbc:mysql://localhost/test";
		String user="root";
		String pass="ayush";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,user,pass);
			String query="Select employeeName,employeeAge from test";
			PreparedStatement statement=con.prepareStatement(query);
			ResultSet result=statement.executeQuery();
			int counter=1;
			System.out.println("EmployeeId"+"\t\t"+"Employee Name"+"\t\t"+"Employee Age");
			while (result.next()) {
	                String empName = result.getString("employeeName");
	                String empAge = result.getString("employeeAge");
	                System.out.println(counter+"\t\t\t"+empName+"\t\t\t"+empAge);
	            }
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
