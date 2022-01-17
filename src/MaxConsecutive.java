import java.util.Arrays;

public class MaxConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10,9,8,7,3,2,1,4,5,6 };
		int count = 1;
		int max = 1;
		Arrays.sort(arr);
	String s = "12.346";
	String s1 = String.format("%.2f", Float.parseFloat(s));
	float f = Float.parseFloat(s1);
	System.out.println("float "+f);
	
		int Maxsum = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] == arr[i] + 1){
					count++;
					sum = sum + arr[j];
					i++;
				}
				else{
					count =1;
				}
				max = count>max ? count : max;
			}
			Maxsum = Maxsum < sum ? sum : Maxsum;
		}
		
		System.out.println(max);
		System.out.println("maxSum "+Maxsum);
	}

}
