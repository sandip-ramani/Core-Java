
public class MaxRatingSumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,-1,-3,2,3,4,5,-3,-2};
		int maxSum =0;
		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				
				sum+=arr[j];
				maxSum = maxSum < sum ? sum : maxSum;
			}
			
		}
		System.out.println(maxSum);
	}

}
