package solidPrinciple;

import java.io.IOException;

class Parent {

	 String name;
	 
	 public Parent(){
		 System.out.println("from parent"+name);
	 }
	 
	 public Parent(String name){
		 System.out.println("from parent argument "+name);
	 }
	  String calculateAge(String year) throws IOException{
		 
		 return "10";
	 }
	  
	  public static void main(String[] args){
			Parent p = new child("Sandip");
		}
}
 class child extends Parent{
	 String name;
    public child(String name) {
    //	super(name);
		this.name= name;
		System.out.println("from child"+this.name);
	}

	String calculateAge(String year) throws IOException{
		 
		 return "10";
	 }
	
	
 }
