import java.util.Arrays;

public class CountPalindrome {
//	static int dp[][] = new int[1001][1001];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbaeae";
		/*for (int[] row: dp)
        {
            Arrays.fill(row, -1);
        }*/
		int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
        	for (int j = i+1; j <=n; j++) {
				
        		if (isPalindrome(s.substring(i, j))){
        			System.out.println(s.substring(i, j));
        			count++;
        		}
			}
			
		}
	System.out.println(count+s.length());
	}
	private static boolean isPalindrome(String s ){
		StringBuffer sb = new StringBuffer(s);
		if (s.length() == 1) return false;
		if (sb.toString().equals(sb.reverse().toString())){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
	
	
	/*private static int isPali(String s, int i, int j){
		if (i>j){
			return 1;
		}
		if (dp[i][j] != -1)
	            return dp[i][j];
		 if (s.charAt(i) != s.charAt(j))
	            return dp[i][j] = 0;
		 return dp[i][j] = isPali(s, i + 1, j - 1);
	}*/
	
}
