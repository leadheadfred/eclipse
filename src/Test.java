import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		bob bobImp = new bobImp();
		bobMethods.hunger = 10;
		bobImp.eat("cheese");
		assert(bobMethods.hunger ==9);
	}
	@org.junit.jupiter.api.Test
	void test1() {
		bob bobImp = new bobImp();
		jeffMethods.hunger = 10;
		bobImp.feedJeff("crackers");
		assert(jeffMethods.hunger ==9);
	}

}
