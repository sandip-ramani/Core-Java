package solidPrinciple;

public class StringPermute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		permute(s, "");
	}

	/*
	 * a
	 * 		b				abc
	 * 			c			acb
	 * b
	 * 		c				bca
	 * 			a			bac
	 * 
	 */
	public static void permute(String s, String ans){
		
		if (s.length()==0){
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			String remain = s.substring(0, i)+s.substring(i+1);
			permute(remain, ans+c);
		}
	}
}
