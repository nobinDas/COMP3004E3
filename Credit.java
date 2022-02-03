public class Credit implements PaymentStrategy{

    public int pay(Pizza p, int cash){
        if(p.cost>cash){
            System.out.println("Pizza successfully ordered! Please keep	in mind	that you owe more money than how much you have in the bank. You	have a balance of: " + (cash-p.cost));
        }
        else{
            System.out.println("Pizza	successfully	ordered!	Your	balance	is: "+(cash-p.cost));
        }
        return cash-p.cost;
    }
}