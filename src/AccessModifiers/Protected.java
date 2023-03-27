package AccessModifiers;

class B{  
protected void msg(){System.out.println("Hello");}  
}  
//save by B.java  
 
  
class Protected extends A{  
  public static void main(String args[]){  
   B obj = new B();  
   obj.msg();  
   
  }  
}  

