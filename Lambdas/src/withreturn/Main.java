package withreturn;

public class Main {

	public static void main(String[] args) {
		engine((x,y) -> x+y);
		engine((x,y) -> x*y);
		
		System.out.println(create().calcula(12,4));
	}
	
	public static void engine(Calculadora cal) {
		int x = 2, y = 4;
		int resultado = cal.calcula(x, y);
		System.out.println(resultado);
	}
	
	public static Calculadora create() {
		return ((x,y) -> x / y);
	}

}
