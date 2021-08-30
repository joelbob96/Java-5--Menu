public class MenuItem{

	private String name;
	private double price;
	private String description;
	private int orderCode;


public MenuItem(){
	this.name = "Default Item Name";
	this.price = 0.00;
	this.description = "Default description";
	this.orderCode = 0;
}

public MenuItem(String name, double price, String description, int orderCode){
	this.name = name;
	this.price = price;
	this.description = description;
	this.orderCode = orderCode;
}

public void setName(String name){
	this.name = name;
}

public void setPrice(double price){
	this.price = price;
}

public void setDescription(String description){
	this.description = description;
}

public void setOrderCode(int orderCode){
	this.orderCode = orderCode;
}

public String getName(){
	return name;
}

public double getPrice(){
	return price;
}

public String getDescription(){
	return description;
}

public int getOrderCode(){
	return orderCode;
}

public String toString(){
	return "\n#" + orderCode + " " + name + ": " + price + " \"" + description + "\"";
}

}