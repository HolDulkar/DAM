
public class ProvaCalculadora {
	
	public static void main(String[] args) {
		Calculadora calcu = new Calculadora(20, 10);
		
		System.out.println("suma = " + calcu.suma());
		System.out.println("resta = " + calcu.resta());
		System.out.println("multiplicacio = " + calcu.multiplica());
		System.out.println("divisio = " + calcu.divisio());
	}
}
