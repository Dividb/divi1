package Java_Assessment;

public class Interface_two implements Interface {

	@Override
	public void personalloan() {
		System.out.println(77);
		System.out.println(99);
	}

	@Override
	public void homeloan() {
		System.out.println(9876);
		System.out.println("divya");
	}
	public static void main(String[] args) {
		Interface_two i= new Interface_two();
	      i.personalloan();
	      i.homeloan();
	
	}
		
	

}
