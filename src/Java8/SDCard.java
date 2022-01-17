package Java8;

import java.util.Optional;

public class SDCard {

	private Optional<USB> usb;
	private String name;
	
	
	public SDCard(Optional<USB> usb, String name) {
		super();
		this.usb = usb;
		this.name = name;
	}
	public Optional<USB> getUsb() {
		return usb;
	}
	public void setUsb(Optional<USB> usb) {
		this.usb = usb;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
