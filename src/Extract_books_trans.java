import java.sql.*;


public class Extract_books_trans {
	public static void main(String []args){  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhu_lib","root","root"); 
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from books_trans");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getDate(5)+"  "+rs.getDate(6)+"  "+rs.getDate(7));
			{
				Books_trans b =new Books_trans();
			b.setTrans_id(rs.getInt(1));
			b.setReader(rs.getString(2));
			b.setIsbn(rs.getString(3));
			b.setContact_no(rs.getString(4));
			b.setIssue_date(rs.getDate(5));
			b.setExpected_return_date(rs.getDate(6));
			b.setActual_date(rs.getDate(7));
			System.out.println(b.getTrans_id());
			//return b;
			  }
			con.close();
		}catch(Exception e){ System.out.println(e);}  
		}
}


