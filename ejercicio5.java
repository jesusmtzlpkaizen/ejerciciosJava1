import java.util.Scanner;
import static java.lang.Math. *;



//Erercicio 5
		 
		 public static double volEsfera() {
				
				/*Pedimos el radio*/
				Scanner radio = new Scanner(System.in);
				System.out.println("Ingresa el radio");
				double numR = radio.nextDouble();
				
				/*Realizamos las operaciones*/
				
				double volumen = (4*PI*pow(numR,3))/3;
				
				
				System.out.println("El volumen de la esfera es: "+ volumen);
				
				
				
				/*Cerramos la escucha*/
				radio.close();
				
				
				
				
				return 0.0;
				
			} 
		 
		 
		 
		 //......Cerramos metodo Volumen de la esfera
public static void main(String[] args) {
		
		volEsfera();
		
	}