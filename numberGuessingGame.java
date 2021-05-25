package numberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Enter number of chances You want to play : ");
		int chances = sc.nextInt();
		
		for(int i=0; i<chances;i++) {
		System.out.print("Enter Your Guessed Number : ");
		int userInput = sc.nextInt();
		
		int computerInput = rand.nextInt(3);
		System.out.println("Computer's Guessed Number : " + computerInput);
		
		if(userInput != computerInput) {
			System.out.println("wrong guess!!");
		}
		else {
			count++;
			System.out.println("right guesses!!");
		}
		}
		sc.close();
		System.out.println("Total number of right guess : "+count);
	}

}
