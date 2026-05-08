class Student{
	String name;
	int age;
	String FatherName;
	int fees;
	String SchoolName;
}
public class OopAssignment1 {

	public static void main(String[] args) {
		Student a=new Student();
		Student b=new Student();
		Student c=new Student();
		Student d=new Student();
		Student e=new Student();
//		System.out.println(a.name+" "+a.age+" "+a.FatherName+" "+a.fees+" "+a.SchoolName);
//		System.out.println(b.name+" "+b.age+" "+b.FatherName+" "+b.fees+" "+b.SchoolName);
//		System.out.println(c.name+" "+c.age+" "+c.FatherName+" "+c.fees+" "+c.SchoolName);
//		System.out.println(d.name+" "+d.age+" "+d.FatherName+" "+d.fees+" "+d.SchoolName);
//		System.out.println(e.name+" "+e.age+" "+e.FatherName+" "+e.fees+" "+e.SchoolName);
		a.name="raman";
		a.fees=78000;
		a.FatherName="ABC";
		a.age=18;
		a.SchoolName="xyz";
		b.name="ritik";
		b.fees=78000;
		b.FatherName="DEF";
		b.age=18;
		b.SchoolName="uvw";
		c.name="manikant";
		c.fees=78000;
		c.FatherName="GHI";
		c.age=18;
		c.SchoolName="rst";
		d.name="mukhila";
		d.fees=78000;
		d.FatherName="JKL";
		d.age=18;
		d.SchoolName="opq";
		e.name="keshu";
		e.fees=78000;
		e.FatherName="MNO";
		e.age=18;
		e.SchoolName="lmn";
		System.out.println(a.name+" "+a.age+" "+a.FatherName+" "+a.fees+" "+a.SchoolName);
		System.out.println(b.name+" "+b.age+" "+b.FatherName+" "+b.fees+" "+b.SchoolName);
		System.out.println(c.name+" "+c.age+" "+c.FatherName+" "+c.fees+" "+c.SchoolName);
		System.out.println(d.name+" "+d.age+" "+d.FatherName+" "+d.fees+" "+d.SchoolName);
		System.out.println(e.name+" "+e.age+" "+e.FatherName+" "+e.fees+" "+e.SchoolName);
	}

}
