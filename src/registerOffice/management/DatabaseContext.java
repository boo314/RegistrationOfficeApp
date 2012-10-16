package registerOffice.management;

import java.util.ArrayList;
import java.util.List;

import registerOffice.businessObjects.cars.Car;
import registerOffice.businessObjects.cars.PersonCar;
import registerOffice.businessObjects.cars.TruckCar;
import registerOffice.businessObjects.persons.Person;

public class DatabaseContext {

	static List<Person> persons = new ArrayList<Person>();
	static List<Car> cars = new ArrayList<Car>();
	static List<TruckCar> truckCars = new ArrayList<TruckCar>();
	static List<PersonCar> personCars = new ArrayList<PersonCar>();

	public static List<Person> getPersons() {
		return persons;
	}

	public static List<Car> getCars() {
		return cars;
	}

	public static List<TruckCar> getTruckCars() {
		return truckCars;
	}
	public static List<PersonCar> getPersonCars() {
		return personCars;
	}
}
