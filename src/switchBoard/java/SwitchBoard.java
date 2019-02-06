package switchBoard.java; 

import java.util.Scanner;

public class SwitchBoard {

	static Scanner input = new Scanner(System.in);
	static Scanner inputString = new Scanner(System.in);
	
	final static int creditCardfee = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		do{
		//Giving user a choice
		System.out.println("1.Calculate tip");
		System.out.println("2.Reverse A String?");
		System.out.println("3.Quit the program");
		System.out.print("Enter 1, 2 0r 3 : ");
		
		choice= input.nextInt();
	
		System.out.println();
		
		//Switch statement to implement method as the choice
		switch(choice){
		case 1:
			//call tipCalculator method
			System.out.println("You choose to calculate tip");
			tipCalculator();
			break;
		case 2:
			//call reversString 
			System.out.println("You choose to reverse a string");
			ReverseString();
			break;
		case 3:
			//end the loop
			System.out.println("See you later");
			break;
		default:
				System.out.println("Wrong entry! You entered " + choice);
		
		}
		}while (choice!=3);
	}
	
	public static void tipCalculator(){
		//Init total amount
		double totalAmount = 0;
		
		//Ask user for check amount
		System.out.print("Enter check amount ");
		double checkAmount = input.nextDouble();
		
		System.out.println();
		
		//Ask user for the tip percentage
		System.out.print("Enter tip percentage ");
		
		
		int tipPercent = input.nextInt();
		
		
		String cash_Credit;
		
		
		//calculating total on the basis of credit or cash for correct input
		//Loop continues until entered cash or credit.
		do{
			System.out.print("Please type cash or credit for the payment: ");

			cash_Credit = inputString.nextLine();
			cash_Credit = cash_Credit.toUpperCase();
			//cash_Credit.toLowerCase();
			System.out.println();
			switch(cash_Credit){
			//Calculation with cash payment
			case "CASH":
				System.out.println("You have choose to pay with " + cash_Credit);
				System.out.println("Initial check amount $" + checkAmount);
				System.out.println("Tip Amount "+tipPercent+ " percent");
				totalAmount = checkAmount + (checkAmount*tipPercent)/100;
				System.out.printf("Your tatal is $%.2f",totalAmount);
				System.out.println();
				break;
				//Calculating credit card payment
			case "CREDIT":
				System.out.println("You have choose to pay with " + cash_Credit);
				System.out.println("Initial check amount $" + checkAmount);
				System.out.println("Tip Amount "+tipPercent+ " percent");
				System.out.println("Credit card processing fee "+creditCardfee+"%");
				totalAmount = checkAmount + (checkAmount*tipPercent)/100 + (checkAmount*creditCardfee)/100;
				System.out.printf("Your tatal is $%.2f",totalAmount);
				System.out.println();
				break;
			default:
				System.out.println("You typed " + cash_Credit);
				continue;
			}
			
		}while(!cash_Credit.equals("CASH")&&!cash_Credit.equals("CREDIT"));
		
		
		System.out.println();
	}
	
	
	public static void ReverseString(){
		
		//Ask user for a string
		System.out.println("Enter a String ");
		String userString = inputString.nextLine();
		//Change string to char array
		char[] charArray = userString.toCharArray();
		
		//Declare an array to hold reverse charArray
		char[] reverseArray = new char[charArray.length];
		
		//Declaring a char variable for store temporary value 
		char aChar;
		//Populating reverseArray from charArray in reverse way
		for(int i= 0; i<charArray.length;i++){
			aChar=charArray[charArray.length-1-i];
			reverseArray[i] = aChar;
		}
		
		//Declaring a String variable to convert reverseArray to string
		String reverseString="";
		for(int i = 0; i<reverseArray.length;i++){
			reverseString = reverseString+reverseArray[i];

		}
		//Printing total output
		System.out.println("String in reverse way : "+reverseString);
		
		System.out.println("Length of the String: "+charArray.length);
		System.out.println("Displaying String in uppercase: "+userString.toUpperCase());
		System.out.println("");
	}

}