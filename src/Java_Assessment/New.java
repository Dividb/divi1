package Java_Assessment;

public class New {

	public static void main(String[] args) {
		
		/*String a="divya";
		String b="divya";
		String c= "bharathi";
		System.out.println(a);
		System.out.println(b);
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		
		System.out.println(a==b);
		System.out.println(b!=c);
		
		StringBuilder d=new StringBuilder("divya");
		StringBuffer e=new StringBuffer("divya");
		System.out.println(d);
		System.out.println(e);
		
		
		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(e));*/
		
		String s="Welcome To Java";
		String t="welcome to java";
		System.out.println(s.equals(t));
		System.out.println(s.equalsIgnoreCase(t));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("W"));
		System.out.println(s.endsWith("o"));
		System.out.println(s.contains("o"));
		System.out.println(s.indexOf("o"));
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.charAt(3));
		System.out.println(s.replace("a", "z"));
		System.out.println(s.substring(5));
		System.out.println(s.isEmpty());
		String[] u=t.split("");
		for (String db : u) {
			System.out.println(db);
		}
	}
}
