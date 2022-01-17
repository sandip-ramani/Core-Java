import java.util.ArrayDeque;
import java.util.Deque;

public class ParanthesisCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1000000007 % 5 ;
		System.out.println(x);

		System.out.println(checkBalance());
	}
	private static boolean checkBalance() {
		String expression = "([{}]))";
		
		Deque<Character> dq = new ArrayDeque<Character>();
		for (int i = 0; i < expression.length(); i++) {
			
			char x = expression.charAt(i);
			if (x == '(' || x == '[' || x == '{'){
				dq.push(x);
				continue;
			}
			if (dq.isEmpty()){
				return false;
			}
			switch (x){
			case ')':
				 dq.pop(); 
	              
	                break; 
	  
	            case '}': 
	                dq.pop(); 
	               
	                break; 
	  
	            case ']': 
	                dq.pop(); 
	               
	                break; 
			}
		}
		return (dq.isEmpty()); 
	}

}
