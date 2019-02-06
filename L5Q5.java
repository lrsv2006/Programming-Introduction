import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static String[] nomesinvertidos (String nomes [], int tamanho) {
	String nomeinvertido [] = new String [tamanho];
	
	
	for (int i = 0, j = tamanho-1; i < tamanho; i++, j--) {
		nomeinvertido[i] = nomes[j];
			} 
		return nomeinvertido;
	
	}
	
	public static int[] comidasinvertidas (int qtdcomida [], int tamanho) {
		int qtdcomidainvertida[] = new int [tamanho];
		
		for (int i = 0, j = tamanho-1; i < tamanho; i++, j--) {
			qtdcomidainvertida[i] = qtdcomida [j];
				} 
		return qtdcomidainvertida;
			
		}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qtdamigos = in.nextInt();
		
		String tudo [] =  new String [qtdamigos*2];
		String nomes [] = new String [qtdamigos];
		int qtdcomida [] = new int [qtdamigos];
		for (int i = 0; i < qtdamigos*2; i++) {
				String a = in.next();
				tudo[i] = a;
			}
		
		for (int i = 0, j = 0; i < qtdamigos; i++, j++, j++) {
			nomes[i] = tudo[j];
		}
		
		for (int i = 0, j = 1; i < qtdamigos; i++, j++, j++) {
			qtdcomida[i] = Integer.parseInt(tudo[j]);
		}
		nomes = nomesinvertidos(nomes,qtdamigos);
		qtdcomida = comidasinvertidas(qtdcomida, qtdamigos);
		
		for (int i = 0; i < qtdamigos; i++) {
			if (qtdcomida[i] <= 400) {
				System.out.println(nomes[i] + " foi servido(a).");
			} else {
				int j = qtdcomida[i];
				while (j > 0) {
					System.out.println(nomes[i] + " foi servido(a).");
					j = j-400;
					if (j>0) {
					System.out.println("Fica tranquilo(a), " + nomes[i] + " pode se servir novamente!");
					}
				}
				
			}
		}
    
  }
}