package com.epam.newyeargift;

import java.util.*;
import com.epam.newyeargift.chocolate.*;
import com.epam.newyeargift.sweet.*;
import com.epam.newyeargift.gift.Gift;

public class App 
{
    public static void main( String[] args )
    {
    	 Scanner sc = new Scanner(System.in);
         List<Sweet> sw = Data.sweetLis();
         List<Chocolate> ch = Data.chocoLis();
         Gift ob= new Gift();
         int choice=0;
         ob.addChoco(ch.get(1),ch.get(2),ch.get(0),ch.get(3));
         ob.addSweet(sw.get(1),sw.get(0),sw.get(3),sw.get(2));
         while(choice!=-1)
         {
             System.out.println("Choose an option from below:");
             System.out.println("1.Gift Contents\n"+ "2.Costliest Chocolate \n" + "3.Cheapest Chocolate \n" +
             "4.Costliest Sweet \n" + "5.Cheapest Sweet \n" +"6.Display chocolate details\n" 
               + "7.Display sweet details\n" + "Press -1 to exit\n");
             choice= sc.nextInt();
             switch (choice)
             {
                 case 1:
                     ob.dispGift();
                     break;
                 case 2:
                     ob.getMaxChoco();
                     break;
                 case 3:
                     ob.getMinChoco();
                     break;
                 case 4:
                     ob.getMaxSweet();
                     break;
                 case 5:
                	 ob.getMinSweet();
                     break;
                 case 6:
                	 System.out.printf("%-15s %-15s %-15s\n","Choco Name","Choco weight","Choco Cost\n");
                     ob.dispChoco();
                     break;
                 case 7:
                	 System.out.printf("%-15s %-15s %-15s\n","Sweet Name","Sweet weight","Sweet Cost\n");
                     ob.dispSweet();
                     break;
                 case -1:
                	 System.out.println("Exiting...");
                	 System.exit(0);
                	 break;
                 default:
                	 System.out.println("Wrong input\n");
                	 break;
             }
         }
         sc.close();
    }
  }
