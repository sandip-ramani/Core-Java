
public class secondHighest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,5,6,8,3,5,9};
		int max = 0;
		int second = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>= max){
				second = max;
				max = arr[i];
			}
		}
		System.out.println(second);
		
		String str = "abcdefijkol";
		char[] c = {'a','e','i','o'};
		
	}



}
