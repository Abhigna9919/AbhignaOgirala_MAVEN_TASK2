package com.epam.newyeargift;

import java.util.*;
import com.epam.newyeargift.chocolate.*;
import com.epam.newyeargift.sweet.*;

public class Data 
{
    public static List<Chocolate> chocoLis()
    {
    	List<Chocolate> ch=new ArrayList<Chocolate>();
        ch.add(new FiveStar("FiveStar",10.0f,300));
        ch.add(new Cadbury("Cadbury",20.0f,150));
        ch.add(new Kinderjoy("Kinderjoy",15.0f,600));
        ch.add(new Perk("Perk",80.0f,500));
        return ch;
    }
    public static List<Sweet> sweetLis()
    {
    	List<Sweet> sw=new ArrayList<Sweet>();
        sw.add(new Barfi("Barfi",30.0f,900));
        sw.add(new Mothichur("Mothichur",10.0f,400));
        sw.add(new Rasgulla("Rasgulla",80.0f,1000));
        sw.add(new Rasmalai("Rasmalai",70.0f,600));
        return sw;
    }
}

