
public class LongestPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABDCBCDBDCBBC";
		System.out.println(longestString(s1));
	}

	public static String expand(String s, int left, int right){
		while(left>=0 && right < s.length() && s.charAt(left)==s.charAt(right)){
			left--;
			right++;
		}
		return s.substring(left+1, right);
		
	}
	
	public static String longestString(String s){
		
		int max = 0;
		String Curr_str = null;
		
		for (int i = 0; i < s.length(); i++) {
			String getPali = expand(s, i,i);
			
			if (max< getPali.length()){
				max= getPali.length();
				Curr_str = getPali;
			}
			
			getPali = expand(s, i,i+1);
			if (max< getPali.length()){
				max= getPali.length();
				Curr_str = getPali;
			}
			
		}
		return Curr_str;
	}
}
