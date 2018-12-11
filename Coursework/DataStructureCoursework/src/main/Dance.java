package main;
import java.util.ArrayList;

public class Dance extends Person {
	
	private ArrayList <Dance> dance = new ArrayList();
	
	public Dance() {
		super();
	}

public ArrayList<Dance> getDance() {
	return dance;
}

public void setDance(ArrayList<Dance> dance) {
	this.dance = dance;
}
	
	
}