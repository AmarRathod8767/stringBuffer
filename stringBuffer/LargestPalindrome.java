package stringBuffer;

public class LargestPalindrome {
      

public static void main(String[] args) {
    String s = "hello world naman aaaaaaa gdffbff fsbfbwr fvxcbfbr hahahahah fgrhrhrhrhr fffffffffffff ";
    char asc=(char)32;
    String word="";
    String word1="";
    String rev="";
    int m=0;
    for(int i=0;i<=s.length()-1;i++)
    {
	 if(s.charAt(i)!=asc)
	 {
		 word=word+s.charAt(i);
		
	 }
	 else
	 {
		 //System.out.println(word);
		// word1=word;
		
		 
				 for(int j=word.length();j>=1;j--)
 
		 {
			 rev=rev+word.charAt(j-1);
			 
		 }
		
		 
		 if(rev.equals(word))
		 {   
			 if(m<word.length())
			 {
				 m=word.length();
				 word1=word;
			 }
			 
			
		 }
		 
		 rev="";
		 word="";
	 }
	 
	
    }
     
    System.out.println(word1+" is max Palndrom");
}
}


