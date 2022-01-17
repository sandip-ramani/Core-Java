import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> op1 = Optional.of("Sandip");
		Optional<String> op2 = Optional.of("Sandip");
		Optional<String> op3 = op1;
		
		System.out.println(op1==op3);
		Optional<String> op = getRequiredString("Sandip");
		
		System.out.println(op.isPresent() == true ? op.get() : "Not Present");
	}

	public static Optional<String> getRequiredString(String s){
		
		if (s.equals("Sandip")){
			return Optional.of(s);
		}
		else{
			return Optional.ofNullable(null);
		}
	}
}
