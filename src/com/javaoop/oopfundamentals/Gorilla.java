package com.javaoop.oopfundamentals;

public class Gorilla extends Mammal{
	public void throwSomething() {
		super.setEnergyLevel(super.getEnergyLevel()-5);
		System.out.println("The gorilla has thrown something. Watch out!");
		System.out.println("Gorilla's current energy level is: " + super.getEnergyLevel());
	}
	
	public void eatBananas() {
		super.setEnergyLevel(super.getEnergyLevel()+10);
		System.out.println("The gorilla is very satified. Good job!");
		System.out.println("Gorilla's current energy level is: " + super.getEnergyLevel());
	}
	
	public void climb() {
		super.setEnergyLevel(super.getEnergyLevel()-10);
		System.out.println("The gorilla has climbed a tree. Powerful, haha!");
		System.out.println("Gorilla's current energy level is: " + super.getEnergyLevel());
	}
}
