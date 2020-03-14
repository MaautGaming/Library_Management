import java.sql.*;  

public class InsertQuery{  
		public static void main(String Args[]){  
			try{  
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhu_lib","root","root");  
				
				Statement stmt=con.createStatement();  
				//format of table is ISBN, book_name, author_name, genre, Quantity
				//ResultSet rs=stmt.executeQuery("Insert into books VaLUES ("10000000","The Second Lady","utkarsh","Thiller",20);  
				stmt.executeUpdate("INSERT INTO books " + "VALUES ('10000000','The Second Lady','utkarsh','Thiller',20)");  
				System.out.println("update successful!!!!!!!!");
				con.close();  
				}
			catch(Exception e){ System.out.println(e);}  
			}  
			}  