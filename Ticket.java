import java.util.ArrayList;
import java.text.DecimalFormat;

public class Ticket{

	private int tableNumber;
	private ArrayList <MenuItem> theTicket;
	
	public Ticket(int tableNumber){
		this.tableNumber = tableNumber;
		theTicket = new ArrayList<>();
	}
	
	public void setTableNumber(int tableNumber){
		this.tableNumber = tableNumber;
	}
	
	public int getTableNumber(){
		return tableNumber;
	}
	
	public void addItem(MenuItem m){
		theTicket.add(m);
	}
	
	public double getTotal(){
		double total = 0;
		for(MenuItem m : theTicket){
			total += m.getPrice();
		}
		
		return total;
	}
	
	public String toString(){
		
		String results = "";
		
		String total = Double.toString(getTotal());
		
		//DecimalFormat df = new DecimalFormat(".##");
		
		for(MenuItem m : theTicket) {
        results += m.toString(); //if you implement toString() for MenuItem then it will be added here
		}
		
		return "Table#:" + Integer.toString(tableNumber) + results; // + "\nTotal:" + total + "\n";
	}
}