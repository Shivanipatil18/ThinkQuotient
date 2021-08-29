package pkg;

public class ExcepationHandling {
	
	public static void main(String[] args) {
		
	/*	System.out.println("Beginning of Code");
		method1();
		System.out.println("End of Main");
		
	}
	private static void method1()
	{
		System.out.println("method1 Called");
		method2();
		
	}*/
	/*private static void method2()
	{*/
		try
		{
		System.out.println("Method2 called");
		String str=null;
		str.length();
		
		
		}
		catch(NullPointerException ex)
		{
			System.out.println("NullPointerException caught");
			//System.out.println("End of method2");
			ex.printStackTrace();
		}
	//}
}
}