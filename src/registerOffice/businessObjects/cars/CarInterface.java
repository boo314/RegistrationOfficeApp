package registerOffice.businessObjects.cars;

import registerOffice.businessObjects.persons.Person;

public interface CarInterface {
	
	public String getMark();
	public void setMark(String mark);
	public String getRegisterNumber();
	public void setRegisterNumber(String registerNumber);
	public void printData();
	public void setOwner(Person owner);
}
