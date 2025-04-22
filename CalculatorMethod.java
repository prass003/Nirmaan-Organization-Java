package Day10;


class CalculatorMethod{
	
	public void Add(int a , int b) {
		System.err.println("------------------------------");
		System.err.println("Addition : "+ (a + b));
	}
	public void Sub(int a , int b) {
		System.err.println("Subtrction  : "+ (a - b));
	}
	public void Mul(int a , int b) {
		System.err.println("Multiplication : "+ (a * b));
	}
	public void Div(int a , int b) {
		System.err.println("Division : "+ (a / b));
	}
	public void Mod(int a , int b) {
		System.err.println("Modulo Division : "+ (a % b));
		System.err.println("------------------------------");
	}
}

