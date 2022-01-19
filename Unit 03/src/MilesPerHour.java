//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes, roundedMPH;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		
	}

	public void calcMPH()
	{
		//first we need to combine the time
		double combinedHrs = hours + (double)minutes/60;
		mph = distance/combinedHrs;
	    roundedMPH = (int)Math.round(mph);

	}

	public void print()
	{
		System.out.println(distance+" miles in "+hours+" hour and "+minutes+" minutes = "+roundedMPH+ " MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return distance+" miles in "+hours+" hour and "+minutes+" minutes = "+roundedMPH+ " MPH.";
	}
}