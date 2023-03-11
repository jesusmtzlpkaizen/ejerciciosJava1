//Ejercicio 14
		 
		 public static int invertirCadena() {
			 
			    Scanner parametro = new Scanner(System.in);
				System.out.println("dame una frase");
				String frase = parametro.nextLine();
				StringBuilder inversor = new StringBuilder(frase);
				System.out.print(inversor.reverse());
				parametro.close();
				return 0;
				
			} 
		 //......Cerramos el metodo para invertir cadena