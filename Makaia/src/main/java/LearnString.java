import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnString<Char> {


	public static void main(String[] args) {
 
	//String MyName = "Mahalakshmi";
  
   //char[] CharArray = MyName.toCharArray();
  // for (char c: CharArray) {
	//   System.out.println(c);
   // }
   
//	String MyName = new String("Mahalakshmi");
//	System.out.println(MyName.hashCode());
	
		
  // StringBuilder build  = new StringBuilder("Mahalakshmi");
  // StringBuilder reverse = build.reverse();
   //System.out.println(reverse);
	//}
   	

    /*int length = MyName.length();
    for(int i=length-1;i>=0;i--)
    System.out.println(MyName.charAt(i)); */
   
	//list 
	
	String MyName = "Mahalakshmi";
	List<Character> list = new ArrayList<Character>();
	char[] CharArray = MyName.toCharArray();
	{
	   for (char c: CharArray) {
		   if (!list.contains(c));
		   list.add(c);
		  System.out.println(c);
	   }
	}
	
	//SET
	
	/*Set<Character> uniquechar =new HashSet<Character>();
	char[] CharArray =MyName.toCharArray();
	{
	for (char c: CharArray) {
		uniquechar.add(c);
		System.out.println(uniquechar);
	}
	
	}*/
	
	
	}
	
	
	
	
	
	
	
	
}	
	

