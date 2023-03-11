 //Erercicio 12
		 
		 public static int sumaDigitos() {
			 
			    Scanner parametro = new Scanner(System.in);
				System.out.println("dame un numero de dos digitos");
				int num = parametro.nextInt();
				String numS1 = String.valueOf(Integer.toString(num).charAt(0));
				String numS2 = String.valueOf(Integer.toString(num).charAt(1));
				int suma = (Integer.parseInt(numS1)) +(Integer.parseInt(numS2));
				
				System.out.print(suma);
				
				
				parametro.close();
				
				
				return 0;
				
			} 
		 //......Cerramos el metodo para sumar digitos