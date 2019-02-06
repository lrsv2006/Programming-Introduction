import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		int tamanhomatriz = in.nextInt();
		int numerojogadas = in.nextInt();
		boolean perdeu = false;
		int [][] matrizcampo = new int [tamanhomatriz][tamanhomatriz];
		
		for (int i = 0; i<matrizcampo.length; i++) {
			for (int j = 0; j < matrizcampo.length; j++) {
				int matriz = in.nextInt();
				matrizcampo [i] [j] = matriz;
			}
		}
		for (int i = 0; i<numerojogadas; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			int somadireita = 0;
			int somadiagonal = 0;
			int somabaixo = 0;
			if (matrizcampo[x][y] == -1) { 
				System.out.println("Essa casa ja foi selecionada.");
			} else {
			
			for (int j = y, a = x, b = y; j<matrizcampo.length; j++) {
				if (matrizcampo[a][b] != -1) {
					somadireita += matrizcampo[a][b];
			}
			b++;
			} 
			for  (int k = x, a = x, b = y; k<matrizcampo.length; k++) {
				if (matrizcampo[a][b] != -1) {
					somabaixo += matrizcampo[a][b];
				}
				a++;
		}
			for (int l = x, m = y, a = x, b = y ; l<matrizcampo.length & m <matrizcampo.length; l++, m++) {
				if (matrizcampo[a][b] != -1) {
					somadiagonal += matrizcampo[a][b];
				}
				a++;
				b++;
				
			}
			
			if (somadireita == somabaixo && somabaixo == somadiagonal) {
				System.out.println("Bomba encontrada.");
				System.out.print("Voce perdeu.");
				perdeu = true;
				break;
			} else {
				System.out.println("Boa jogada, a casa " + "(" + x + "," + y + ")" + " nao tinha bomba.");
				matrizcampo[x][y] = -1;
				}
			}
		
		
		
		}
		if (perdeu == false)  {
		System.out.print("Voce e uma pessoa de sorte.");
		}
  }
}