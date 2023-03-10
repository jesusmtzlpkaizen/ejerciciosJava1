import java.util.Scanner;
import static java.lang.Math. *;


   //Erercicio 8
		 
		 public static double anioBisiesto() {
				
				/*Pedimos el año*/
				Scanner anio = new Scanner(System.in);
				System.out.println("Ingresa el anio\n");
				int numA = anio.nextInt();
				
				/*Realizamos las operaciones*/
				
				int calculo = numA%4;
				
				
				if (calculo == 0) {
					System.out.println("El anio es bisieso");
				}else {
					System.out.println("El anio no es bisieso");
				}
				
				
				
				
				
				
				
				/*Cerramos la escucha*/
				anio.close();
				
				
				
				
				return 0;
				
			} 
		 
		 
		 
		 //......Cerramos el metodo para calcular años bisiestos

public static void main(String[] args) {
		
		anioBisiesto();
	}