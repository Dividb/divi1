package Java_Assessment;

import java.util.ArrayList;
import java.util.List;

public class Collect {
	
	public static void main(String[] args) {
		
		List<Object> d=new ArrayList<>();
		List<Object> e=new ArrayList<>();
		d.add("DivyaBharathi");
		d.add("age="+ 22);
		d.add("passedout="+ 2022);
		
		e.add("DivyaBharathi");
		e.add("age="+ 22);
		e.add("passedout="+ 2022);
		
		//System.out.println(d);
		//System.out.println(d.size());
		//System.out.println(d.get(2));
		d.set(0,"divya");
		//System.out.println(d);
	    //d.remove(2);
		//System.out.println(d);
		//System.out.println(d.indexOf("divya"));
		//System.out.println(d.contains("divya"));
		//d.removeAll(e);
		//System.out.println(d);
		//e.retainAll(d);
		//System.out.println(e);
		//e.add(d);
		//System.out.println(e);
		d.clear();
		System.out.println(d);
	
	}
	
	}

