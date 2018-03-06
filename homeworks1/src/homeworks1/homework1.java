package homeworks1;

public class homework1 {

	public static void main(String[] args) {
		/*1.Declare 5 numbers with any value
    Create another number that sums the value of the other number.
    Declare another number that will contain the average of the 5 numbers*/

		int num1=3;
		int num2=2;
		int num3=7;
		int num4=5;
		int num5=1;
		int sum=num1+num2+num3+num4+num5;
		System.out.println("sum of 5 integers = "+sum);
		double avg=(num1+num2+num3+num4+num5)/2;
		System.out.println("average of 5 integers = "+avg);

		/*2.Declare a String with any length of text
    Create 2 chars - one will hold the first letter of the string and the other one will       
    hold the Last letter*/
		String str="Compiler";
		int length=str.length();
		System.out.println(length);
		String firstChar=str.substring(0,1);
		String lastChar=str.substring(7);
		System.out.println("First character is "+firstChar);
		System.out.println("Last character is "+lastChar);

		/*3.Declare a String (of numbers only) with any length (id for example)
     And get the last char from the string as a number.*/
		String id="987654321";
		int lengthId=str.length();
		System.out.println("Length id is "+lengthId+" characters");
		String lastId=id.substring(8);
		int lastIdInt = Integer.valueOf(lastId);
		System.out.println("Last id in string - "+lastId);
		System.out.println("Last id in integer - "+lastIdInt);

		/*4.Declare 3 numbers with any value
    And print the sum of the last digits.*/
		int number1=20;
		int number2=30;
		int number3=40;
		int sumOfNum=number1%10+number2%10+number3%10;
		System.out.println("Summary of 3 numbers is "+ sumOfNum);


		/*5.Create a String that contain your full name
   Create another String that get the last name from the first one
   And print the result.*/
		String myName="Daniel Pushkariov";
		int i=myName.indexOf(" ");
		String myLastName=myName.substring(i);
		System.out.println("My last Name is"+myLastName);

		/* Declare a String with the word “wikipedia”
         Create 2 chars, the first contain the letter number at place 2 and the second   
         contain the  letter at place 6  and Print the results.*/
		String str1="wikipedia";
		char one=str1.charAt(2);
		char two=str1.charAt(6);
		System.out.println("letter number at place 2 is "+one);
		System.out.println(" letter number at place 6 is "+two);

		/*  Declare 2 Strings, the first contain the word “hello” and the second contain your 
         name and Print them in one sentence.*/
		String first="Hello";
		String second="Daniel";
		System.out.println(first+" "+second);
	}

}
