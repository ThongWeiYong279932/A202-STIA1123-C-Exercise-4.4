import java.util.Scanner;

public class Fruits {							//super class
	Scanner scan = new Scanner(System.in);
	protected String name;				//Variables are protected so that only super class and subclass can access it
	public Fruits(String name) {		//Constructor receiving argument
			this.name = name;
			System.out.println("Fruit constructor is invoked");
			System.out.println(this.name + " is constructed");
		
	}
}
