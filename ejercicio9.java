 //Erercicio 9
		 
		 public static int primerosCien() {
				
				System.out.println("Los numeros primos son: \n1");
				for (int contador1=1;contador1<100;contador1++) {
					
					int conteoDivisible = 0;
					
					for(int contador2=1;contador2<=contador1;contador2++) {
						
						if ((contador1%contador2)==0) {
							conteoDivisible ++;
						}//cerramos if
						
						}//Cerramos for
					
					
					    if (conteoDivisible==2) {
						
						System.out.println(contador1);
					    }
					}
				
				return 0;
				
			} 
		 //......Cerramos el metodo para imprimir los primeros 100 numeros primos