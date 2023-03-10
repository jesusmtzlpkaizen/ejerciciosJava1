import java.util.Scanner;
import static java.lang.Math. *;

 //Erercicio 2
	 
	 public static double areaCircle() {
			
			/*Pedimos el radio*/
			Scanner radio = new Scanner(System.in);
			System.out.println("Ingresa el radio");
			double numR = radio.nextDouble();
			
			/*Realizamos las operaciones*/
			
			double area = PI*(pow(numR,2.0));
			double circunferencia = (2.0)*PI*numR;
			
			System.out.println("El area del circulo es: "+area);
			System.out.println("La circunferencia del circulo es: "+circunferencia);
			
			
			/*Cerramos la escucha*/
			radio.close();
			
			
			
			
			return 0.0;
			
		} 
	 
	 
	 
	 //......
	 

public static void main(String[] args) {
		
		areaCircle();
		
	}