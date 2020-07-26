package com.epam.newyeargift.gift;

import java.util.*;
import com.epam.newyeargift.chocolate.*;
import com.epam.newyeargift.sweet.*;

public class Gift 
{
	private ArrayList<Chocolate> ch;
    private ArrayList<Sweet> sw;

    public Gift() //constructor
    {
        ch = new ArrayList<Chocolate>();
        sw= new ArrayList<Sweet>();
    }
    
    public void addSweet(Sweet... sw) //using variable arguments
    {
            this.sw.addAll(Arrays.asList(sw));
    }

    public void addChoco(Chocolate... ch) //using variable arguments
    {
            this.ch.addAll(Arrays.asList(ch));
    }

    public void dispGift()
    {
    	for(int i=0;i<ch.size();i++)
    		System.out.println(ch.get(i).getName());
    	for(int j=0;j<sw.size();j++)
    		System.out.println(sw.get(j).getName());
    }
    
    public void sort() //sorting the sweets and chocolates based on cost
    {
        Collections.sort(ch);
        Collections.sort(sw);
    }
    public void getMinChoco()
    {
    	sort();
    	System.out.println(this.ch.get(0).getName());	
    }
    
    public void getMaxChoco()
    {
    	sort();
    	System.out.println(this.ch.get(this.ch.size()-1).getName());	
    }
     
    public void getMinSweet()
    {
    	sort();
    	System.out.println(this.sw.get(0).getName());	
    }
    
    public void getMaxSweet()
    {
    	sort();
    	System.out.println(this.sw.get(this.sw.size()-1).getName());	
    }
     
    public float sumCost()
    {
    	float sum2=0;
    	for(int i=0;i<ch.size();i++)
    		sum2+=ch.get(i).getCost();
    	for(int j=0;j<sw.size();j++)
    		sum2+=sw.get(j).getCost();
        return sum2;
    }

    public float sumWeight() 
    {
    	float sum=0;
    	for(int i=0;i<ch.size();i++)
    		sum+=ch.get(i).getWeight();
    	for(int j=0;j<sw.size();j++)
    		sum+=sw.get(j).getWeight();
    	
        return sum;
    }

    public void dispChoco() 
    {
    	for(int j=0;j<ch.size();j++)
          ch.get(j).display();
    }

    public void dispSweet() 
    {
    	for(int j=0;j<sw.size();j++)
         sw.get(j).display();
    }
    
}
