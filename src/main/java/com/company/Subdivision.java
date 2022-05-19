package com.company;

import java.util.Objects;

/**
 * Класс подразделения с названием + генерацией id (1,2,3..)
 * */
public class Subdivision {
	private static int idGenerator;
	private static int getNextId() {
		return idGenerator++;
	}

	//различные геттеры и сетеры
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	private int id; //id подразделения
	private String name; //название
	public Subdivision(String name) {
		id = getNextId();
		this.name = name;
	}

	/**
	 * Перегруженный метод для вывода информации по подразделению
	 * */
	@Override
	public String toString() {
		return "Subdivision{" +
				"id=" + id +
				", name='" + name + '\'' +
				"}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Subdivision that = (Subdivision) o;
		return id == that.id && Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}
