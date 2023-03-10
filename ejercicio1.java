import java.util.Scanner;
import static java.lang.Math. *;


//Ejercicio 1
	
	 public static double area() {
		
		/*Pedimos el numero 1*/
		Scanner getNumber1 = new Scanner(System.in);
		System.out.println("Ingresa el primer lado");
		double num1 = getNumber1.nextDouble();
		/*Pedimos el numero 2*/
		Scanner getNumber2 = new Scanner(System.in);
		System.out.println("Ingresa el segundo lado");
		double num2 = getNumber2.nextDouble();
		/*Pedimos el numero 3*/
		Scanner getNumber3 = new Scanner(System.in);
		System.out.println("Ingresa el tercer lado");
		double num3 = getNumber1.nextDouble();
		/*Realizamos las operaciones*/
		double sP, resultado;
		 
		sP = (num1+num2+num3)/2;
		
		resultado = sqrt(sP*(sP-num1)*(sP-num2)*(sP-num3));//fallara cuando los numeros dados no pertenezcan a un triangulo para resolver esto sera necesario utilizar condicionales
		
        if(resultado>0){
            System.out.println(resultado);

        }else {
            System.out.println("los valores ingresados son erroneos");
        }
		
		
		
		
		/*Cerramos la escucha*/
		getNumber1.close();
		getNumber2.close();
		getNumber3.close();
		
		
		
		return 0.0;
		
	} 
public static void main(String[] args) {
		area();
		
	}