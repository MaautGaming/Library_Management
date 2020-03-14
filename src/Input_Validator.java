
public class Input_Validator {
	
	private static final int MAX_BOOK_NAME_LENGTH = 80;
	private static final int MAX_AUTHOR_NAME_LENGTH = 50;
	private static final int MAX_READER_NAME_LENGTH = 50;
	private static final int MAX_GENRE_LENGTH = 50;
	private static final int MAX_ISBN_NAME_LENGTH[] = {10,13};
	private static final int MAX_QUANTITY_VALUE = 100;
	private static final int CONTACT_LENGTH = 10;
	
	public static boolean isbname(String bname)
	{
		if(bname.length()> MAX_BOOK_NAME_LENGTH)
		{System.out.println("Sorry, book name is too long. Try abrevations!!!");
			return false;
		}
			
		if(bname.length()==0)
		{System.out.println("Sorry, book name can't be empty!!!");
		return false;
		}
		else
			return true;
	}
	
	public static boolean isauthor(String author)
	{
		if(author.length()> MAX_AUTHOR_NAME_LENGTH)
		{
			System.out.println("Sorry, author name is too long. Try Initials !!!");
			return false;
		}
		if(author.length()==0)
		{
			System.out.println("Sorry, author name can't be empty!!!");
			return false;
		}
		else
			return true;
	}
	
	public static boolean isreader(String reader)
	{
		if(reader.length()> MAX_READER_NAME_LENGTH)
		{
			System.out.println("Sorry, Reader name is too long. Try Initials !!!");
			return false;
		}
		if(reader.length()==0)
		{
			System.out.println("Sorry, reader name can't be empty!!!");
			return false;
		}
		else
			return true;
	}
	
	public static boolean isgenre(String genre)
	{
		if(genre.length()> MAX_GENRE_LENGTH)
		{
			System.out.println("Sorry, genre name is too long. Try Initials !!!");
			return false;
		}
		else
			return true;
	}
	
	public static boolean iscontact(String contact)
	{	long ch;
		try {
			ch = Long.parseLong(contact);
		}catch(Exception e)
		{
			System.out.println("Contact Number must be numeric only !!!");
			return false;
		}
		if(ch<0)
		{
			System.out.println("Contact Number must be numeric only !!!");
			return false;
		}
		else
			{if(contact.length()!=CONTACT_LENGTH)
		{
			System.out.println("Contact Number must be of length 10 !!!");
			return false;
		}
		else
			return true;
	}
	}
	
	public static boolean isisbn(String isbn)
	{	long ch;
		try {
			ch = Long.parseLong(isbn);
		}catch(Exception e)
		{
			System.out.println("Contact Number must be numeric only !!!");
			return false;
		}
		if(ch<0)
		{
			System.out.println("Contact Number must be numeric only !!!");
			return false;
		}
		else {
		if(isbn.length()<MAX_ISBN_NAME_LENGTH[0])
			return false;
		if(isbn.length()>MAX_ISBN_NAME_LENGTH[1])
			return false;
		else
			return true;
	}
	}
	
	public static boolean isquantity(String quantity)
	{
		int ch;
		try {
			ch = Integer.parseInt(quantity);
		} catch(Exception e)
		{
			System.out.println("Quantity must be numeric only !!!");
			return false;
		}
		
		if(ch<0)
		{
			System.out.println("Quantity must be positive only !!!");
			return false;
		}
			
		if(ch==0)
		{
			System.out.println("0 quantity can't be added !!!!");
			return false;
		}
		if(ch>MAX_QUANTITY_VALUE)
		{
			System.out.println("Can't have store this much same book");
			return false;
		}
		else
			return true;
	}
}
