
public class pizzaStrategy1  
{

	@Override
	public boolean order(Pizza p) {

		// Veggie pizza

		p.toppings.add("Mushrooms");
		p.toppings.add("Onions");
		p.toppings.add("Green Peppers");
		p.toppings.add("Black Olives");

		p.t.served.add(p);

		return true;
	}

}
