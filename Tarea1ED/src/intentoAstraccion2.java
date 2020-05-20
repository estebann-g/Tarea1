
abstract class Hoomans {
	public void color() {
		System.out.println("Caucasian");
	}

	public abstract void age();

	public abstract void height();

}

class Esteban extends Hoomans {
	public void age() {
		System.out.println("18");
	}

	public void height() {
		System.out.println("1.83");
	}
}

public class intentoAstraccion2 {
	public static void main(String[] args) {
		Esteban e = new Esteban();
		e.color();
		e.age();
		e.height();
	}
}
