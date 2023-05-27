class Honda

{

// Fields- Fields variables -Global variables
// - static, Non-static
// data members

// declaration static-- class specific variables
static int dealer_id =1234;
static String owner_name = "Kumar"; 

// declaration Non-static-- object specific variables
int price;
int cc;
float discount;

public static void main(String[] args)
{

// create objects-new is allocates memory to object
Honda shine     = new Honda();
Honda activa    = new Honda();
Honda unicorn   = new Honda();

// assigning the values to the objects for global varibaless
shine.price     =   65000;
activa.price    =   80000;
unicorn.price   =   125000;
shine.discount  =   5.0f;
activa.discount =   1.0f;



System.out.println(shine.price);
System.out.println(activa.price);
System.out.println(Honda.owner_name);
System.out.println(unicorn.owner_name);
System.out.println(owner_name);
//system.out.println(amount);--amount is a local variable

//object specific method calling statment
activa.buy(125000);
shine.buy(150000);

// class specfic method callling satement
offer();
Honda.offer();
shine.offer(); // class specific method calling statment by using object name
}
void buy(int amount) // object specific method
// amount - method local variable
{
System.out.println("Buying Honda Activa");
System.out.println(amount);
System.out.println("Buying Honda Bike " + amount); // concatination
}

static void offer() //class specific method
{
System.out.println("10% Discount");
}

}
