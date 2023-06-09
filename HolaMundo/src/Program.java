
public class Program {

	public static void main(String[] args) {
		System.out.println("hola mundo");
		
		//Tipos de datos primitivos
		int numero = 20;
		System.out.println(numero);
		
		double medio = 0.6;
		System.out.println(medio);
		
		boolean verdadero = true;
		System.out.println(verdadero);
		
		//Tipos de datos objetos
		String nombre = "Cesar";
		System.out.println(nombre);
		
		@SuppressWarnings("removal") //Los @ son anotaciones
		Integer num = new Integer(2);
		System.out.println(num);
		
		//Conversion de tipos
		//numero = medio; No compila, asignacion invalida
		
		medio = numero; //Conversion implicita
		
		String enLetras = Integer.toString(numero); //Conversion explicita
		System.out.println("El numero es " + enLetras);
		System.out.printf("El numero es %s", enLetras);
		System.out.println();
		System.out.printf("El numero es %d", numero);
		System.out.println();

		enLetras = "33";
		numero = Integer.parseInt(enLetras);
		System.out.println(numero);

		//Captura de excepciones
		try {
			enLetras = "22dos";
			numero = Integer.parseInt(enLetras);
		} catch(NumberFormatException ex) {
			System.out.println(" No se pudo hacer la conversion de " + enLetras + " a int");
		}
		
		//Convierto un string en un float
		enLetras = "0.5";
		float f = Float.parseFloat(enLetras);
		System.out.println(f);
	}

}
