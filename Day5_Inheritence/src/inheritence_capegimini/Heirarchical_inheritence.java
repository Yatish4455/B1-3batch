package inheritence_capegimini;
 class vehicle
{
	void main()
	{
		System.out.println("vehicle types");
	}
}
class car extends vehicle
{
	void display()
	{
		System.out.println("BMW");
	}
}

class bike extends vehicle
{
	void print()
	{
		System.out.println("Bullet");
	}
}


public class Heirarchical_inheritence {

	public static void main(String[] args) {
		car obj=new car();
		bike obj1=new bike();
		obj.main();
		obj.display();
		obj1.print();
		

	}

}


