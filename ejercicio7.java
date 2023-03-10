import java.util.Scanner;
import static java.lang.Math. *;
//Erercicio 7
		 
		 public static double areaSupCubo() {
				
				/*Pedimos el lado*/
				Scanner lado = new Scanner(System.in);
				System.out.println("Ingresa el lado");
				double numL = lado.nextDouble();
				
				/*Realizamos las operaciones*/
				
				double area = 6*pow(numL,2);
				
				
				System.out.println("El area superficial del cubo es: "+ area);
				
				
				
				/*Cerramos la escucha*/
				lado.close();
				
				
				
				
				return 0.0;
				
			} 
		 
		 
		 
		 //......Cerramos metodo del area suerficial del cubo

public static void main(String[] args) {
		
		areaSupCubo();
		
	}