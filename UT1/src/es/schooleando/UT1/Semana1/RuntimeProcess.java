package es.schooleando.UT1.Semana1;

import java.io.IOException;

//Creación de un proceso mediante Runtime

public class RuntimeProcess {

	public static void main(String[] args) throws IOException {
		
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		
		Runtime runtime = Runtime.getRuntime();
		try {
			Process process = runtime.exec(args);
			//termina el proceso
			process.destroy();
		}
		catch (IOException e){
			System.err.println("Excepcion de E/S!");
			System.exit(-1);
		}

	}

}