package constructor;
class Human 
{	
	String name;
	int age;
	Human(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	
}
class Student extends Human
{
	
	int rollno;
	Student(String name,int age,int rollno)
	{
		super(name,age);
		this.rollno=rollno;
	}
}
public class SuperClassConstructor {
	public static void main(String args[])
	{
		Student obj=new Student("uzair",19,222);
		System.out.println(obj.name+" "+obj.rollno);
	}
}
