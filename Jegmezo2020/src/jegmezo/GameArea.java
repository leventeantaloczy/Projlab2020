package jegmezo;
import jegmezo.avatars.*;
import jegmezo.fields.*;
import jegmezo.items.*;

public class GameArea {
	//Ide kell majd két tömb tárolni
	
	
	public GameArea() {
		System.out.println("<GameArea.constructor()");
		
		System.out.println("Creating and adding different tipes of fields as many times and as randomly as we later decide");
		
		HoleField holeField = new HoleField();
		StableIce sableIce = new StableIce();
		UnstableIce unstableIce = new UnstableIce();
		Border border = new Border();
		
		addField(holeField);
		addField(stableIce);
		addField(unstableIce);
		addField(border);
		
		System.out.println("Creating and adding as many avatars as many are needed");

		Avatar avatar = new Avatar();
		
		System.out.println(">GameArea.constructor()");
	}
	
	public void addField(Field f) {
		System.out.println("<GameArea.addField()");
		System.out.println(">GameArea.addField()");
	}
	
	public void addAvatar(Avatar a) {
		System.out.println("<GameArea.addAvatar()");
		System.out.println(">GameArea.addAvatar()");
	}
}
