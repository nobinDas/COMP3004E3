import java.util.ArrayList;

public class Pizza {
	
Table table;  //the table at which this pizza is served
 
public String size;
public String crust;
public ArrayList<String> toppings=new ArrayList<String>();
public int cost;

public Pizza(, String size, String crust, Table t, int c) {
	
	this.size = size;
	this.crust = crust;
	this.table = t;
	this.cost = c;
	//hint: missing code here to order via the pizza strategy
	
}

}
