import java.util.ArrayList;
import java.util.List;

public class Hotel {
	List<Person> persons = new ArrayList<Person>();

	public Hotel() {
		
	}
	//them khach 
	public void addPerson(Person p) {
		this.persons.add(p);
	}
	//xoa khach theo CMND
	public boolean deletePerson(String passport) {
		Person person = this.persons.stream().filter(p->p.getPassport().equals(passport)).findFirst().orElse(null);
		if(person == null) {
			return false;
			
		}else {
			this.persons.remove(person);
			return true;
		}
	}
	
	//tinh toan tien thue
	public float calculate(String passport) {
		Person person = this.persons.stream().filter(p->p.getPassport().equals(passport)).findFirst().orElse(null);
		if(person == null) {
			return 0;
		}else {
			return person.getRoom().getPrice()*person.getNumberRent();
		}
	}
	
	//in danh sach khach hang
	
	public void show() {
		this.persons.forEach(p->System.out.println(p.toString()));
	}
}
