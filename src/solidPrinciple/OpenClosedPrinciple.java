package solidPrinciple;

public class OpenClosedPrinciple {

	private Engine engine;
	
	public OpenClosedPrinciple(Engine engine){
		this.engine = engine;
	}
	 public void startEngine(){
		 engine.startEngine();
	 }
}
interface Engine{
	void startEngine();
	
}
class DieselEngine implements Engine{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Starting diesel engine");
	}
	
}

class ElectricEngine implements Engine{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Starting Electric engine");
	}
	
}