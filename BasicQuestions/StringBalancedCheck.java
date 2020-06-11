

import java.util.*;

public class StringBalancedCheck {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();
		while(t-- > 0){
		    String str = input.nextLine();
		    Stack<Character> st = new Stack<>();
		    boolean balanced = true;
		    for(int i = 0; i < str.length(); i++){
		        char c = str.charAt(i);
		        if(c == '{' || c == '[' || c == '('){
		            st.push(c);
		        }
		        else if(!st.empty() && st.peek() == '[' && c == ']' || !st.empty() && st.peek() == '(' && c == ')' || !st.empty() && st.peek() == '{' && c == '}'){
		            st.pop();
		            balanced = true;
		            continue;
		        }
		        else{
		            balanced = false;
		            break;
		        }
		}
		if(balanced && st.empty()){
		    System.out.println("balanced");
		}
		else{
		    System.out.println("not balanced");
		}
	}
		input.close();
	}

}
