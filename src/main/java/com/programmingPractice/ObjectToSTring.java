package com.programmingPractice;

public class ObjectToSTring {
	
	String Fname;
	String Lname;
	
	public ObjectToSTring(String Fname, String Lname) {
		
		this.Fname = Fname;
		this.Lname = Lname;
		
	}
	
	public static void main(String args[]) {
		
		ObjectToSTring obj1 = new ObjectToSTring("Ganesh", "Kumar");
		System.out.println(obj1);  
		ObjectToSTring obj2 = new ObjectToSTring("Ganesh", "Kumar");
		System.out.println(obj2);
		boolean checkIfEqual = obj1.equals(obj2);
		System.out.println(checkIfEqual);
		
	}
	
	public boolean equals(Object o) {
		
		if(o instanceof ObjectToSTring) {
			ObjectToSTring obj = (ObjectToSTring)o;
			return this.Fname == obj.Fname && this.Lname == obj.Lname && this.Fname.equals(obj.Fname) && this.Lname.equals(obj.Lname);
		}
		return false;
	}
	
	public String toString() {
		return Fname+" "+Lname;
		}
	
	

}
