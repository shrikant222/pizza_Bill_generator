package Bill_Gen;

public class DeluxPizza extends Pizza {

    public DeluxPizza(boolean veg) {
        super(veg);
        addChees();
        addToping();
    }
    boolean TakeAway=false;
    public void takeAway(){
        TakeAway=true;
        this.price=price+20;
    }
    public void bill(){
        System.out.println("delux pizza is selected");
        if(TakeAway) System.out.println("Take away bageg added");
        System.out.println("Final bill is: "+price);
    }
}
