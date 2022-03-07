import java.util.Scanner;

public class SueldoOperario {
	public static void main (String[] ar) {
		Scanner keyboard=new Scanner(System.in);
		int hours;
		float costHour;
		float salary;
		System.out.print("enter the number of hours worked");
		hours=keyboard.nextInt();
		System.out.print("enter the cost per hour");
		costHour=keyboard.nextFloat();
		salary=hours*costHour;
		System.out.print("the salary is= $"+salary);
		
	}
	

}
