
public class catchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			testEx();
		}catch(Exception e){
			System.out.println("Calling exception");
		}
		
	}

	private static void testEx() throws Exception{
		try{
			
			throw new RuntimeException();
		
	}	
	catch(RuntimeException Re){
		throw new Exception();
	}
	finally{
		try{
		System.out.println("Outer | catch block");
		throw new RuntimeException();
		}catch(RuntimeException Re){
			System.out.println("Catched in finally block");
		}
	}
	}
}
