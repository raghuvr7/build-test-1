package day4.examples;

import java.util.Scanner;

public class question2{
	void errors() throws exception1,exception2,exception3
	{
		System.out.println("Select exception:\n1.Exception1 2.Exception2 3.Exception3 4.Out of bound 5.Exit");
		int ch;
		Scanner in=new Scanner(System.in);
		ch=in.nextInt();
		int []ar={1,2,3};
		if(ch<5)
		{
			switch(ch)
			{
			case 1:
				throw new exception1();
			case 2:
				throw new exception2();	
			case 3:
				throw new exception3();
			case 4:
				try{
					System.out.println(ar[10]);
				}
				catch(Exception e){
					System.out.println("Encountered ArrayIndexOutOfBounds exception");
					System.out.println(e);
				}
				break;
				
			}
		}
	}

	public static void main(String[] args){
		question2 q=new question2();
		try{
			q.errors();
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	
}

class exception1 extends Exception{
	exception1()
	{
		System.out.println("encountered 1st exception");
	}
}

class exception2 extends Exception{
	exception2()
	{
		System.out.println("encountered 2nd exception");
	}
}

class exception3 extends Exception{
	exception3()
	{
		System.out.println("encountered 3rd exception");
	}
}
