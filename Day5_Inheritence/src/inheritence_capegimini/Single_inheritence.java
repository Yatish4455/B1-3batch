package inheritence_capegimini;
class Parent
{
	void print()
	{
		System.out.println("Hello");
		
	}
}

class Child extends Parent
{
	void display()
	{
		System.out.println("Hello its child class");
	}
	
}



public class Single_inheritence {

	public static void main(String[] args) {
 
		Child c=new Child();
		c.display();
		c.print();

	}

}