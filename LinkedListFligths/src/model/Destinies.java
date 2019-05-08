package model;

public enum Destinies {
	JAPON("Japon"),
	PRADERA("Pradera"),
	SAN_ANDRES("San andres"),
	NARNIA("Narnia"),
	BOGOTA("BOGOTA"), 
	MIAMI("Miami"),
	MI_CASA("Mi Casa"),
	PARIS("Paris"),
	NEW_YORK("New York");
	
	private String name;
	
	private Destinies(String n) {
		this.name = n;
	}
	
	public int getValue() {
		return Destinies.values().length;
	}
	
	public String getName() {
		return name;
	}
}