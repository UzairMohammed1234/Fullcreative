package Varargs;



class Varagss {
	// A method that takes variable
	// number of integer arguments.
	static void fun(int... a)
	{
		System.out.println("Number of arguments: "
						+ a.length);

		// using for each loop to display contents of a
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
		
		fun(100);
		
		// four parameters
		fun(1, 2, 3, 4);
		
		// no parameter
		fun();
	}
}
