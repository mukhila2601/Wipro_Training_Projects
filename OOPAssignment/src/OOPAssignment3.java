class Family{
	String fathername;
	int salary;
	int age;
	void show() {
		System.out.println(fathername+" "+salary+" "+age);
	}
}
public class OOPAssignment3 {

	public static void main(String[] args) {
		Family a=new Family();
		a.fathername="abc";
		a.salary=50000;
		a.age=45;
		a.show();
		Family b=new Family();
		b.fathername="def";
		b.salary=45000;
		b.age=46;
		b.show();
		Family c=new Family();
		
		c.fathername="ghi";
		c.salary=550000;
		c.age=44;
		c.show();
	}

}
