package edu.ppu.apps;

import java.util.Arrays;
import java.util.List;

import edu.ppu.domain.Person;

public class PersonApp {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("", 2), new Person("Ahmed", 10), new Person("Ghost", 3000));
		PersonApp personApp = new PersonApp();
		int ageAvg = personApp.getAvg(persons);

		Person maxAgePerson = personApp.getMaxAgeP(persons);

		System.out.println(maxAgePerson);
		System.out.println("avg age is " + ageAvg);

	}

	public Person getMaxAgeP(List<Person> persons) {
		Person maxAgePerson = null;
		for (Person person : persons) {
			if (maxAgePerson == null || person.getPersonAge() > maxAgePerson.getPersonAge())
				maxAgePerson = person;
		}
		return maxAgePerson;
	}

	public int getAvg(List<Person> persons) {
		int sum = 0;
		for (Person person : persons) {
			sum += person.getPersonAge();
		}
		return sum / persons.size();
	}

}
