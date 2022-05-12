package myAdvGame;
import java.util.Scanner;
public class MyAdvGame {

	public static void main {String[] args) {
		Scanner input = new Scanner(System.in);
		TextBasedGame myGame = new TextBasedGame();
		
	}
}
class TextBasedGame {
	Scanner input = new Scanner(System.in);
	public void intro() {
		System.out.println("Welcome to your adventure!\nYou are standing in front of a blue house, next to a mailbox.\nWhat would you like to do?\nOpen the door (type 'door')\nor\nOpen the mailbox (type 'mailbox')");
	  }
	}
}