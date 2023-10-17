package _01_PSP_HILOS_PRIMOS;
//Hacer un programa que pida 3 números a un usuario por pantalla

//a partir de esos números arrancamos 3 hilos a partir de una misma clase que tendrán que decir si son primos o no
//Se pide también que se calcule el tiempo que tarda cada hilo en ejecutarses. 
//Ayuda: La clase Date guarda el tiempo en milisegundos desde el año 1970. Date date = new Date(); date.getTime() //nos devuelve el numero de milisegundos

import java.util.*;

public class _01_PSP_HILOS_PRIMO_MAIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] num = new long[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("Ingrese el numero " + (i + 1) + " : ");
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			Thread hilo = new Thread(new _01_PSP_HILOS_PRIMO(num[i], i));
			hilo.start();
		}
		sc.close();
	}

}
