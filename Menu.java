import java.util.ArrayList;

public class Menu{
	private String restaurantName;
	private ArrayList <MenuItem> theMenu;
	
	
	public Menu (String restaurantName){
		this.restaurantName = restaurantName;
		theMenu = new ArrayList<>();
	}
	
	public void setRestaurantName(String restaurantName){
	this.restaurantName = restaurantName;
	}
	
	public String getRestaurantName(){
		return restaurantName;
	}
	
	public MenuItem get(int i){
		return theMenu.get(i);
	}
	
	public void addItem(MenuItem m){
		theMenu.add(m);
	}
	
	public String toString(){
		
		String results = ":";
		
		for(MenuItem m : theMenu) {
        results += m.toString(); //if you implement toString() for MenuItem then it will be added here
		}
		
		return restaurantName + results + "\n";
	}

}