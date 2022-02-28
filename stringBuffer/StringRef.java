package stringBuffer;

public class StringRef {
  
	public static void main(String[] args) {
		  String s="Hello";
		  String s2="Hello";
		//  s="Hi";
		  //only one string pool memory will be created
		if(s==s2)
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not Equals");
		}

	}

}
