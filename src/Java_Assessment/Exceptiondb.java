package Java_Assessment;

public class Exceptiondb {
	
public static void main(String[] args) throws userException {
	 
	
	try {
		//System.out.println(10/0);
		int a[]=null;
		a[0]=55;
		System.out.println(a[0]);
		

	}  catch (NullPointerException e) {
	 
	 System.out.println("hello");
	}  finally {
		System.out.println("hi");
	}
      
	int a=10;
	int b=20;
	 if (a<b) { throw new userException();
		
	}
}
}
