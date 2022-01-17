
public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(1);
		fibbonacci(5,0,1);
	}

	static void fibbonacci(int length, int a, int b){
		
		if (length < 1 ){
			return;
		}
		
		int x = a+b;
		a=b;
		b=x;
		System.out.println(b);
		length--;
		fibbonacci(length, a, b);
		
	}
}
