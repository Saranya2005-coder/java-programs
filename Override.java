Override.java
  package Day10;
class Animal
{
	void sound()
	{
		System.out.println("Animal sound");
	}
}
class Dog extends Animal
{
	@Override
	void sound()
	{
		System.out.println("Dog Bark");
	}
}
class Cat extends Animal
{
	@Override
	void sound()
	{
		System.out.println("Meowwwwww");
	}
}
public class SS 
{
	public static void main(String[] args) 
	{
		Animal a = new Dog();
		a.sound();
	    Animal b = new Cat();   
		b.sound(); 

	}

}
