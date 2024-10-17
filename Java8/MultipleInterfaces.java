package Java8;

interface new1{
	default void method1()
	{
		System.out.println("method 1 of interface");
	}
}
interface new2{
	
	default void method1()
	{
		System.out.println("method 2 of interface");
	}
}
public class MultipleInterfaces implements new1 ,new2{ // if we use same interface methods to implement then ambiguity will occur

	public static void main(String[] args) {
		
	}
}
