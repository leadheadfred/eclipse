public class bobImp implements bob{

	public void eat(String food) {
		System.out.println("Bob is " + bobMethods.hunger + " hungry");
		bobMethods.eat(food);
		System.out.println("Bob is now " + bobMethods.hunger + " hungry, after eating a " + food);
	}
	public void feedJeff(String food) {
		jeffMethods.eat(food);
		System.out.println("Bob fed Jeff with a  " + food);
	}

}
