
public class GreenApple extends Apple {						//sub class of Apple
	private String color, taste;							//Variables are privatized to prevent other class to access or change it
	GreenApple(String name, double price, String color, String taste){			//Constructor receiving argument
		super (name, price);													//Inherit variable from superclass Apple
		this.color = color;
		this.taste = taste;
	}
	
	public String toString() {
		return ("Total price = RM" + totalprice + "\n" + this.name + " color is " + this.color + "\n" + this.name + " taste is " + this.taste);
	}
}
