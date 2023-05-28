class Shop // class name
{
// global variables
static String shopName = "Abcd";// class  specific field declaration
static int shop_id = 123;
int price; // object specific field decalaration - initail value will be zero, if we not assign
int discount;
public static void main(String[] args)
{
 // create an object(Instance)

Shop prod1 = new Shop();
Shop prod2 = new Shop();
Shop prod3 = new Shop();

// assigning the values to the created object for object specfic variables

prod1.price = 100; 
prod1.discount = 20;
prod2.price = 200;
prod2.discount = 10;

//method calling

int actual_price = prod2.sell(); // method calling statement-- object specfic method calling assinging the retun value into new local variable
System.out.println("Actual price is " + actual_price);

prod2.sell(); //  method calling procedure for Non - static method -- object specific method callig

prod1.bill();

int total_bill = prod1.bill();//object specific method calling with return value
System.out.println("Total_bill is " + total_bill);

prod1.sell();

Shop.clean();// method calling procedure for static method
//Shop.doubt();
}



//----------------------------------------


static void clean() // class specific method declaration
{
System.out.println("cleaning");
//System.out.println(this.discount);
}
//----------------------------------------------------------

int sell() // object specific method
{
int discount=30;
//System.out.println(price);
//System.out.println(discount); // print assigned value of local varibale 
//System.out.println(this.discount); // print assigned value of global instance variable
// where the vaibale names are same
System.out.println(this.price - this.discount);
return this.price - this.discount; // here 190 is the retun value, and return to method calling line.--it should be last line of current method
// System.out.println("error will occured")
}
//-------------------------------------------------------------------
int bill()
{
//System.out.println(price);//--- for practice
//return; // here return is nothing, so not mentioned in void method
//return 10: // incompatibility error will occur.because void method can not return any value to the method callig line.but here we try to reyrn int 10;
return shop_id;
}
//void doubt();
{
System.out.println(shopName);

}
//------------------------------------------------------------------
}
