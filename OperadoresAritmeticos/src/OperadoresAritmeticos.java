import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		//Definir nestra l�nea de Scanner para guardar los datos de usuario
		Scanner entrada = new Scanner(System.in);
		
		//Declarar variables
		float numero1, numero2, suma, resta, multi, div, resto;
		
		System.out.println("Digite 2 n�meros");
		
		numero1 = entrada.nextFloat();
		numero2 = entrada.nextFloat();
		
		suma = numero1+numero2;
		resta = numero1-numero2;
		multi = numero1*numero2;
		div = numero1/numero2;
		resto = numero1%numero2;
		
		//Mostramos los operadores
		
		System.out.println("La suma es: "+ suma);
		System.out.println("La resta es: "+ resta);
		System.out.println("La multiplicaic�n es: "+ multi);
		System.out.println("La divisi�n es: "+ div);
		System.out.println("El resto es: "+ resto);

	}

}
