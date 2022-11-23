package Java_Assessment;

public class Method_overloading {
 
	public void divya(short a, short b) {
     System.out.println(a);
     System.out.println(b);

	}
	public void divya(int b, int d) {
     System.out.println(b);
     System.out.println(d);
	}
	public void divya(byte c, short f) {
	 System.out.println(c);
	 System.out.println(f);
	}
	public void divya(boolean d) {
     System.out.println(d);
	}
	public static void main(String[] args) {
		Method_overloading z=new Method_overloading();
		z.divya(345, 765);
		z.divya(535, 788);
		z.divya(120,876);
		z.divya(false);
		
		
	}
}
