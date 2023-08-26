package Bill_Gen;

public class Pizza {
    protected int price;
    private boolean veg;
    private int Addchees=100;
    private int AddToppings=150;
    private boolean chees =false;
    private boolean toppings =false;
    private boolean TakeAway=false;
    public Pizza(boolean veg) {
        this.veg = veg;
        if(veg)
        {
            this.price=300;
            System.out.println("veg pizza selected");
        }
        else
        {System.out.println("Non-veg pizza selected");
            this.price=400;
        }
    }
    public void addChees(){
        chees =true;
        this.price=price+Addchees;
    }
    public void addToping(){
        toppings=true;
        this.price=price+AddToppings;

    }
    public void takeAway(){
        TakeAway=true;
        this.price=price+20;
    }
    public void bill(){
        if(chees) System.out.println("Extra chees added");
        if(toppings) System.out.println("Extra toppings added");
        if(TakeAway) System.out.println("Take away bageg added");
        System.out.println("Final bill is: "+price);
    }

}



