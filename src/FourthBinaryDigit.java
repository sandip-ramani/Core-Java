
public class FourthBinaryDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 77;
		String binary  = Integer.toBinaryString(a);
		System.out.println(binary);
		System.out.println(binary.charAt(binary.length()-4));
	}

}
