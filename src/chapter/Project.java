package chapter;

import java.util.Random;
import java.util.Scanner;

public class Project 
{
	public static void main(String[]args)
	{
		System.out.println("Type '1' for paper, '2' for scissors and '3' for rock");
		int paper=1;
		int scissors=2;
		int rock=3;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		String keepPlaying="y";
		while(keepPlaying.equals("y"))
		{	
			int computerPick=rand.nextInt(2)+1;
			int playerPick=scan.nextInt(); 
			if (playerPick==1||computerPick==3)
			{
				System.out.println("You win!");
				System.out.println("You chose paper and the computer chose rock.");
			}
			else if (playerPick==2||computerPick==3)
			{
				System.out.println("You loose!");
				System.out.println("You chose scissors and the computer chose rock.");
			}
			else if (playerPick==2||computerPick==1)
			{
				System.out.println("You win!");
				System.out.println("You chose scissors and the computer chose paper.");
			}
			else if (playerPick==3||computerPick==1)
			{
				System.out.println("You loose!");
				System.out.println("You chose rock and the computer chose paper.");
			}
			else if (playerPick==3||computerPick==2)
			{
				System.out.println("You win!");
				System.out.println("You chose rock and the computer chose scissors.");
			}
			else if (playerPick==1||computerPick==2)
			{
				System.out.println("You loose!");
				System.out.println("You chose paper and the computer chose scissors.");
			}
			else if(playerPick==computerPick)
			{
				System.out.println("It's a tie.");
			}
			System.out.println("If you want to play again type 'y'.");
			keepPlaying=scan.next();
		}
		
	}
}
