//Brad Record
//Assignment 2b

import java.util.Scanner;

public class assignment2b
{
	public static void main(String [] args)
	{
	Scanner input=new Scanner(System.in);

	String i1;//i=items
	String i2;
	String i3;
	int q1;//q=quantity
	int q2;
	int q3;
	double p1;//p=price
	double p2;
	double p3;
	double t1;//t=total
	double t2;
	double t3;
	double st = 0;//st=subtotal
	double tax = 0;
	double ct = 0;//ct=complete total

	System.out.println("Input name of item 1: ");
	i1 = input.nextLine();

	System.out.println("Input quantity of item 1: ");
	q1 = input.nextInt();

	System.out.println("Input price of item 1: ");
	p1 = input.nextDouble();
	input.nextLine();

	System.out.println("Input name of item 2: ");
	i2 = input.nextLine();

	System.out.println("Input quantity of item 2: ");
	q2 = input.nextInt();

	System.out.println("Input price of item 2: ");
	p2 = input.nextDouble();
	input.nextLine();

	System.out.println("Input name of item 3: ");
	i3 = input.nextLine();

	System.out.println("Input quantity of item 3: ");
	q3 = input.nextInt();

	System.out.println("Input price of item 3: ");
	p3 = input.nextDouble();
	input.nextLine();

	t1 = q1 * p1;
	t2 = q2 * p2;
	t3 = q3 * p3;
	st = t1 + t2 + t3;
	tax = st * 0.0625;
	ct = st+tax;

	System.out.printf("%-30s %-10s %-10s %-10s\n", "Item", "Quantity","Price", "Total");
	System.out.printf("%-30s %-10s %-10s %-10s\n", i1, q1, p1, t1);
	System.out.printf("%-30s %-10s %-10s %-10s\n", i2, q2, p2, t2);
	System.out.printf("%-30s %-10s %-10s %-10s\n", i3, q3, p3, t3);
	System.out.printf("%-30s %-10s %-10s %-10s\n", "Subtotal", "", "", st);
	System.out.printf("%-30s %-10s %-10s %-10s\n", "6.25% sales " + "tax", "", "", tax);
	System.out.printf("%-30s %-10s %-10s %-10s\n", "Total", "", "", ct);
	}
}