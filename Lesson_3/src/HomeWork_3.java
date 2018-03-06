import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		//Write a program that runs 10 times. The program ask the user for a word in each round.
		//The program will finally print the sentence with spaces between the words.

		System.out.println("Please enter 10 world : ");
		String str1=in.next();  //str1 the sentence between words
		for (int i=1;i<=10;i++) 
		{
			System.out.println(i+" word");
			str1+=in.next();
			str1+=" ";
		}
		System.out.print(str1);
		 */
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		//Write a program that ask a number from the user. The program prints a triangle from *.
		 
		System.out.println("Enter number : ");
		int numOflines=in.nextInt();
		for(int i=0;i<numOflines;i++) {
			for(int j=0;j<numOflines-i;j++)
				System.out.print( " ");
		for (int k = 0; k <=  i; k++) 
			System.out.print("*");
		System.out.println();
		}
*/
		/////////////////////////////////////////////////////////////////////////////////////////////
		/*
		// Write a program that generates 2 random numbers.
		// The program will check
		// A. Which number is biggest
		// B. Which number has more digits.
		// C. Is the number even / odd 
		// D. Is the number negative or positive.
		// E. The program will print * according to the number entered.
		Random rnd=new Random();
		int num1=rnd.nextInt(1100-100)+100;
		int num2=rnd.nextInt(10000-1000)+1000;
		if(num1>num2) 
			System.out.println("biggest number is num1");
		else 
			System.out.println("biggest number is num2");
		int count1=0;
		int count2=0;
		while(num1!=0)
		{
			num1/=10;
			count1++;
		}
		while(num2!=0)
		{
			num2/=10;
			count2++;
		}
		if(count1>count2) {
			System.out.println("in count1 more digits");}
		else if(count1<count2) {
			System.out.println("in count2 more digits");
		}
		else
			System.out.println("digits in two numbers is equally");
		if(num1>=0) 
			System.out.println(" num1 is  pozitive");
		else
			System.out.println("num1 is negative");
		if(num2>=0)
			System.out.println("num2 is pozitive");
		else
			System.out.println("num2 is negative");
		if (num1%2==0)
			System.out.println("num1 is even");
		else
			System.out.println("num1 is odd");
		if(num2%2==0)
			System.out.println("num2 is even");
		else
			System.out.println("num2 is odd");


		for(int i=1;i<=num1;i++)
		{
			System.out.print("*");
			System.out.println();
		}
		for(int i=1;i<=num2;i++)
		{
			System.out.print("*");
		}
		 */
		/////////////////////////////////////////////////
		/*
			//Write a program that get number from the user. The program will check if the number is Prime number
			boolean isPrime=true;
			System.out.println("Enter any number:");
			int primeNum=in.nextInt();
			int k=2;
			while(k<= primeNum/2)
			{
				if(primeNum % k == 0)
				{
					isPrime = false;
				}
				k++;
			}
				if(isPrime)
					System.out.println(primeNum + " is a Prime Number");
				else
					System.out.println(primeNum + " is not a Prime Number");*/
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
	}

}
