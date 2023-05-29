//class Shopping
//{
//public static void main(String[] args)
//{
//int amount = 1000;
//Shopping myself = new Shopping();
//myself.purchase(amount); // pass by value
//
//}
//void purchase(int cash)
//{
//System.out.println("came to Shopping with " + cash);// pass values by value name will same as passing
//}
//}

//------------------------------------
// pass by value
class Shopping
{
//static int balaji=750;
//int amount = 1000;
public static void main(String[] args)
{
int amount = 1000; //instance variable
Shopping myself = new Shopping();
myself.purchase(amount); // assigned value in amount passed
System.out.println("from main method " + amount);
//Shopping.doubt(balaji);
}
void purchase(int amount) // assigned value in amount passed-- pass by value
{
System.out.println("came to Shopping with " + amount);// value from instance variable passed
amount = 500;
System.out.println("return to home with " + amount); // value from local variable passed
}
//static void doubt(int balaji)
//{
//System.out.println(balaji);
//}
}

  
