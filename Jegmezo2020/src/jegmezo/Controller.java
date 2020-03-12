package jegmezo;
import jegmezo.avatars.*;
import jegmezo.fields.*;
import jegmezo.items.*;

public class Controller {
	public void startGame() {
		System.out.println("<Controller.startGame()");
		
		GameArea ga = new GameArea();
		
		System.out.println(">Controller.startGame()");
	}
	
	public void Strom() {
		System.out.println("<Controller.Storm");
		System.out.println(">Controller.Storm");
	}
	
	public static void main(String[] args) {
        System.out.println("A legjobb tárgy a Projlab!! -help ;)");
        startGame();
    }
}
