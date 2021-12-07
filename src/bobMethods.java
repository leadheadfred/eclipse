
public class bobMethods {
	public static int hunger;
	public static int thirst;
	public static void eat(String food) {
		hunger--;
	}
	public static void drink(String fluid) {
		thirst--;
	}
	public static void feedJeff(String food) {
		jeffMethods.eat(food);
	}
}
