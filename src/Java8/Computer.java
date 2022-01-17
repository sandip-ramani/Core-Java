package Java8;

import java.util.Optional;

public class Computer {

	private String processor;
	private Optional<SDCard> sdCard;
	private String company;
	
	
	public Computer(String processor, Optional<SDCard> sdCard, String company) {
		super();
		this.processor = processor;
		this.sdCard = sdCard;
		this.company = company;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public Optional<SDCard> getSdCard() {
		return sdCard;
	}
	public void setSdCard(Optional<SDCard> sdCard) {
		this.sdCard = sdCard;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
}
