import java.util.Scanner;
import static java.lang.Math. *;


 //Erercicio 6
		 
		 public static double volCono() {
				
				/*Pedimos el radio y la altura*/
				Scanner radio = new Scanner(System.in);
				System.out.println("Ingresa el radio");
				double numR = radio.nextDouble();
				Scanner altura = new Scanner(System.in);
				System.out.println("Ingresa la altura");
				double numA = altura.nextDouble();
				
				/*Realizamos las operaciones*/
				
				double volumen = (PI*pow(numR,2)*numA)/3;
				
				
				System.out.println("El volumen de cono es: "+ volumen);
				
				
				
				/*Cerramos la escucha*/
				radio.close();
				altura.close();
				
				
				
				
				return 0.0;
				
			} 
		 
		 
		 
		 //......Cerramos metodo Volumen del cono

public static void main(String[] args) {
		
		
		volCono();
		
	}