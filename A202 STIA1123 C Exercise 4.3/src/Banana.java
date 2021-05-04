
public class Banana extends Fruits {							//sub class of Fruits
	private int number;											//Variables are privatized to prevent other class to access or change it
	private double discountrate, price, weight, totalprice;
	Banana(String name, double price, double weight){			//Constructor receiving argument
		super(name);											//Inherit variable from superclass Fruits
		this.price = price;
		this.weight = weight;
		System.out.println("The price per kg of banana is RM" + this.price);
		System.out.println("The weight of each babana is = " + this.weight + "kg");
		System.out.print("The number of banana you want to buy is :");
		this.number = scan.nextInt();
		System.out.println("The total weight of banana you bought is " + this.number*this.weight + "kg");
		determinePriceFormula();
	}
	
	public void determinePriceFormula() {						//Overriding method
		if (this.number*this.weight < 10 ) {
			totalprice = CalculatePrice();
		}
		else if (this.number*this.weight > 10  && this.number*this.weight < 100) {
			discountrate = 0.85;
			System.out.println("Since you buy more than 10kg and less than 100kg of bananas, you have 15% discount");
			totalprice = CalculatePrice(discountrate);
		}
		else {
			discountrate = 0.80;
			weight = 100;
			System.out.println("Since you buy bananas of 100kg or more, you have 20% discount and the price is always calculated using 100kg of bananas");
			totalprice = CalculatePrice(discountrate, weight);
		}
	}
	
	public double CalculatePrice() {											//Overloading with no argument
		return this.number * this.weight * this.price;
	}
	
	public double CalculatePrice(double discountrate) {							//Overloading with 1 argument
		return this.number * this.weight * this.price * discountrate;
	}
	
	public double CalculatePrice(double discountrate, double weight) {			//Overloading with 2 argument
		return weight * this.price * discountrate;
	}
	
	public String toString() {
		return ("Total Price = RM" + totalprice);
	}
}
