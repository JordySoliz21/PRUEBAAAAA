package Array;
import java.util.Scanner;
public class ArregloLineal_main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		    System.out.print("Ingrese el tamaño de los arreglos: ");
		    int n = scanner.nextInt();
		    int[] A = new int[n];
		    int[] B = new int[n];
		    System.out.println("Ingrese los valores del arreglo A:");
		    for (int i = 0; i < n; i++) {
		      A[i] = scanner.nextInt();
		    }
		    System.out.println("Ingrese los valores del arreglo B:");
		    for (int i = 0; i < n; i++) {
		      B[i] = scanner.nextInt();
		    }

		    // Calcular el producto punto
		    int productoPunto = 0;
		    for (int i = 0; i < n; i++) {
		      productoPunto += A[i] * B[i];
		    }
		    System.out.println("El producto punto de A y B es: " + productoPunto);

		    // Calcular el producto de los arreglos
		    int productoArreglos = 1;
		    double moduloA = 0;
		    double moduloB = 0;
		    for (int i = 0; i < n; i++) {
		      productoArreglos *= A[i] * B[i];
		      moduloA += Math.pow(A[i], 2);
		      moduloB += Math.pow(B[i], 2);
		    }
		    moduloA = Math.sqrt(moduloA);
		    moduloB = Math.sqrt(moduloB);
		    double Z = productoArreglos / (moduloA * moduloB);
		    System.out.println("El producto de los arreglos dividido por el producto de sus módulos es: " + Z);

		    scanner.close();
		
		
	}
}	