package javaReview;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Hello! What would you like to do?");
		System.out.println("1. Add two numbers");
		System.out.println("2. Reverse a String");
		System.out.println("3. Number Guessing Game");
		System.out.print("Input Number:");
		int choice = scan.nextInt();
		
		switch(choice) {
			case 1:
				sumOfTwo();
				break;
			case 2:
				reverseString();
				break;
			case 3:
				numberGuessGame();
				break;
		}
	}
	
	static void sumOfTwo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = scan.nextInt();
		
		System.out.print("Input second number: ");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("The sum is " + sum);
	}
	
	static void reverseString() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input String to revers: ");
		String toReverse = scan.nextLine();
		
		char reverseString[] = new char[toReverse.length()];
		
		for (int x = 0; x <= reverseString.length - 1 ; x++) {
				reverseString[x] = toReverse.charAt((reverseString.length - 1)- x);
		}
		
		for (char character:reverseString) {
			System.out.print(character);
		}
	}
	
	static void numberGuessGame() {
		Scanner scan = new Scanner(System.in);
		int randomNumber;
		int guess;
		
		Random random = new Random();
		randomNumber = random.nextInt(1,10);
		System.out.println(randomNumber);
		
		System.out.print("Guess a number between 1 - 10: ");
		guess = scan.nextInt();
		
		if(guess != randomNumber) {
			while (guess != randomNumber) {
				if(guess > randomNumber) {
					System.out.println("Wrong! the number is lower");
					System.out.print("Guess the Number: ");
					guess = scan.nextInt();
				} else if (guess < randomNumber) {
					System.out.println("Wrong! the number is higher");
					System.out.print("Guess the Number: ");
					guess = scan.nextInt();
				} 
				
			}
		}
		System.out.println("You got it!");
		
	}
}
