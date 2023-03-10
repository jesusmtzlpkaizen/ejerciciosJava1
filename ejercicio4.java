import java.util.Scanner;
import static java.lang.Math. *;

//Erercicio 4
		 
		 public static double timeTransform() {
				
				/*Pedimos los segundos*/
				Scanner segundos = new Scanner(System.in);
				System.out.println("Ingresa los segundos\n");
				int numSeg = segundos.nextInt();
				
				/*Realizamos las operaciones*/
				
				int horas = numSeg/3600;
				int residuoHoras = numSeg%3600;
				int minutos = residuoHoras/60;
				int segundosRestantes = (numSeg-(horas*3600)-(minutos*60));
				
				
				
				System.out.println("Las horas son: "+ horas);
				System.out.println("Los minutos son: "+ minutos);
				System.out.println("Los segundos son: "+ segundosRestantes);
				
				
				
				/*Cerramos la escucha*/
				segundos.close();
				
				
				
				
				return 0;
				
			} 
		 
		 
		 
		 //......Cerramos el metodo para calculo de horas minutos y segundos

public static void main(String[] args) {
		
		//timeTransform();
		
	}