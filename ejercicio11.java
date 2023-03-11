  //Erercicio 11
		 
		 public static int numeroPalindromo() {
			 
			    Scanner parametro = new Scanner(System.in);
				System.out.println("dame un numero de dos digitos");
				int num = parametro.nextInt();
				String numS = String.valueOf(num);
				System.out.println((numS.charAt(0)==numS.charAt(1))?"es palindromo":"no es palindromo");
				
				parametro.close();
				
				
				return 0;
				
			} 
		 //......Cerramos el metodo para determinar el palindromo