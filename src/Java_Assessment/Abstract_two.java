package Java_Assessment;

public class Abstract_two extends Abstract {

	@Override
	public void personalLoan() {
		System.out.println("10%");
		System.out.println("20%");
	}
	
	@Override
	public void homeloan() {
		System.out.println(234);
		System.out.println(768);
	}
	
	public static void main(String[] args) {
		Abstract_two z=new Abstract_two();
				z.personalLoan();
		        z.homeloan();
	}
}
