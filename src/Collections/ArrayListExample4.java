package Collections;

import java.util.*;  
public class ArrayListExample4{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Mango");  
  al.add("Apple");  
  al.add("Banana");  
  al.add("Grapes");  
  
  System.out.println("Returning element: "+al.get(1));  
   
  al.set(1,"Dates");  
  //Traversing list  
  for(String fruit:al)    
    System.out.println(fruit);    
  
 }  
}  
