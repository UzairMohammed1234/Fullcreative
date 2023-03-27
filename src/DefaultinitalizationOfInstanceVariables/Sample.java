package DefaultinitalizationOfInstanceVariables;

public class Sample {
	   int varInt;
	   float varFloat;
	   boolean varBool;
	   long varLong;
	   byte varByte;
	   short varShort;
	   double varDouble;
	   public static void main(String args[]){
	      Sample obj = new Sample();
	      System.out.println("Default int value ::"+obj.varInt);
	      System.out.println("Default float value ::"+obj.varFloat);
	      System.out.println("Default boolean value ::"+obj.varBool);
	      System.out.println("Default long value ::"+obj.varLong);
	      System.out.println("Default byte value ::"+obj.varByte);
	      System.out.println("Default short value ::"+obj.varShort);
	      System.out.println("Default double value ::"+obj.varDouble);
	   }
	}
