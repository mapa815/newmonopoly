package com.newmonopoly;

import java.util.List;
import java.util.Vector;

public class Player {
	private String name;
	private int id;
	private int money;
	private int currentPosition;
	private int doublesCount;
	private boolean jailCard;
	private boolean inJail;
	private int jailTime;
	private List<String> ownedProperties;
	

	public Player(String name, int id) {
		this.name = name;
		this.id = id;
		money = 1500;
		currentPosition = 0;
		ownedProperties = new Vector<String>();
		jailCard = false;
		jailTime = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int newMoney) {
		money = newMoney;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int newPosition) {
		currentPosition = newPosition;
	}

	public int getDoublesCount() {
		return doublesCount;
	}

	public void setDoublesCount(int count) {
		doublesCount = count;
	}

	public void incrementDoubles() {
		doublesCount++;
	}

	public List<String> getOwnedProperties() {
		return ownedProperties;
	}

	public void addOwnedProperties(String newProperty) {
		ownedProperties.add(newProperty);
	}

	public boolean getJailCard() {
		return jailCard;
	}

	public void setJailCard(boolean newOwner) {
		jailCard = newOwner;
	}

	public boolean getInJail() {
		return inJail;
	}

	public void setInJail(boolean jailStatus) {
		inJail = jailStatus;
	}
	
	public int getJailTime() {
		return jailTime;
	}

	public void setJailTime(int jailTime) {
		this.jailTime = jailTime;
	}
}
