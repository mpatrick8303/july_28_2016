package com.tiy.battingstats;

import java.util.ArrayList;

public class BattingStats
{
	private ArrayList<Batter> batters = new ArrayList<>();
	
	private double battingAvg;
	private double SlgPerc;
	
	public BattingStats()
	{
		
	}
	public void addBatter(Batter batter)
	{
		batters.add(batter);
	}
	
	
	
	
	public static void main(String [] args)
	{
		Batter b1 = new Batter("10", "5");
		addBatter(Batter batter);
		b1.printStats();
		
	}
	
}
