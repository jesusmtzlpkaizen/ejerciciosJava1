//Erercicio 10
		 
		 public static int sumaDosNumeros() {
			 
			    Scanner parametro = new Scanner(System.in);
				
				
				
				System.out.println("dame un numero");
				int num1 = parametro.nextInt();
				System.out.println("dame otro numero");
				int num2 = parametro.nextInt();
				int pasa;
				
				while(num2!=0) {
					pasa = num1 & num2 ;
					num1 = num1 ^ num2;
					num2 = pasa << 1;
					
				}
				System.out.println("la suma es : "+num1);
				
				parametro.close();
				
				
				return 0;
				
			} 
		 //......Cerramos el metodo para sumar numeros