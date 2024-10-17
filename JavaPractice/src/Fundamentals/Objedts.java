package Fundamentals;

public class Objedts {

	
	
	int age;
	String name ;
	
	
//	
	 Objedts()
	{
			System.out.println("in constructor " +age);

			System.out.println("in constructor " +name);
	}
//	
//	
//	private Objedts(int age , String name) // if i use this i need to initalize using obj 
//	{
//		this.age = age;
//		
//		this.name = name;
//	}
	
	private void initailze(int age , String name)
	{
		
		System.out.println(this.age = age);
		System.out.println(this.name= name);
	}
	
	public static void main(String[] args) {
		
		
		Objedts obj = new Objedts();
		
		obj.initailze(23,"Mahendra");
		
		
		
		
		
		
	}
	
}
