package DesignPattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable {

	private List<String> names;

	public Prototype(){
		names = new ArrayList<String>();
	}
	public Prototype(List<String> names){
		this.names = names;
	}
	public List<String> getNames() {
		return names;
	}
	
	public void loadData(){
		names.add("Sagar");
		names.add("Clark");
		names.add("Stephen");
		
	}
	
	public Object clone(){
		List<String> temp = new ArrayList<>();
		for (String string : this.names) {
			temp.add(string);
		}
		return new Prototype(temp);
	}
}
