package Java_Assessment;

public class Oops_three extends Oops_two {

	public void workers_Leave_Peryear() {
	int angle2020=6;
	int june2020=5;
	int angle2021=10;
	int june2021=15;
	int angle2022=7;
	int june2022=4;
	int angleLeaves;
	int juneLeaves;
	angleLeaves =angle2020+angle2021+angle2022;
	 juneLeaves =june2020+june2021+june2022;
	System.out.println(angleLeaves);
	System.out.println(juneLeaves);
}
	public static void main(String[] args) {
		Oops_three c=new Oops_three();
		c.workers();
		c.workersIncome();
		c.workersage();
		c.workers_Leave_Peryear();
		
	}
}
