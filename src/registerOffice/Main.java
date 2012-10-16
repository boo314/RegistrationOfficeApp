package registerOffice;

import registerOffice.businessObjects.persons.Person;
import registerOffice.management.*;

public class Main {

	public static void main(){
	
	PersonManager mgr= new PersonManager();
	boolean saved= mgr.save(new Condition<Person>() {
		
		@Override
		public boolean getCondition(Person p) {
			// TODO Auto-generated method stub
			return p.getCars().size() > 0 && p.getName() == "Adam";
		}
	});
	Person person =mgr.get(new Condition<Person>(){
		@Override
		public boolean getCondition(Person p)
		{
			return p.getCars().size() > 0 && p.getName() == "Adam";
		}
	});
	System.out.println(person.getName());
	}
	

}
