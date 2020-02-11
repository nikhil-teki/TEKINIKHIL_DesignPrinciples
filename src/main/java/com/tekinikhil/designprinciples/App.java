package com.tekinikhil.designprinciples;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan=new Scanner(System.in);
        Calculator calci=new Calculator();
        int v,ch;
        float a,b,c;
        while(true)
        {
        	System.out.println("===============CALCULATOR==============");
        	System.out.print("Enter no. of values : ");
        	v=scan.nextInt();
        	if(v!=2&&v!=3)
        	{
        		System.out.println("Unsupported! please give 2 or 3");
        		return;
        	}
        	System.out.println("1.Addition");
        	System.out.println("2.Subtraction");
        	System.out.println("3.Multiplication");
        	System.out.println("4.Division");
        	System.out.println("5.Exit");
        	ch=scan.nextInt();
        	if(ch==5)
        	{
        		System.out.println("EXITED CALCULATOR");
        		return;
        	}
        	switch(v)
        	{
        	    case 2:switch(ch)
        	           {
        	               case 1:System.out.println("Enter 2 values one by one :");
        	                      a=scan.nextFloat();
        	                      System.out.print("+");
        	                      b=scan.nextFloat();
        	                      System.out.println(calci.Addition(a,b));
        	                      break;
        	               case 2:System.out.println("Enter 2 values one by one :");
 	                              a=scan.nextFloat();
 	                              System.out.print("-");
 	                              b=scan.nextFloat();
 	                              System.out.println(calci.Subtraction(a,b));
 	                              break;
        	               case 3:System.out.println("Enter 2 values one by one :");
 	                              a=scan.nextFloat();
 	                              System.out.print("*");
 	                              b=scan.nextFloat();
 	                              System.out.println(calci.Multiplication(a,b));
 	                              break;
        	               case 4:System.out.println("Enter 2 values one by one :");
                                  a=scan.nextFloat();
                                  System.out.print("/");
                                  b=scan.nextFloat();
                                  if(b==0)
                                	  System.out.println("Math Error");
                                  else
                                  System.out.println(calci.Division(a,b)); 
                                  break;
                           default:System.out.println("Check your inputs");
                                   break;
        	           }
        	           break;
        	    case 3:switch(ch)
 	                   {
               case 1:System.out.println("Enter 3 values one by one :");
                      a=scan.nextFloat();
                      System.out.print("+");
                      b=scan.nextFloat();
                      System.out.print("+");
                      c=scan.nextFloat();
                      System.out.println(calci.Addition(a,b,c));
                      break;
               case 2:System.out.println("Enter 3 values one by one :");
                       a=scan.nextFloat();
                       System.out.print("-");
                       b=scan.nextFloat();
                       System.out.print("-");
                       c=scan.nextFloat();
                       System.out.println(calci.Subtraction(a,b,c));
                       break;
               case 3:System.out.println("Enter 3 values one by one :");
                       a=scan.nextFloat();
                       System.out.print("*");
                       b=scan.nextFloat();
                       System.out.print("*");
                       c=scan.nextFloat();
                       System.out.println(calci.Multiplication(a,b,c));
                       break;
               case 4:System.out.print("Enter 3 values one by one :");
                      a=scan.nextFloat();
                      System.out.print("/");
                      b=scan.nextFloat();
                      System.out.print("/");
                      c=scan.nextFloat();
                      if((b==0)||(c==0))
                    	  System.out.println("Math Error");
                      else
                      System.out.println(calci.Division(a,b,c)); 
                      break;
               default:System.out.println("Check your inputs");
                       break;
           }break;
        	    default:System.out.println("Unsupported");
        	            break;
        	}
        	
        }
    }
}
