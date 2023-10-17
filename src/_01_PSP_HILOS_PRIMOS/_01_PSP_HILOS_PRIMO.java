package _01_PSP_HILOS_PRIMOS;

//Hacer un programa que pida 3 números a un usuario por pantalla
//a partir de esos números arrancamos 3 hilos a partir de una misma clase que tendrán que decir si son primos o no
//Se pide también que se calcule el tiempo que tarda cada hilo en ejecutarses. 
//Ayuda: La clase Date guarda el tiempo en milisegundos desde el año 1970. Date date = new Date(); date.getTime() //nos devuelve el numero de milisegundos
import java.util.*;

public class _01_PSP_HILOS_PRIMO implements Runnable {

	private long num;
	private long tiempoInicio;

	public _01_PSP_HILOS_PRIMO(long num, long tiempoInicio) {
		this.num = num;
		this.tiempoInicio = tiempoInicio;
	}

	@Override
	public void run() {
		tiempoInicio = new Date().getTime();
		String Result = esPrimo(num) ? " es primo" : " no es primo"; // Uso variable ternaria porque booleanos se bugea
																		// mucho
		long tiempoFin = new Date().getTime();
		long tiempoEjecucion = tiempoFin - tiempoInicio;

		System.out.println(num + "" + Result);
		System.out.println("Tiempo de ejecuccion " + ":" + tiempoEjecucion + " ms");
	}

	private boolean esPrimo(long num2) {
		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return true;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

}