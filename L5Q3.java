import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static double somatorio(String nomecandidato, int posicao, int tamanho, int soma ) {
						
			while (posicao < tamanho) {
				soma += nomecandidato.charAt(posicao); 
				posicao ++;
				somatorio(nomecandidato,posicao,tamanho,soma);				
			}
			return soma;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double paciencia = in.nextDouble();
		int qtdpessoas = in.nextInt();
		in.nextLine();
		double [] F = new double[qtdpessoas];
		String [] Nomes = new String[qtdpessoas];
		
		for (int i = 0; i<qtdpessoas; i++) {
			paciencia = paciencia*0.99;
			String nomecandidato = in.nextLine();
			if  (nomecandidato.equals("Troy Bolton") ||  nomecandidato.equals("Gabriella Montez") || nomecandidato.equals("Sharpay Evans") || nomecandidato.equals( "Ryan Evans")){
				F[i] = (somatorio(nomecandidato,0,nomecandidato.length(),0) * paciencia) + 350 ;
				Nomes[i] = nomecandidato;				
			}
			else {
				F[i] = (somatorio(nomecandidato,0,nomecandidato.length(),0) * paciencia);
				Nomes[i] = nomecandidato;
			}
		}
		
		// verifica quem � o maior
		double maior = 0;
		int posmaior = 0;
		for (int i = 0; i<qtdpessoas; i++) {
			if (F[i] >= maior) {
				maior = F[i];
				posmaior = i;
			}
		}
		
		System.out.println("O grande vencedor(a) do papel principal desse ano foi " + Nomes[posmaior] + "!");
		
		

	}
}