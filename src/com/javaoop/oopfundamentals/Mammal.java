package com.javaoop.oopfundamentals;

public class Mammal {
	private int energyLevel;
	
	//	constructor
	public Mammal() {
		this.energyLevel = 100;
	}
	
	//	getter
	public int getEnergyLevel() {
		return this.energyLevel;
	}
	
    //  setter
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	//	methods
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
}
