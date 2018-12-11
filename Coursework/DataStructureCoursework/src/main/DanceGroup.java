package main;
import java.util.ArrayList;


public class DanceGroup extends Person{
	private static ArrayList <String> danceGroup = new ArrayList<String>(6);
	
	public DanceGroup() {
		super();
	}
	
	public ArrayList<String> getDanceGroup() {
		return danceGroup;
	}

	public void setDanceGroup(ArrayList<String> danceGroup) {
		this.danceGroup = danceGroup;
	}

	
}
