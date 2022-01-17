import java.util.Arrays;
import java.util.Collections;

public class FlowerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
	//	int[] c = {50, 10, 20, 30, 25};
		Integer[] c = {50, 10, 20, 30, 25};
		Arrays.sort(c, Collections.reverseOrder());
		System.out.println(Arrays.toString(c));
		int sum =0;
		int x = 0;
		for (int i = 0; i < c.length; i++) {
			if (x<=k){
				sum = sum + c[i];
				x++;
			}
			else{
				int cons = x/k;
				for (int j = c.length -1; j <= k ; j++) {
					sum = sum + (cons + 1)*c[j];
					x++;
				}
			}
		}
	}

}
