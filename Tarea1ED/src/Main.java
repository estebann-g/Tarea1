
public class Main {

	public static void main(String[] args) {
		Mamifero mamifero = new Mamifero();
		Halcon falcon = new Halcon();
		Animales prueba = new Mamifero();
		Animales prueba2 = new Mamifero();
		
		mamifero.algunMamifero();
		mamifero.caminar();
		falcon.caminar();
		falcon.volar();
		prueba2.caminar();
		prueba.caminar();
	}

}
