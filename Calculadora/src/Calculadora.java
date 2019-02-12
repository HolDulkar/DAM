
public class Calculadora {
	private int num1;
	private int num2;
	
	public Calculadora(int n1, int n2) {
		this.num1=n1;
		this.num2=n2;
	}
	public int suma() {
		int resultat = num1 + num2;
		return resultat;
	}
	public int resta() {
		int resultat;
		if (resta2())
			resultat = num1 - num2;
		else
			resultat = num2 - num1;
		return resultat;
	}
	public int multiplica() {
		int resultat = num1 * num2;
		return resultat;
	}
	public int divisio() {
		int resultat = num1 / num2;
		return resultat;
	}
	public boolean resta2() {
		if (num1 > num2) return true;
		else return false;
	}
	public Integer divideix2() {
		Integer resul;
		if (num2 == 0)
			return null;
		else
			resul= num1 / num2;
		return resul;
	}
	public int divideix0() {
		int resultat;
		if (num2 == 0)
			throw new ArithmeticException("Divisio per 0");
		else
			resultat = num1 / num2;
		return resultat;
	}
}

