
import java.util.*;

public class AnagramChecking {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		if(s1.length() == s2.length()) {
			int s1l[]=new int[256];
			int s2l[]=new int[256];
            for(char c : s1.toCharArray()) {
            	int index = (int)c;
            	s1l[index]++;
            }
            for(char c : s2.toCharArray()) {
            	int index = (int)c;
            	s2l[index]++;
            }
            boolean isanagram = false;
            for(int i = 0; i<256; i++){
            	isanagram = false;
            
            	if(s1l[i]==s2l[i]) {
            	isanagram = true;
            	}
            	else break;
            }
            if(isanagram) {
            	System.out.println("Yes s1 and s2 are anagram");
            }
            else {
            	System.out.println("No s1 and s2 are not anagram");
            }
 		}
		else {
			System.out.println("No s1 and s2 are not anagram");
		}
		in.close();

}
}
