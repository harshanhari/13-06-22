package inheritance;

public class Emp {
int id;
String name;
Address address;

	public Emp(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad1=new Address("Kochi","Kerala","India");
		Address ad2=new Address("Tvm","Kerala","India");
		Emp e1=new Emp(111,"Arun", ad1);
		Emp e2=new Emp(112,"Kiran", ad2);
		e1.display();
		e2.display();

	}

}
