package DesignPattern.factory;

public class PC extends Computer{

	private String ram;
	private String HDD;
	private String CPU;
	
	public PC(String ram, String hdd, String cpu){
		this.ram=ram;
		this.HDD=hdd;
		this.CPU=cpu;
	}
	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.HDD;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.CPU;
	}

}
