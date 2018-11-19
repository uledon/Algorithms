package main;

import java.util.ArrayList;

public class Dancer extends Person{
	private boolean enoughTime = false;
	private int changingTime;

	private ArrayList<Dance> dancer = new ArrayList<Dance>();
	
	public Dancer() {
		super();
	}

	public boolean isEnoughTime() {
		return enoughTime;
	}

	public void setEnoughTime(boolean enoughTime) {
		this.enoughTime = enoughTime;
	}

	public int getChangingTime() {
		return changingTime;
	}

	public void setChangingTime(int changingTime) {
		this.changingTime = changingTime;
	}

	public ArrayList<Dance> getDancer() {
		return dancer;
	}

	public void setDancer(ArrayList<Dance> dancer) {
		this.dancer = dancer;
	}



	
	
	
}
