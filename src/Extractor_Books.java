import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



public class Extractor_Books {
	
	private Connection con;
		
	public ArrayList<Books> extract() 
	{ 
		ArrayList<Books> books =new ArrayList<Books>();
		
		try
		{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhu_lib","root","root"); 
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from books");  
			while(rs.next())  
			{
				Books b= new Books();
				b.setIsbn(rs.getString(1));
				b.setBname(rs.getString(2));
				b.setAuthor(rs.getString(3));
				b.setGenre(rs.getString(4));
				b.setQuantity(rs.getInt(5));
				books.add(b);
			}
			con.close();
		}
		catch(Exception e){ System.out.println(e);}  
		finally
		{
			try 
			{
				con.close();
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
		}
		return books;
	}
}
