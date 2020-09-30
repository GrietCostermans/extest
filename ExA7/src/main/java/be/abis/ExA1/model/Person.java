package be.abis.ExA1.model;

import be.abis.ExA1.exception.AgeException;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	
	private int personNumber;
	private String firstName;
	private String lastName;
	private LocalDate birthDay;
	private Company company;
	
	public Person(int personNumber, String firstName, String lastName, LocalDate birthDay) {
		this.personNumber = personNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
	}

	public Person(int personNumber, String firstName, String lastName, LocalDate birthDay, Company company) {
		this(personNumber,firstName,lastName,birthDay);
		this.company = company;
	}

	public int getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
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

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		String text = "";
		try {
			text = "Person " + this.personNumber + ": " + this.firstName + " " + this.lastName + " (" + this.calculateAge() + " years old)";
		} catch (AgeException e) {
			System.out.println("Age Exception");
		}

		if (this.company != null) {
			text+= " works for " + this.company.getName() + " in " + this.company.getAddress().getTown() + ".";
		} else {
			text+= " is not employed for the moment.";
		}
		return text;
	}
	
	
	public int calculateAge() throws AgeException {
		int age = Period.between(birthDay, LocalDate.now()).getYears();

		if (age < 18) {
				throw new AgeException("Die is te jong hoor");
			}
		return age;
	}
	
	
	
	
	
	
	
	

}
