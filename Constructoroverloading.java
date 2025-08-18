Constructoroverloading.java
  package Day10;
class A
{
	int age;
	String name;
	double cgpa;
	int marks;
	A(int age)
	{
		this.age = age;
	}
	A(int age,String name)
	{
		this.age = age;
		this.name = name;	
	}
    A(int age,String name,double cgpa)
    {
    	this.age = age;
    	this.name = name;
    	this.cgpa = cgpa;
    }
    A(int age,String name,double cgpa,int marks)
    {
    	this.age = age;
    	this.name = name;
    	this.cgpa = cgpa;
    	this.marks = marks;
    }
    public void display()
    {
    	System.out.println(age);
    	System.out.println(name);
    	System.out.println(cgpa);
    	System.out.println(marks);
    }
}
public class AA
{
	public static void main(String[] args) 
	{
		new A(10).display();
		new A(10, "sara").display();
		new A(10, "sara",9.0).display();
		new A(10, "sara",9.0,90).display();
	}
}
