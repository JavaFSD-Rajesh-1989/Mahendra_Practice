package Fundamentals;

class cast
{
	static int  x = 100;
	static float f = (float) x;
	static void help()
	{
	System.out.println(f);
}
}

class Animal
{
			 void sound()
			{
			System.out.println("Animal makes sound");
			}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("dog barks");
	}
}
public class TypeCasting {
	public static void main(String[] args) {
		
	
	 Animal animal = new Dog();  // Upcasting (Dog to Animal)
     animal.sound();  // Output: Animal makes a sound
     
     Dog dog = (Dog) animal;  // Downcasting (Animal to Dog)
     dog.bark();  // Output: Dog barks
     
     cast.help();
	}
}
