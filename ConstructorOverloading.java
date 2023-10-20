package package22;

public class ConstructorOverloading {
	ConstructorOverloading(int a, int b)
	{
		System.out.println("Hiii i am constuctor hear  and we are overloading aswell   2");
	}
	ConstructorOverloading(char a)
	{
		System.out.println("Hiii i am constuctor hear  and we are overloading aswell   3");
	}
	public static void main(String[] args) {
		new ConstroctorOverloading_SNsatic(10, 39);
		new ConstroctorOverloading_SNsatic('d');

	}

}
