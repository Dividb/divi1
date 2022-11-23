package Java_Assessment;

import java.util.Scanner;

public class Marks {
	

	public static void main(String[] args) {
		Scanner db=new Scanner(System.in);
		System.out.println("Enter Your Name");
		db.next();
		
		System.out.println("Enter Your Mark");
		
		int a=db.nextInt();
		
		if (a>=91 && a<=100) {
			System.out.println("O-grade");}
		else if (a>=81 && a<=90) {
			System.out.println("D-grade");}
		else if (a>=71 && a<=80) {
			System.out.println("A-grade");}
		else if (a>=51 && a<=70) {
			System.out.println("B-grade");}
		else if (a>=35 && a<=50) {
			System.out.println("C-grade");}
		else {
			System.out.println("Fail");
		}
		}
		
	  
		
	}
	    
	

