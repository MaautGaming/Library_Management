import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public void mainMenu(String []args) {
		
		System.out.println("\t Welcome to BHU Library \n\n");
		System.out.println(" 1. Search books");
		System.out.println(" 2. Add a new book");
		System.out.println(" 3. Return book ");
		System.out.println(" 4. List of expected returns today");
		System.out.println(" 5. List of all books in library");
		System.out.println(" 6. Exit");
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
		}
		}
		switch(ch)
		{
		case 1: Search_Book_Menu s =new Search_Book_Menu();
				s.startMenu();
				break;
		case 2: break;
		case 3: break;
		case 4: break;
		case 5: break;
		case 6: Extractor_Books e =new Extractor_Books();
				displayBooks(e.extract());
				break;
		default : System.out.println("Oops!! Invalid option....\t Try a valid one.");
		}
	sc.close();
	}
	
	public void displayBooks(ArrayList<Books> Result)
	{
		whil
		System.out.println(Result.get(index)
	}
	
}
