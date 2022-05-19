package com.company;

//Класс calendar для работы с датой
import java.util.Calendar;

/**
 * Класс работника, с необходимыми полями информации о работнике
 * */
public class Employee {
	private int id;//id работника
	private String name;
	private String gender;
	private int salary;
	private Calendar birthday;//дата рождения
	private Subdivision subdivision;//подразделение

	public Employee(int id, String name, String gender, int salary, Calendar birthday, Subdivision subdivision) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.birthday = birthday;
		this.subdivision = subdivision;
	}

	//различные геттеры и сеттеры
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Calendar getBirthday() {
		return birthday;
	}

	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}

	public Subdivision getSubdivision() {
		return subdivision;
	}

	public void setSubdivision(Subdivision subdivision) {
		this.subdivision = subdivision;
	}

	/**
	 * Метод для вывода полной информации о работнике
	 * */
	@Override
	public String toString() {
		return "\nEmployee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gender='" + gender + '\'' +
				", salary=" + salary +
				", subdivName=" + subdivision.getName() +
				", subdivId=" + subdivision.getId() +
				'}';
	}
}
