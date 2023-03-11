 //Ejercicio 13
		 
		 public static int borrarEspacios() {
			 
			    Scanner parametro = new Scanner(System.in);
				System.out.println("dame una frase");
				System.out.print(parametro.nextLine().replace(" ", ""));
				parametro.close();
				return 0;
				
			} 
		 //......Cerramos el metodo para quitar espacios en blanco
		 