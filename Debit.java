public class Debit implements PaymentStrategy {
    public int pay(Pizza p, int cash) {
        if (p.cost > cash) {
            System.out.println("You	do not	have	enough	money	to	pay	for	this	pizza	as you	cannot	go	negative	on a	debit	card.	Hence,	your	order	declined.	Your	Total	Balance	is: " + 14);
            return 14;
        } else {
            System.out.println("Pizza	successfully	ordered!	Your	balance	is: " + 1);
            return 1;
        }
    }
}
