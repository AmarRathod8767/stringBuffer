package stringBuffer;

public class StringExample {

	public static void main(String[] args) {
		String s="hello";
		
		System.out.println(s);
		
		String s1="hello";
		String s2=new String("hello");
		String s3=new String("hello");
		String s4=s3;
        System.out.println(s1);
        if(s1.equals(s3))
        {
        	System.out.println("Equals");
        }
        else
        {
        	System.out.println("Not Equals");
        }
	}

}
