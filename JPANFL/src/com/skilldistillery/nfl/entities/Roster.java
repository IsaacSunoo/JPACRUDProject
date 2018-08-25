package com.skilldistillery.nfl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Roster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="team_name")
	private String teamName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	private String position;
	
	@Column(name="player_number")
	private int playerNumber;
	
	private int age;
	
	private String height;
	
	@Column(name="weight_lbs")
	private int weight;
	
	public Roster() {
	}

	public Roster(int id, String teamName, String firstName, String lastName, String position, int playerNumber, int age,
			String height, int weight) {
		this.id = id;
		this.teamName = teamName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.playerNumber = playerNumber;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public Roster(String teamName, String firstName, String lastName, String position, int playerNumber, int age,
			String height, int weight) {
		this.teamName = teamName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.playerNumber = playerNumber;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "NFL [id=" + id + ", teamName=" + teamName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", position=" + position + ", playerNumber=" + playerNumber + ", age=" + age + ", height=" + height
				+ ", weight=" + weight + "]";
	}
	
}
