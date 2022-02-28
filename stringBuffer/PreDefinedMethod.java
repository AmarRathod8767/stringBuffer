package stringBuffer;

public class PreDefinedMethod {
	public static void main(String[]args)
	{
		String s="Hello";
		String s1="Worldd";
		System.out.println(s.length()); //length method
		
		if (s.equals(s1))               //equals method
		{
			System.out.println("Equall");
		}
		else
		{
			System.out.println("Not equall");
		}
		System.out.println(s.concat(s1));//Concat Method
		System.out.println(s.compareTo(s1));//Compare method
		System.out.println(s.split(s1)); //Split method
		System.out.println(s.indexOf("l"));// index chack method
		System.out.println(s.lastIndexOf("l")); //last index chck method
		System.out.println(s.replace("l", "p")); // replace char method
		System.out.println(s.substring(2, 5));  //sub index method
		System.out.println(s.toLowerCase());   //lover case convert method
		System.out.println(s.toUpperCase());   // uper case convert method
		System.out.println(s.charAt(2));      // find charector method
		System.out.println(s.indexOf("l"));    //find index no
		
	}

}
