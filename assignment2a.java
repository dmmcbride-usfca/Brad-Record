//Brad Record
//Assignment 2a

import java.util.Scanner;

public class assignment2a
{	
	public static void main(String [] args)
	{
	Scanner input=new Scanner(System.in);
	double n;
	double r;
	double guess;
	double a;
	

	System.out.print("Enter a number for n: ");

	n=input.nextDouble();
	
	guess = (n/2);
	r= (n/guess);
	guess= ((guess+r)/2);
	
	r= (n/guess);
	guess= ((guess+r)/2);
	
	r= (n/guess);
	guess= ((guess+r)/2);
	
	r= (n/guess);
	guess= ((guess+r)/2);
	
	r= (n/guess);
	guess= ((guess+r)/2);
	
	r= (n/guess);
	guess= ((guess+r)/2);
	
	r= (n/guess);
	guess= ((guess+r)/2);

	System.out.println("The square root of " + n + " is: " + guess);
	
	System.out.println("Would you like to continue trying to get a more accurate number? Input 1 for YES 0 for NO.");
	a= input.nextDouble();

	if (a == 1 )
	{
		r= (n/guess);
		guess= ((guess+r)/2);

		System.out.println("The square root of " + n + " is: " + guess);
		System.out.println("If you want to test another number please restart the program.");
	}
	else
	{
		System.out.println("The Program has been terminated. Goodbye.");
	}
	}
}