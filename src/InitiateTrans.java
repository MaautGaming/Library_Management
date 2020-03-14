import java.sql.*;
import java.util.Date;
import java.text.*;
public class InitiateTrans {
	
	public static void main(String Args[]){  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhu_lib","root","root");  
			Date date = new Date();
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date1 = formatter.parse("05/02/2020");
		PreparedStatement stmt=con.prepareStatement("INSERT INTO books_trans( reader, ISBN, contact_no, issue_date, expected_return_date) VALUES ('utkarsh','10000000','9838886776',?,?)");  
			//format of table is trans_id, reader, ISBN,contact_no, , issue_date, expected_return_date, actual_return_date
			//ResultSet rs=stmt.executeQuery("Insert into books VaLUES ("10000000","The Second Lady","utkarsh","Thiller",20);  
			java.sql.Date sqldate=new java.sql.Date(date.getTime());
			java.sql.Date sqldate1=new java.sql.Date(date1.getTime());
			stmt.setDate(1, sqldate);
			stmt.setDate(2, sqldate1);
			stmt.executeUpdate();  
			System.out.println("update successful!!!!!!!!");
			con.close();  
			}
		catch(Exception e){ System.out.println(e);}  
		} 
}
