import java.util.Scanner;


public class Get_Input {
	
		public  String getbname()
		{
			Scanner sc= new Scanner(System.in);
			String bname =sc.next();
			while(!Input_Validator.isbname(bname))
			{
				bname =sc.next();
			}
			sc.close();
			return bname;
		}
		
		public  String getauthor()
		{
			Scanner sc= new Scanner(System.in);
			String author =sc.next();
			while(!Input_Validator.isauthor(author))
			{
				author =sc.next();
			}
			sc.close();
			return author;
		}
		
		public  String getreader()
		{
			Scanner sc= new Scanner(System.in);
			String reader =sc.next();
			while(!Input_Validator.isreader(reader))
			{
				reader =sc.next();
			}
			sc.close();
			return reader;
		}
		
		public  String getgenre()
		{
			Scanner sc= new Scanner(System.in);
			String genre =sc.next();
			while(!Input_Validator.isgenre(genre))
			{
				genre =sc.next();
			}
			sc.close();
			return genre;
		}
		
		public String getisbn()
		{
			Scanner sc= new Scanner(System.in);
			String isbn =sc.next();
			while(!Input_Validator.isisbn(isbn))
			{
				isbn =sc.next();
			}
			sc.close();
			return isbn;
		}
		
		public String getcontact()
		{
			Scanner sc= new Scanner(System.in);
			String contact =sc.next();
			while(!Input_Validator.iscontact(contact))
			{
				contact =sc.next();
			}
			sc.close();
			return contact;
		}
		
		public int getquantity()
		{
			Scanner sc= new Scanner(System.in);
			String quantity =sc.next();
			while(!Input_Validator.isquantity(quantity))
			{
				quantity =sc.next();
			}
			sc.close();
			return Integer.parseInt(quantity);
		}
}
