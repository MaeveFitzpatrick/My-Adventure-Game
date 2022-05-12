package myAdvGame;
import java.util.Scanner;
public class MyAdvGame {

	public static void main {String[] args) {
		Scanner input = new Scanner(System.in);
		TextBasedGame myGame = new TextBasedGame();
		myGame.intro();
		String response = input.next();
		if (response.equals("mailbox")) {
		      System.out.println("You opened the mailbox, and found a key inside!\nUse it to open the door (type 'door').\n(or type 'restart' to go back to the beginning)");
		      myGame.key("key");
		    }
		else if (response.equals("door")) {
		      System.out.println("Uh oh, the door is locked! Type 'quit' to try again.");
		      myGame.quit("quitResponse");
		    }
	}
}
class TextBasedGame {
	Scanner input = new Scanner(System.in);
	public void intro() {
		System.out.println("Welcome to your adventure!\nYou are standing in front of a blue house, next to a mailbox.\nWhat would you like to do?\nOpen the door (type 'door')\nor\nOpen the mailbox (type 'mailbox')");
	  }
	public void open(String openResponse) {
	    openResponse = input.next();
	    if (openResponse.equals("mailbox")) {
	      System.out.println("You've opened the mailbox, and found a key inside!\nUse it to open the door. (type 'door' to open the door, or 'restart' to go back to the beginning)");
	    }
	    else if (openResponse.equals("door")) {
	      System.out.println("Uh oh, the door is locked! Type 'restart' to try again.");
	    }
	  }
	}
}