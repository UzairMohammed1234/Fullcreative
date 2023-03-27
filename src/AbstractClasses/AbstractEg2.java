package AbstractClasses;

abstract class Bike{  
	  abstract void run();  
	}  
	class AbstractEg2 extends Bike{  
	void run(){System.out.println("running safely");}  
	public static void main(String args[]){  
	 Bike obj = new AbstractEg2();  
	 obj.run();  
	}  
	}  