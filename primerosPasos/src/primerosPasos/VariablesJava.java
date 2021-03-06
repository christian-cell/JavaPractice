package primerosPasos;
public class VariablesJava {
   public static void main(String[] args) {
		/* 
		 * los tipos de datos primitivos serán para números Long para números superiores a -2.147.483.148 y superiores
		 * a 2.147.483.648 , al declararlos como Long ocuparan 8 bytes de memoria y después de la cifra ej
		 * 3.000.000.000L   , le ponemos L
		 * 
		 * Int para aquellos comprendidos entre -2.147.483.148 y 2.147.483.148 ocupan 4 bytes de memoria
		 * 
		 * Short para aquellos comprendidos entre -32768 y 32767 ocupan tan solo 2byte de memoria
		 * 
		 * y los byte para aquellos comprendidos entre -128 y 127 ocupan tan solo un byte de memoria
		 * 
		 * Números decimales : Float de 6 a 7 decimales ocupan 4 bytes de memoria después de poner la cifra F
		 * ej : 3'23 F;
		 * 
		 * Double hasta 15 decimales ocupando 8 bytes de memoria
		 * 
		 * Char para caracteres ej; char letra = 'l';
		 * Boolean cuando queremos almacenar un dato que solo puede ser verdadero o false
		 * SIMPRE AJUSTAREMOS AL MÁXIMO EL VALOR DE LA VARIABLE  para optimizar espacio en momoria
		 */
		Double longFloatNumber = 0.234857694874849837383949478339937848 ;
		float floatNumber = 3.2F;
		short shortNumbre;
		int mediumNumber;
	    long bigNumber = 5000000000000L ;	
		byte edad = 40;
		char letra = 'l';
		boolean status = false;
		System.out.println(edad);
		edad = 100;
        System.out.print(longFloatNumber); /* hay datos que no se pueden inprimir con print */
   }
}
