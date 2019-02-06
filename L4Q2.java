import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		String [] [] jogadores = new String[3] [3];
		for (int i = 0; i<jogadores.length; i++) {
			for (int j = 0; j < jogadores.length; j++) {
				String jogador = in.next();
				jogadores [i] [j] = jogador;
			}
		}
			
			String [] [] jogadoresorganizados = { {jogadores[0][0], jogadores[1][0], jogadores[2][0]}, 
												  {jogadores[0][1], jogadores[1][1], jogadores[2][1]}, 
												  {jogadores[0][2], jogadores[1][2], jogadores[2][2]} };
			
			System.out.print(jogadoresorganizados[0][0] + " ");
			System.out.print(jogadoresorganizados[0][1] + " ");
			System.out.println(jogadoresorganizados[0][2]);
			System.out.print(jogadoresorganizados[1][0] + " ");
			System.out.print(jogadoresorganizados[1][1] + " ");
			System.out.println(jogadoresorganizados[1][2]);
			System.out.print(jogadoresorganizados[2][0] + " ");
			System.out.print(jogadoresorganizados[2][1] + " ");
			System.out.print(jogadoresorganizados[2][2]);
  }
}