package javaStrings;

public class Example3 {

	public static void main(String[] args) 
	{
		
		String name = "Pradnya";
		System.out.println(name);
		
		System.out.println("-----------immutable strings-----------"); //String value does not change
		
		name.concat(" Varade");
		System.out.println(name);;

		System.out.println("------------mutable strings----------"); //String value can change
		
		StringBuffer sb = new StringBuffer("Pradnya"); //StringBuffer is mutable
		System.out.println(sb);
		
		System.out.println("----------------------");
		
		sb.append(" Varade");
		System.out.println(sb);	
		
		
	}

}
