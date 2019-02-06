import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		int tamanhomatriz = in.nextInt();
		float vidaryu = in.nextFloat();
		float vidaken = in.nextFloat();
		float [] [] matrizryu = new float[tamanhomatriz] [tamanhomatriz];
		float [] [] matrizken = new float[tamanhomatriz] [tamanhomatriz];
		
		for (int i = 0; i<tamanhomatriz; i++) {
			for (int j = 0; j < tamanhomatriz; j++) {
				int valoresmatrizes = in.nextInt();
				matrizryu [i] [j] = valoresmatrizes;
			}
				
		}
		
		for (int i = 0; i<tamanhomatriz; i++) {
			for (int j = 0; j < tamanhomatriz; j++) {
				int valoresmatrizes = in.nextInt();
				matrizken [i] [j] = valoresmatrizes;
			}
				
		}
		
		int ataqueryu = 0;
		for (int i = 0; i<tamanhomatriz; i++) {
			ataqueryu += matrizryu[i][i]; 
			
		}
		
		int ataqueken = 0;
		for (int i = 0; i<tamanhomatriz; i++) {
			ataqueken += matrizken[i][i]; 
			
		}
		
		int defesaryu = 0;
		for (int i = 0, j = matrizryu.length-1; i<matrizryu.length && j>=0; j--, i++) {
			defesaryu += matrizryu[i][j]; 
		}
		
		int defesaken = 0;
		for (int i = 0, j = matrizken.length-1; i<matrizken.length && j>=0; j--, i++) {
			defesaken += matrizken[i][j]; 
			
			
		}
		
		int quantidadeacoes = in.nextInt();
		int danoryu = 0;
		int danoken = 0;
		
		
		for (int i = 0; i<quantidadeacoes; i++) {
			String acao1 = in.next();
			String acao2 = in.next();
			
			if (acao1.equals("A") && acao2.equals("A")) {
				if (ataqueryu>ataqueken) {
					danoryu = ataqueryu - ataqueken;
					vidaken = vidaken - danoryu;
				} else if (ataqueken>ataqueryu) {
					danoken = ataqueken - ataqueryu;
					vidaryu = vidaryu - danoken;
				}
							
			} else if (acao1.equals("A") && acao2.equals("D")) {
				if (ataqueryu>defesaken) {
					vidaken = vidaken - ((ataqueryu-defesaken)/2);
				}
			} else if (acao1.equals("D") && acao2.equals("A")) {
				if (ataqueken>defesaryu) {
					vidaryu = vidaryu - ((ataqueken-defesaryu)/2);
				}
			}
		}
		
		
		if (vidaryu>vidaken) {
			System.out.print("Ryu ganhou a batalha.");
		} else if (vidaken>vidaryu) {
			System.out.print("Ken ganhou a batalha.");
		} else if (vidaken == vidaryu) {
			System.out.print("Houve empate.");
		}
  }
}