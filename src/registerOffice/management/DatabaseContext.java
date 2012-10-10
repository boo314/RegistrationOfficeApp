package registerOffice.management;

import java.util.ArrayList;
import java.util.List;

import registerOffice.businessObjects.cars.Car;
import registerOffice.businessObjects.persons.Person;

public class DatabaseContext {

	static List<Person> persons=new ArrayList<Person>();
	static List<Car> cars=new ArrayList<Car>();
	
	public static List<Person> getPersons() {
		return persons;
	}
	public static List<Car> getCars() {
		return cars;
	}
	
	
}
