import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.*;

public class Project5{

	public static void main(String[] args){
	 
	 //MenuItem defaultItem = new MenuItem();
	 
	 //MenuItem Item1 = new MenuItem("Cheeseburger", 3.99, "A Hamburger with cheese on it", 1);
	 
	 Menu Menu1 = new Menu("Menu 1");
	 
	try{
		Scanner input = new Scanner(Paths.get("Menu.csv"));
		while(input.hasNext()){
			String row = input.nextLine();
			
			String temp[] = row.split("\t");
			
			if((temp != null) && (temp.length == 4)){ //&& temp.length() == 4){
			String item = temp[0];
			//System.out.println(item + "\n");
			double price = Double.parseDouble(temp[1]);
			String description = temp[2];
			int orderNumber = Integer.parseInt(temp[3]);
			
			
			
			MenuItem tempItem = new MenuItem(item, price, description, orderNumber);
			Menu1.addItem(tempItem);
			}
			//System.out.println(row);
			//System.out.println("\n");
		}
		
		
	}catch( IOException e ){
			e.printStackTrace();
		}
		
		//System.out.println(Menu1);
		
		boolean quit = false;
		Scanner userInput = new Scanner( System.in );
		String userCommand = null;
		
		Ticket Ticket1 = null;
		
		while (quit != true){
			System.out.println("Please enter a command: (h for help, q to quit)\n");
			userCommand = userInput.nextLine();
			switch(userCommand){
				case "menu":
				System.out.println(Menu1);
				break;
				
				case "q":
				quit = true;
				break;
				
				case "new":
				System.out.println("Enter new ticket number:\n");
				userCommand = userInput.nextLine();
				Ticket1 = new Ticket(Integer.parseInt(userCommand));
				break;
				
				case "add":
				if(Ticket1 == null){
					System.out.println("You must first create a ticket to use this command");
					break;
					}
				System.out.println(Menu1);
				System.out.println("Please enter the code for the item you want to add to the ticket: (\"stop\" to stop adding items)\n");
				
				do{
				userCommand = userInput.nextLine();
				Ticket1.addItem(Menu1.get((Integer.parseInt(userCommand) - 1)));
				} while(userInput.hasNextInt() == true);
				break;
				
				case "print":
				if(Ticket1 == null){
					System.out.println("You must first create a ticket to use this command");
					break;
					}
				System.out.println(Ticket1);
				break;
				
				
				case "total":
				if(Ticket1 == null){
					System.out.println("You must first create a ticket to use this command");
					break;
					}
				System.out.println(Ticket1.getTotal());
				break;
				
				case "delete":
				if(Ticket1 == null){
					System.out.println("You must first create a ticket to use this command");
					break;
					}
				Ticket1 = null;
				break;
				
				
				default:
				System.out.println("Commands: \n menu-View Menu \n q-Quit\n new-Create new ticket\n print-Print ticket\n total- Total ticket\n delete- Delete ticket");
				break;
				
			}
		}
	 
	 
	 
	 //Menu Menu1 = new Menu("Joel's Menu");
	 
	 //Menu1.addItem(Item1);
	 
	 //System.out.println(Menu1);
	 
	 //Ticket Ticket1 = new Ticket(12);
	 
	 //Ticket1.addItem(Item1);
	 
	 //System.out.println(Ticket1);
	 
	 
	 //System.out.println(Item1.getDescription());
	 
	 //Item1.setDescription("A patty made with high quality ground beef of a whole wheat bun with Lettace tomatoe and American Cheese");
	 
	 //System.out.println(Item1.getDescription());
	}
}