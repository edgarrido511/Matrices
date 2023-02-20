
public class Programa {

	public static void main(String[] args) {
		Matriz a = new Matriz();
		System.out.println("Matriz 1:");
		a.imprimeMatrices(a.matriz1);
		System.out.println("Matriz 2:");
		a.imprimeMatrices(a.matriz2);
		System.out.println("Resultado multiplicacion:");
		a.multiplicarMatriz(a.matrizResultado,a.matriz1,a.matriz2);
		a.imprimeMatrices(a.matrizResultado);
		System.out.println("Resultado suma:");
		a.sumarMatriz(a.matrizResultado,a.matriz1,a.matriz2);
		a.imprimeMatrices(a.matrizResultado);
		//System.out.println("El mayor es:");
		//a.encuentraMayor(a.matriz1);
		System.out.println("Multiplicacion escalar");
		a.multiplicarEscalar(a.matriz1, 2);
		a.imprimeMatrices(a.matrizResultado);
	}

}
