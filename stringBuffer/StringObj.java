package stringBuffer;

public class StringObj {

	public static void main(String[] args) {
		/*String s=new String("hello");
		String s1=new String("hello");
		String s2=new String("hello");
		//String s3="hello";
		
		if(s==s2) //  == is used to compare value type not reference type
		{
			System.out.println("equales");
		}
		else
		{
			System.out.println("Not equals");
		}*/
		String s2=new String("hello");
		StringBuffer s=new StringBuffer("Hello");
		s.append(s);
		StringBuilder s1=new StringBuilder("AAAA");
		s1.append("BBB");

		
		//String s="Hello";
		//String s1=s.concat("hi");
		//System.out.println(s1);
		System.out.println(s);

	}

}
