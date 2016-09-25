package es.schooleando.UT1.Semana1;

import java.io.IOException;
import java.util.Arrays;

public class RunProcess {
// Creación de procesos
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
			System.out.println("La ejecución de " + Arrays.toString(args)+ " devuelve " + retorno);
			
		}
		// Se lanza una excepción dependiente del sistema en concreto, pero siempre será unasubclase de IOException.
		catch (IOException e) {
			System.err.println("Excepción de E/S");
			System.exit(-1);
		}
		catch (InterruptedException e) {
			System.err.println("El proceso hijo finalizó de forma incorrecta");
			System.exit(-1);
		}
	}

}