package userInput;
import java.util.Scanner;
public class ScannerInput {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		/*
		 * this is a simple interest program
		 * which takes user:-
		 * 						-Name
		 * 						-Qualification
		 * 						-Principal Amount
		 * 						-Rate Of Interest
		 * 						-Time
		 * 						*Simple Interest=(principal*rate*time)/100 	
		 */
		System.out.println("Enter Your Full Name");
		String name=sc.nextLine();
		System.out.println("Enter Your Qualification");
		String qua=sc.nextLine();
		System.out.println("Enter Principal, rate, time");
		int principal=sc.nextInt();
		float rate=sc.nextFloat();
		int time=sc.nextInt();
		System.out.println("Name: "+name);
		System.out.println("Qualification: "+qua);
		System.out.println("Simple Interest= "+principal*rate*time/100);
	}

}
/*
Enter Your Full Name
Prateeksha N More
Enter Your Qualification
Btech in Comp
Enter Principal, rate, time
1000
8.64
24
Name: Prateeksha N More
Qualification: Btech in Comp
Simple Interest= 2073.6
*/