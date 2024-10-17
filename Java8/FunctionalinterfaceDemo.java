package Java8;


//what is functional interface
//interface with exactly on abstract method//functional interface will be used to code re usability
//using lAMBDA expression we can do that
@FunctionalInterface 
public interface FunctionalinterfaceDemo {

	void add(); //it is Functional Interface
	
	// Yeah! we can write **default** method with body and also can add **static** method
	default void sum()
	{
		System.out.println("default method");
	}
	static void me()
	{
		System.out.println("static method");
	}
}
class main  {
	
	public void calculate()
	{
		System.out.println("result is " + (10+7));
	}
	public void hello()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		
		FunctionalinterfaceDemo f1 =new main()::calculate;
		f1.add();//calling calculate And returning output
		FunctionalinterfaceDemo f2 =new main()::hello;//add method is referring to add that means functional interface
		f2.add();//calling hello And returning output
		//add runs both methods in the class main
	}
}