package day4.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class banking {

	public static void main(String[] args) throws error {

int amount=3000,ch=0;
while(ch!=4)
{
	System.out.println("enter choice:\n1.Deposit 2.Withdrawl 3.Balance enquiry 4.Exit");
	Scanner in=new Scanner(System.in);
	ch=in.nextInt();
	switch (ch)
	{
	case 1:System.out.println("enter amount to be deposited");
	int temp;
	try{
		temp=in.nextInt();
	amount=amount+temp;
	System.out.println("New balance: "+amount);
}
catch(InputMismatchException ime){
	System.out.println("exception" +ime);
	System.out.println("Characters are entered instead of number");
}
	break;
	case 2:System.out.println("enter amount to withdraw");
	temp=in.nextInt();
	if(amount-temp<0)
		throw new error();
	else{
	amount=amount-temp;
	System.out.println("New balance: "+amount);
	}
	break;
	case 3:System.out.println("current balance is: "+ amount);
	break;
	}
}
}
}


class error extends Exception
{
	

public error()
    {
	System.out.println("Insufficient amount in your account");
	}
}
