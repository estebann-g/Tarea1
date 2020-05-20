
abstract class Carros {
	//public void Motor() {
	//	System.out.println("Electrioc o de gasolina");
	//}
	public abstract void Marca();
	public abstract void Motor();
	public abstract void NdePuertas();
	public abstract void VelocidadMaxima();
	public abstract void Anho();
	//public abstract String CuatroxCuatro();
}

class Tessla extends Carros {
	public void Marca() {
		System.out.println("Tessla");
	}
	public void Motor() {
		System.out.println("Electrico");
	}
	public void NdePuertas() {
		System.out.println("Numero de puertas: 5");
	}

	public void VelocidadMaxima() {
		System.out.println("Velocidad maxima: 200km/h?");
	}
	 public void Anho() {
	 System.out.println("Anho: 2021");
	 }
	 //public String CuatroxCuatro(){
		// return "No";
	 //}
}

class Porsche extends Carros{
	public void Marca() {
		System.out.println("Porsche");
	}
	
	public void Motor() {
		System.out.println("De Gasolina");
	}
	public void NdePuertas() {
		System.out.println("Numero de Puertas: 3");
	}

	public void VelocidadMaxima() {
		System.out.println("Velocidad Maxima: 250km/h?");
	}
	 public void Anho() {
	 System.out.println("Anho: 2020");
	 }
	// public String CuatroxCuatro() {
		//return "No";
	// }
}

public class TareaCorta1ED {

	public static void main(String[] args) {
		Tessla t = new Tessla();
		//t.Motor();
		t.Marca();
		t.Motor();
		t.NdePuertas();
		t.VelocidadMaxima();
		t.Anho();
		//t.CuatroxCuatro();
		
		System.out.println("-------------------------------------------");
		
		Porsche p = new Porsche();
		p.Marca();
		p.Motor();
		p.NdePuertas();
		p.VelocidadMaxima();
		p.Anho();
		//p.CuatroxCuatro();
	}

}
