package classinstancelocalvariables;

public class Example{
	   int myVariable;
	   static int data = 30;
	   
	   public static void main(String args[]){
	      int a = 100;
	      Example obj = new Example();
	      
	      System.out.println("Value of instance variable myVariable: "+obj.myVariable);
	      System.out.println("Value of static variable data: "+Example.data);
	      System.out.println("Value of local variable a: "+a);
	   }
	}