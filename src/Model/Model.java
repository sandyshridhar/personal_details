package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Model 
{
	String url="jdbc:oracle:thin:@//localhost:1521/XE";
	String uname="system";
	String pwd="system";
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet res=null;
	String std_name=null;
	String std_id=null;
	String password=null;
	
	public Model()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, uname, pwd);
			System.out.println("Driver loaded and Connection established");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_id() {
		return std_id;
	}
	public void setStd_id(String std_id) {
		this.std_id = std_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
