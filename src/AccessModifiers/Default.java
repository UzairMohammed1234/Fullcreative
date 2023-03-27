package AccessModifiers;

class AA{  
	  void msg(){System.out.println("Hello");}  
	}  
	//save by B.java   
	class Default{  
	  public static void main(String args[]){  
	   AA obj = new AA();//Compile Time Error  
	   obj.msg();//Compile Time Error  
	  }  
	}  
