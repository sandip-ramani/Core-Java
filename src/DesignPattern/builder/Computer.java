package DesignPattern.builder;

/*
 Builder method solves following problem with Factory & Abstract Factory 
 	1. Too many arguments needs to be passed to factory
 	2. All the parameter are required by default
 	3. if the object is heavy and its creation is complex, all these complexity will be passed to
 		factory classes
 */
public class Computer {

	private String HDD;
	private String CPU;
	
	private boolean isGraphic;
	private boolean isBluetooth;
	
	private Computer(CompBuilder builder){
		this.HDD= builder.HDD;
		this.CPU= builder.CPU;
		this.isBluetooth=builder.isBluetooth;
		this.isGraphic= builder.isGraphic;
	}
	
	
	
	public String getHDD() {
		return HDD;
	}

	public String getCPU() {
		return CPU;
	}

	public boolean isGraphic() {
		return isGraphic;
	}


	public boolean isBluetooth() {
		return isBluetooth;
	}


	public static class CompBuilder{
		private String HDD;
		private String CPU;
		
		private boolean isGraphic;
		private boolean isBluetooth;
		
		public CompBuilder(String HDD, String CPU){
			this.HDD= HDD;
			this.CPU= CPU;
		}
		public CompBuilder setGraphic(boolean isGraphic){
			this.isGraphic=isGraphic;
			return this;
		}
		public CompBuilder setBluetooth(boolean isBluetooth){
			this.isBluetooth=isBluetooth;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}
		
	}
}
