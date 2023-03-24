package Collections;
import java.util.*;
public class VectorListExample {
	public static void main(String args[])
	{

	Vector<Integer> vec = new Vector<Integer>();

	vec.add(1);
	vec.add(2);
	vec.add(3);
	System.out.println(vec.capacity());
	for(int i: vec)
	{
	System.out.println(i);
	}
	}
}
