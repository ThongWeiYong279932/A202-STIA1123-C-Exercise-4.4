public class Apple extends Fruits {							// sub class of Fruits and super class for RedApple and GreenApple
	protected int number;									//Variables are protected so that only super class and subclass can access it
	protected double discountrate, price, totalprice;
	Apple(String name, double price){						//Constructor receiving argument
		super(name);										//Inherit variable from superclass Fruits
		this.price = price;
		System.out.println("The price per apple is RM" + this.price);
		System.out.print("The number of apple you want to buy is :");
		this.number = scan.nextInt();
		determinePriceFormula();
	}
	
	public void determinePriceFormula() {					//Overriding method
		if (this.number <10 ) {
			totalprice = CalculatePrice();
		}
		else if (this.number > 10  && this.number < 100) {
			discountrate = 0.9;
			System.out.println("Since you buy more than 10 and less than 100 apples, you have 10% discount");
			totalprice = CalculatePrice(discountrate);
		}
		else {
			discountrate = 0.85;
			number = 100;
			System.out.println("Since you buy 100 or more apples, you have 15% discount and the price is always calculated using 100 apples");
			totalprice = CalculatePrice(discountrate, number);
		}
	}
	
	public double CalculatePrice() {										//Overloading with no argument
		return this.number * this.price;
	}
	
	public double CalculatePrice(double discountrate) {						//Overloading with 1 argument
		return this.number * this.price * discountrate;
	}
	
	public double CalculatePrice(double discountrate, int number) {			//Overloading with 2 argument
		return number * this.price * discountrate;
	}
	
	public String toString() {
		return ("Total Price = RM" + totalprice);
	}

}
