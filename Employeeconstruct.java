package employeeconstruct;
public class Employeeconstruct
{
	int id;
	String name;
	
	public Employeeconstruct(int i, String n)
	{
		id = i;
		name = n;
	}
	void show()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		Employeeconstruct emp1 = new Employeeconstruct(1, "Govind");
		Employeeconstruct emp2 = new Employeeconstruct(2, "Akash");
		emp1.show();
		emp2.show();
	}
}
