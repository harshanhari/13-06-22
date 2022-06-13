package inheritance;

public class TestProgrammer {

	public static void main(String[] args) {
Programmer p1=new Programmer();
System.out.println(p1.bonus);
System.out.println(p1.salary);
Employee e1=new Employee();
System.out.println(e1.salary);
//System.out.println(e1.bonus);because parent class cant access child class// 
	}

}
