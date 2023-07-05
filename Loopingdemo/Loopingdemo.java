package Namakkal;

public class Loopingdemo {
	public static void main(String[] args) {
		Loopingdemo ld = new Loopingdemo();
//		ld.create_C();
//		ld.create_E();
//		ld.create_F();
//		ld.create_H();
//		ld.create_I();
//		ld.create_L();
//		ld.create_O();
//		ld.create_J();
//		ld.create_T();
//		ld.create_D();
//		ld.create_B();
		
		ld.create_Y();
		ld.create_A();
		}

	 private void create_A() {
		// TODO Auto-generated method stub
		
	}

	void create_Y() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{if(row==1||row==2||row==3||row==4||row==5)
		{
			for(int column=1;column<=9;column++)
			{
				if(column==row||column==10-row) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		
		else 
		{
			for(int column=1;column<=9;column++)
			{
				if(column==5)
				{
					System.out.print("* ");
				}	
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		}
		}
	

	 void create_B() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if(row==1 || row==9|| row==5)
			{
				for(int column=1;column<=8;column++)
				{
					System.out.print("* ");
				}
			}
			else
				{
				for(int column=1;column<=9;column++)
					{
						if(column==1 || column==9)
						{
							System.out.print("* ");
						}
						else
						{
							System.out.print("  ");
						}
					}
				}System.out.println();
			}	
	}

	 void create_D() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if(row==1 || row==9)
			{
				for(int column=1;column<=8;column++)
				{
					System.out.print("* ");
				}
			}
			else
				{
				for(int column=1;column<=9;column++)
					{
						if(column==1 || column==9)
						{
							System.out.print("* ");
						}
						else
						{
							System.out.print("  ");
						}
					}
				}System.out.println();
			}
	}

	 void create_T() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if(row==1)
			{
				for(int column=1;column<=9;column++)
				{
					System.out.print("* ");
				}
			}
			else
				{
					for(int column=1;column<=9;column++)
						if(column==5)
						{
							System.out.print("* ");
						}
						else 
						{
						System.out.print("  ");	
						}
				}
			
			System.out.println();
			}
	}

	 void create_J() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if(row==1)
			{
				for(int column=1;column<=9;column++) 
				{
					System.out.print("* ");
				}
			}
			else if(row==2 || row==3 || row==4|| row==5) {
				for(int column=1;column<=9;column++)
				{
					if(column==5)
					{
						System.out.print("* ");
					}
					else 
					{
						System.out.print("  "); 
					}
				}
				}
			else if(row==6 || row==7 ||row ==8)
			{
				for(int column=1;column<=9;column++)
				{
					if(column==1 || column==5)
					{
						System.out.print("* ");
					}
					else 
					{
						System.out.print("  ");
					}
				}
			}
			else {
				for(int column=1; column<=5;column++) {
					System.out.print("* ");
				}
			}System.out.println();
		}
		
	}

	 void create_O() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if(row==1 || row==9)
			{
				for(int column=1;column<=9;column++)
				{
					System.out.print("* ");
				}
			}
			else
				{
				for(int column=1;column<=9;column++)
					{
						if(column==1 || column==9)
						{
							System.out.print("* ");
						}
						else
						{
							System.out.print("  ");
						}
					}
				}System.out.println();
			}
			
			}
	

	 void create_L() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if(row==9)
			{
				for(int column=1;column<=9;column++)
				{
					System.out.print("* ");
				}
			}
			else
				{
				System.out.print("* ");
				}
			
			System.out.println();
			}
			}	
	

	 void create_I() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if(row==1 || row==9)
			{
				for(int column=1;column<=9;column++)
				{
					System.out.print("* ");
				}
			}
			else
				{
					for(int column=1;column<=9;column++)
						if(column==5)
						{
							System.out.print("* ");
						}
						else 
						{
						System.out.print("  ");	
						}
				}
			
			System.out.println();
			}
	}

	void create_F() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if(row==1 || row==5)
			{
				for(int column=1;column<=9;column++)
				{
					System.out.print("* ");
				}
			}
			else
				{
				System.out.print("* ");
				}
			
			System.out.println();
			}
	}

	 void create_E() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if(row==1 || row==9 ||row ==5)
			{
				for(int column=1;column<=9;column++)
				{
					System.out.print("* ");
				}
			}
			else
				{
				System.out.print("* ");
				}
			
			System.out.println();
			}
	}

	 void create_H() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if(row==5)
			{
				for(int column=1;column<=9;column++)
				{
					System.out.print("* ");
				}
			}
			else
				{
				for(int column=1;column<=9;column++)
					{
						if(column==1 || column==9)
							{
								System.out.print("* ");
							}
						else {
							System.out.print("  ");
						}
					}	
				}
			System.out.println();
		}	
	}

	void create_C() 
		{
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if(row==1 || row==9)
			{
				for(int column=1;column<=9;column++)
				{
					System.out.print("* ");
				}
			}
			else
				{
				System.out.print("* ");
				}
			
			System.out.println();
			}
			}		
		}
	
