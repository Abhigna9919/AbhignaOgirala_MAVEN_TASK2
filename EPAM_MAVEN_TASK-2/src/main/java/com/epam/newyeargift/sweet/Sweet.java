package com.epam.newyeargift.sweet;

public class Sweet implements Comparable<Sweet> //comparable interface to sort sweets
	{
	    private String name; //name of the sweet
	    private float wt;   //weight of the sweet
	    private float cost;  //cost of the sweet
	    
	    //constructor
	    public Sweet(String name, float wt, float cost) 
	    {
	        this.name = name;
	        this.wt = wt;
	        this.cost = cost;
	    }
	        
	    public void display()
	    {
	        System.out.printf("%-15s %-15s %-15s\n",this.name,this.wt,this.cost);
	    }
	    
	    public String getName() 
	    {
	        return name; 
	    }
	    public float getCost() 
	    {
	        return cost;
	    }

	    public float getWeight()
	    {
	        return wt;
	    }

	    public int compareTo(Sweet a) 
	    {
	        return (int) (this.getCost() - a.getCost());
	    }

}
