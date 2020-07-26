package com.epam.newyeargift.chocolate;


public class Chocolate implements Comparable<Chocolate> //to sort the chocolates
{
    private String name; //name of the chocolate
    private float wt;   //weight of the chocolate
    private float cost;  //cost of the chocolate
    
    //constructor
    public Chocolate(String name, float wt, float cost) 
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

    public int compareTo(Chocolate a) 
    {
        return (int) (this.getCost() - a.getCost());
    }

}
