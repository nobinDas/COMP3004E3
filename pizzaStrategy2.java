
public class pizzaStrategy2
{

	@Override
	public boolean order(Pizza p) {

		p.toppings.add("Pepperoni");
		p.toppings.add("Steak");

		p.t.served.add(p);

		return true;
	}

}