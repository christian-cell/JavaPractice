package primerosPasos;

public class OperadoresJava {
	public static void main(String args[]) {
		/*
		 * Aritméticos : + suma  ; - resta ; * multiplicacion ; / division 
		 * Lógicos : < menor que ; > mayor que ; <> mayor o menor que ; != distinto a ; == igual a ;
		 * && y lógico si el primer valor es igual a , si el segundo valor es igual a ... o diferente ; 
		 * ++ -- incremento o decremento de 1 , importantisimo para hacer bucles; +=4 -=4 para añadirle 4
		 * por ejemplo al número de la izquierda.
		 * CONCATENACIÓN: +: une o concatena ; EJS:
		 * 
		 * INTERESANTE ver segun se pone System. ver el desplegable con todos los métodos del objeto System
		 * lo mismo con out. porque hay diferentes print para imprimir segun que tipo de datos
		 * 
		 * si declaramos variables de tipo int para almacenar números que luego vamos a dividir esto nos dará un error
		 * por lo tanto guardarlos en float es un comodín
		 */
		float n = 3 ; float g = 2; float result = n + g;
		float a = 5; float b; b=7; /* int c = b+a; c++; c+=8; c-=21;*/
		
		float d = a/b;
		
	    System.out.println(result);
	}

}
