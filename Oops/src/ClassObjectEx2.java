class Emp{
	void m() {
		System.out.println("Hello Emp");
}
	String name;
	int salary;
	void setSalary() {
		salary=9000;
	}
	String cname;
	void show() {
		System.out.println(name+" "+salary+" "+cname);
	}
	void input(String n,int s,String c) {
		name=n;
		salary=s;
		cname=c;
	}
}
public class ClassObjectEx2 {
	public static void main(String[] args) {
		Emp a=new Emp();
		Emp b=new Emp();
		Emp c=new Emp();
		Emp d=new Emp();
		
		a.setSalary();
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		a.m();
		
		
		a.input("Yoyo Gupta", 78000, "ABC");
		b.input("Cheetah Khan", 200000, "XYZ");
		c.input("Kaliya Sharma", 450000, "PQR");
		d.input("Gogo Singh", 98000, "MNO");
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total Salary: "+total);
		
		a.m();
	}

}
