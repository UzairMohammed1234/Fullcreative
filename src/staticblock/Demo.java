package staticblock;

public class Demo {
	   static int[] numArray = new int[10];
	   static {
	      System.out.println("Running static initialization block.");
	      for (int i = 0; i < numArray.length; i++) {
	         numArray[i] = (int) (100.0 * Math.random());
	      }
	   }
	   void printArray() {
	      System.out.println("The initialized values are:");
	      for (int i = 0; i < numArray.length; i++) {
	         System.out.print(numArray[i] + " ");
	      }
	      System.out.println();
	   }
	   public static void main(String[] args) {
	      Demo obj1 = new Demo();
	      System.out.println("For obj1:");
	      obj1.printArray();
	      Demo obj2 = new Demo();
	      System.out.println("For obj2:");
	      obj2.printArray();
	   }
	}
