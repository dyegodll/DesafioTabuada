package home.pratice.desafioTabuadaMultiplicacao;


import java.util.Scanner;

public class DesafioTabuada{
	
	public static void main(String[] args) {
		
		System.out.println("\n *** Tabuada de Multiplicação ***\n");

		String sair = "";

		
		try(Scanner scan = new Scanner(System.in)) {
			
			do{
				
				System.out.println("Informe o número que você que aprender a tabuada: ");
	
				String input = scan.nextLine();
	
					if(input.equals("exit")){
						sair = input;
					}
					else{
	
						try{
						
							Integer num = Integer.parseInt(input);
	
							System.out.println("\nTabuada dos "+num+"\n");
	
							int contador = 0;
	
							do{
								System.out.println(num+" x "+contador+" = "+(num*contador));
								contador++;
							}while(contador<=10);
							
							System.out.println("\n * Se quiser parar a Tabuada digite: exit \n");
	
						}catch(Exception e){
						
							System.out.println("\nOPS! Informe um valor numérico válido para operação... Tente novamente\n");
						}
					}
	
			}while(sair.equals("exit") == false);
			
			
		}catch(Exception e) {
			System.out.println("OPS! Algo deu errado... ");
		};
		
		System.out.println("\n*** Fim da Tabuada ***");
	}

}