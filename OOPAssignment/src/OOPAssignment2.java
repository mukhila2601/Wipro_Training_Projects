class Students{
	String name;
	int age;
	String FatherName;
	int fees;
	String SchoolName;
	void show() {
		System.out.println(name+" "+age+" "+FatherName+" "+fees+" "+SchoolName);
	}
}
public class OOPAssignment2 {

	public static void main(String[] args) {
		Students a=new Students();
		a.name="raman";
		a.fees=78000;
		a.FatherName="ABC";
		a.age=18;
		a.SchoolName="xyz";
		a.show();
		Students b=new Students();
		b.name="ritik";
		b.fees=78000;
		b.FatherName="DEF";
		b.age=18;
		b.SchoolName="uvw";
		b.show();
		Students c=new Students();
		c.name="manikant";
		c.fees=78000;
		c.FatherName="GHI";
		c.age=18;
		c.SchoolName="rst";
		c.show();
		Students d=new Students();
		d.name="mukhila";
		d.fees=78000;
		d.FatherName="JKL";
		d.age=18;
		d.SchoolName="opq";
		d.show();
		Students e=new Students();
		e.name="keshu";
		e.fees=78000;
		e.FatherName="MNO";
		e.age=18;
		e.SchoolName="lmn";
		e.show();
	}

}
