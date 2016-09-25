package es.schooleando.UT1.Semana1;

import java.io.IOException;
import java.util.Arrays;

public class RunProcess {
// Creaci�n de procesos
	public static void main(String[] args) {
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		//se crea el proceso pb
		ProcessBuilder pb = new ProcessBuilder(args);
		try {
			 //Inicia un nuevo proceso utilizando los atributos indicados en el objeto. 
			Process process = pb.start();
			int retorno = process.waitFor();
			System.out.println("La ejecuci�n de " + Arrays.toString(args)+ " devuelve " + retorno);
			
		}
		// Se lanza una excepci�n dependiente del sistema en concreto, pero siempre ser� unasubclase de IOException.
		catch (IOException e) {
			System.err.println("Excepci�n de E/S");
			System.exit(-1);
		}
		catch (InterruptedException e) {
			System.err.println("El proceso hijo finaliz� de forma incorrecta");
			System.exit(-1);
		}
	}

}