import java.util.Date;
import java.util.Scanner;
public class Assignment1 {
    
	static Scanner scan=new Scanner(System.in);
	//Write a program to convert Celsius to Fahrenheit 
	     //using appropriate datatypes and literal conventions
	
	public static double celciusToFarenheit()
	{         
		    System.out.print("enter the celcius");
		    int celcius=scan.nextInt();
			return ((double)celcius*9/5)+32;
	}
	
	public static void findQuatraticEquation()
	{
     	System.out.print("enter the inputs:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		int val=b*b-(4*a*c);
		
		if(val>0)
		{
			double x1=(-b+Math.sqrt(val))/2*a;
			double x2=(-b-Math.sqrt(val))/2*a;
			System.out.println(x1+" "+x2);
		}
		else if(val==0)
		{
			double x=-b/2*a;
			System.out.println(x);
		}
		else
		    System.out.println("not an number");
	}	
		
	public static void bitwiseOperations()
	{
		System.out.print("enter the values:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println("Bitwise AND"+(a&b)+"\nBitwise OR"+(a|b)+"\nBitwise XOR"+(a^b)+"\nleft Shift:"+(a<<b)+"\nright shift"+(a>>b));
	}
	
	public static void calculateBmt()
	{
		System.out.println("enter the weight:");
		int weight=scan.nextInt();
		System.out.print("enter the height:");
		double height=scan.nextDouble();
		double res=weight/(height*height);
		System.out.println(res);
	}
	
	public static void convertTime()
	{
		System.out.print("enter the seconds:");
		int sec=scan.nextInt();
		int hour=sec/3600;
		int second=sec/60;
		sec=sec%3600;
		int min=sec/60;
		System.out.format("%d:%d:%d",hour,min,second);
	}	
	
}
