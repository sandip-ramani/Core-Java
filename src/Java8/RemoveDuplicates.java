package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.stream().distinct().forEach(System.out::println);

		int[] arr = {1,2,3,4};
		int arr1[]=new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int x=1;
			for (int j = 0; j < arr1.length; j++) {
				
				if (i!=j){
					x= x*arr[j];
				}
				
			}
			arr1[i] = x;
		}
		System.out.println(Arrays.toString(arr1));
	}

}
