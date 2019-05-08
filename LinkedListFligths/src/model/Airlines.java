package model;

public enum Airlines {
	AVIANCA("Avianca"), 
	VIVA("Viva Colombia"), 
	COPA("Copa Airlines"), 
	VOJABES_AIRLINE("Vojabes Airline"), 
	JUANITOS_AIRLINE("Juanitos airline"), 
	SATENA("Satena"), 
	MONDA_COMUNISTA("Monda Comunista"), 
	LATAM("Latam");
	
	private String name;
	
	private Airlines(String n) {
		this.name = n;
	}
	
	public int getValue() {
		return Airlines.values().length;
	}
	
	public String getName() {
		return name;
	}
}