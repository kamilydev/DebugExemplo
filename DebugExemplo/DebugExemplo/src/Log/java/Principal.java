package Log.java;
import java.util.Scanner;
import java.io.IOException;

import br.com.loggin.Log;
import br.com.loggin.principal;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Principal {

	public static void main(String[] args) throws IOException{
		
        Log log = new Log("Logs");
        log.logger.setLevel(Level.FINE);
        log.logger.info("Rodou liso!!!");
        log.logger.warning("Vá com calma! tem algo para ser corrigido");
        log.logger.severe("Deu tudo errado!!");
		
		
		try (Scanner leitura = new Scanner(System.in)) {
			Calculadora c = new Calculadora();
			float a = 0, b = 0, resultado = 0;
			String operador;
			
			System.out.println("Calculadora");
			
			do {
				System.out.println("Insira o operador +, -, *, /");
				operador = leitura.nextLine();
				 log.logger.info( "Operador inserido: " + operador);
			
			} while (!(operador.contains("+") || operador.contains("-") || operador.contains("*")
					|| operador.contains("/")));

			System.out.println("Insira o 1o valor");
			a = leitura.nextFloat();
			log.logger.info( "Valor inserido no 1" + a);

			System.out.println("Insira o 2o valor");
			b = leitura.nextFloat();
			log.logger.info( "Valor inserido no 2" + b);


			resultado = c.calcular(a, b, operador.charAt(0));
			System.out.println("O resultado de " + a + " " + operador + " " + b + " �:" + resultado);
			
			  if (a<b && operador.contains("-")){
	                System.out.println("O resultado de " + b + " " + operador + " " + a + " �:" + resultado);
	                log.logger.info( "O resultado de " + b + " " + operador + " " + a + " �:" + resultado);

	            }else

	                System.out.println("O resultado de " + a + " " + operador + " " + b + " �:" + resultado);
	                log.logger.info( "O resultado de " + a + " " + operador + " " + b + " �:" + resultado);

		}

	}

}
