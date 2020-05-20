
abstract class Dog {
	String Breed;
	
	public void bark() {
		System.out.println("Bark!");
	}
	public abstract void poop();
}


class Chihua extends Dog {
	public void poop() {
		System.out.println("Cago");
	}
}



public class AbstractTutorial {
	public static void main(String[] args) {

		Chihua c = new Chihua();
		c.bark();
		c.poop();
	}
}
