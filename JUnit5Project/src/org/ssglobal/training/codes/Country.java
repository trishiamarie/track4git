package org.ssglobal.training.codes;

public class Country {
	
	public enum Choice {BRZ, PHL, JPN, USA, SPN}
	
	public String sayGreet(Choice country) {
		
		switch(country) {
		case PHL:
			return "Mabuhay";
		case BRZ:
			return "Obrigado";
		case JPN:
			return "Ohayoo";
		case USA:
			return "Hello";
		case SPN:
			return "Co musta";
		default:
			return null;
		
		}
		
	}
	
	
	
	
	
	
	

}
