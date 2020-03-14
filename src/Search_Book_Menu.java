import java.util.Scanner;



public class Search_Book_Menu {
	
		private String bname;
		private String author;
		private String isbn;
		private String genre;

		
		Get_Input g = new Get_Input();
		Extractor_Books e =new Extractor_Books();
		public void startMenu() 
		{
			System.out.println("\t Search Books Menu \n\n");
			System.out.println(" 1. Search by Book name");
			System.out.println(" 2. Search by Author name");
			System.out.println(" 3. Search by ISBN ");
			System.out.println(" 4. Search by Genre ");
			System.out.println(" 5. Return to previous menu");
			System.out.println(" 6. Exit Application");
			Scanner sc = new Scanner(System.in);
			String choice;
			int ch;
			while(true) {
			try {
				choice = sc.next();
				ch = Integer.parseInt(choice);
				break;
			}
			catch(Exception e)
			{
				System.out.println("Oops!! Invalid option....\t Try a valid one.");
				choice = sc.next();
			}
			}
			switch(ch)
			{
			case 1: searchBookName();
					break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			default : System.out.println("Oops!! Invalid option....\t Try a valid one.");
			}
			sc.close();
			
			}
		
		

		private void searchBookName()
		{
			bname =	g.getbname();
			
			
		}
	
	
}
