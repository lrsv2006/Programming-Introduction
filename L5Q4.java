import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static String posicao (int m, int n, int qtdcorredores, int qtdarmarios, int valoresarmarios [][]) {
		
		
		
		for (n = 0; n < qtdarmarios; n++) {
			for (m = 0; m < qtdcorredores; m++) {
				if (valoresarmarios[m][n] == 0) {
					int mm = m+1;
					int nn = n+1;
					String a = "O armario a ser invadido fica no corredor " + mm + ", e e o armario de numero " + nn + ".";
					String b = "Voce foi descoberto! Corra dancando Bop To the Top!!";	
					String c = "Sharpay endoidou!";
					return a;
					
				} else if (valoresarmarios[m][n] < 0) {
					int mm = m+1;
					int nn = n+1;
					String a = "O armario a ser invadido fica no corredor " + mm + ", e e o armario de numero " + nn + ".";
					String b = "Voce foi descoberto! Corra dancando Bop To the Top!!";	
					String c = "Sharpay endoidou!";
					return b;
				
				} else {
					
				}
			}
		}
		
		String c = "Sharpay endoidou!";
		return c;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qtdcorredores = in.nextInt();
		int qtdarmarios = in.nextInt();
		
		if (qtdarmarios == 0 || qtdcorredores == 0) {
			System.out.print("Sharpay endoidou!");
		} else {
		
		int valoresarmarios [][] = new int [qtdcorredores][qtdarmarios];
		
		for (int i = 0; i < qtdcorredores; i++) {
			for (int j = 0; j < qtdarmarios; j++) {
				int valorarmario = in.nextInt();
				valoresarmarios[i][j] = valorarmario;
					
				}
				
			}
		System.out.println(posicao(0, 0, qtdcorredores, qtdarmarios, valoresarmarios));
			
		
 
		}
	}
}