package Fundamentals;

public class Wrapperclasses {

	public static void main(String[] args) {
		//to use primitive data types as objects where objects are requirded ArrayList<Integer> like this
		
		int value = 1;
		boolean flag = true;
		
		
		Integer intobj = Integer.valueOf(value);
		Boolean bolobj = Boolean.valueOf(flag);
		//Wrapping/boxing converting the Primitive DataTypes into their respective Wrapper Classes
		
		System.out.println(intobj);
		System.out.println(bolobj);
		//or  using auto boxing
		
		Integer autoBoxedInt = value;
		Boolean autoBoxedBoolan = flag;
		
		
		//Unwrapping converting classes into Their Primitive data types
		
		
		int val = intobj.intValue();
		boolean bol = bolobj.booleanValue();
		
		
		//0r using auto unBoxing
		
		int autounboxed =val;
		boolean autounoboxedbol = bol;
		
	}
}
