

import java.io.*;

public class ConversionMoneda {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cantidad;
		String codigoconversion;
		double valorotramoneda2 = 0.0;  // Inicialización de la variable
		String moneda = "";  // Inicialización de la variable
		String valorotramoneda1 = "";  // Inicialización de la variable

//Bienvenida y listado de opciones de conversion//
		System.out.println(" ***** Bienvenido al programa de conversión de moneda ****** ");
		System.out.println("Por favor, escoja la conversión que desea realizar");
		System.out.println("a. Dólar (USD) a Peso argentino (ARS)");
		System.out.println("b. Peso argentino (ARS) a Dólar (USD)");
		System.out.println("c. Dólar (USD) a Real brasileño (BRL)");
		System.out.println("d. Real brasileño (BRL) a Dólar (USD)");
		System.out.println("e. Dólar (USD) a Peso colombiano (COP)");
		System.out.println("f. Peso colombiano (COP) a Dólar (USD)");
		System.out.println("g. Salir");


		codigoconversion = bufEntrada.readLine();

		switch (codigoconversion) {
			case "a":
				valorotramoneda1 = "ARS";
				valorotramoneda2 = 985.76;
				moneda = "USD";
				break;
			case "b":
				valorotramoneda1 = "USD";
				valorotramoneda2 = 0.0010;
				moneda = "ARS";
				break;
			case "c":
				valorotramoneda1 = "BRL";
				valorotramoneda2 = 5.71;
				moneda = "USD";
				break;
			case "d":
				valorotramoneda1 = "USD";
				valorotramoneda2 = 0.18;
				moneda = "BRL";
				break;
			case "e":
				valorotramoneda1 = "COP";
				valorotramoneda2 = 4328.40;
				moneda = "USD";
				break;
			case "f":
				valorotramoneda1 = "USD";
				valorotramoneda2 = 0.00023;
				moneda = "COP";
				break;

			case "g":
				System.out.println("Saliendo.....");
				break;
			default:
				System.out.println("Código de conversión incorrecto. El programa se cerrará.");
				System.exit(0);
		}

		System.out.println("Ingrese la cantidad de " + moneda + " que desea convertir a " + valorotramoneda1);
		cantidad = Double.parseDouble(bufEntrada.readLine());
		double resultado = valorotramoneda2 * cantidad;

		System.out.println(String.format("%.2f %s equivalen a $ %.2f %s", cantidad, moneda, resultado, valorotramoneda1));
	}
}
