package desafio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class desafio2 {

	static int numero, numero2, resultado;

	Scanner datos = new Scanner(System.in);

	public static void opcion() {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division ");
		System.out.println("5. Salir");

		System.out.println("Elija una de estas opciones: ");
		numero = datos.nextInt();
	}

	public static void suma() {
		try {
			Scanner datos = new Scanner(System.in);
			System.out.println("Has elegido la opción 'SUMA'");
			System.out.println("Ingrese el primer número: ");
			numero = datos.nextInt();
			System.out.println("Ingrese el segundo número: ");
			numero2 = datos.nextInt();

			resultado = numero + numero2;
			System.out.println("El resultado es " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error: División por cero no permitida.");
		} catch (InputMismatchException e) {
			System.out.println("Error: Debes ingresar un dato valido.");
		}
	}

	public static void resta() {
		try {
			Scanner datos = new Scanner(System.in);
			System.out.println("Has elegido la opción 'RESTA'");
			System.out.println("Ingrese el primer número: ");
			numero = datos.nextInt();
			System.out.println("Ingrese el segundo número: ");
			numero2 = datos.nextInt();

			resultado = numero - numero2;
			System.out.println("El resultado es " + resultado);

		} catch (ArithmeticException e) {
			System.out.println("Error: División por cero no permitida.");
		} catch (InputMismatchException e) {
			System.out.println("Error: Debes ingresar un dato valido.");
		}
	}

	public static void multi() {
		try {
			Scanner datos = new Scanner(System.in);
			System.out.println("Has elegido la opción 'MULTIPLICACION'");
			System.out.println("Ingrese el primer número: ");
			numero = datos.nextInt();
			System.out.println("Ingrese el segundo número: ");
			numero2 = datos.nextInt();

			resultado = numero * numero2;

			System.out.println("El resultado es " + resultado);

		} catch (ArithmeticException e) {
			System.out.println("Error: División por cero no permitida.");
		} catch (InputMismatchException e) {
			System.out.println("Error: Debes ingresar un dato valido.");
		}
	}

	public static void div() {
		try {
			Scanner datos = new Scanner(System.in);

			System.out.println("Has elegido la opción 'DIVISION'");
			System.out.println("Ingrese el primer número: ");
			numero = datos.nextInt();
			System.out.println("Ingrese el segundo número: ");
			numero2 = datos.nextInt();
			resultado = numero / numero2;
			System.out.println("El resultado es " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Error: División por cero no permitida.");
		}
	}
	

	 public static void main(String[] args) {
			Scanner datos = new Scanner(System.in);
	        while (true) {
	            opcion();

	            switch (numero) {
	                case 1:
	                    suma();
	                    break;
	                case 2:
	                    resta();
	                    break;
	                case 3:
	                    multi();
	                    break;
	                case 4:
	                    div();
	                    break;
	                case 5:
	                    System.out.println("Has salido del programa");
	                    return; 
	                default:
	                    System.out.println("Seleccionaste la opción incorrecta");
	                    break;
	            }

	            System.out.println("¿Desea realizar otra operación? (si/no): ");
	            String respuesta = datos.next(); 

	            if (!respuesta.equalsIgnoreCase("si")) {
	                break; 
	            }
	        }
	    }
	}