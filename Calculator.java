package javafull;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int a,b,c,ch;
		System.out.println("Enter any two no: ");
		Scanner s=new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter your choice : ");
		ch=s.nextInt();
		switch(ch)
		{
			case 1:c=a+b;
			      System.out.println("Addition "+c);
			      break;
			case 2:c=a-b;
			      System.out.println("Subtraction "+c);
			      break;
			case 3: c=a*b;
			      System.out.println("Multiply "+c);
			      break;
			case 4:c=a/b;
			      System.out.print("Division "+c);
			      break;
			case 5:c=a%b;
			      System.out.println("Remember "+c);
			      break;
			default:
				  System.out.println("Invalid choice");
				
			
			
		
			
		}

	}

}
