package com.javaoop.oopfundamentals;

public class Bat extends Mammal {
//	constructor
	public Bat() {
		super();
		this.setEnergyLevel(300);
	}
	
//	methods
	public int fly() {
		System.out.println("The bat is taking off!");
		this.setEnergyLevel(this.getEnergyLevel()-50);
		return this.getEnergyLevel();
	}
	
	public int eatHumans() {
		this.setEnergyLevel(this.getEnergyLevel()+25);
		return this.getEnergyLevel();
	}
	
	public int attackTown() {
		this.setEnergyLevel(this.getEnergyLevel()-100);
		return this.getEnergyLevel();
	}
	
}
