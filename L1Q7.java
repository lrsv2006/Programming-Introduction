import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		String personagem = in.nextLine();
		String poder = in.nextLine();
		int vidaBowser = in.nextInt();
		int dano = 0;
		
		if ((personagem.equals("Mario")) && (poder.equals("FireFlower"))) {
			dano = 292;
		} else if ((personagem.equals("Mario")) && (poder.equals("IceFlower"))) {
			dano = 200;
		} else if ((personagem.equals("Mario")) && (poder.equals("BoomerangFlower"))) {
			dano = 128;
		} else if ((personagem.equals("Luigi")) && (poder.equals("FireFlower"))) {
			dano = 280;
		} else if ((personagem.equals("Luigi")) && (poder.equals("BoomerangFlower"))) {
			dano = 112;
		} else if ((personagem.equals("Luigi")) && (poder.equals("IceFlower"))) {
			dano = 180;		
		}
		
		if ((dano == 292 && dano >= vidaBowser) || (dano == 200 && dano >= vidaBowser) || (dano == 128 && dano >= vidaBowser)) {
			System.out.println("Mario conseguiu derrotar o Bowser e salvar a princesa Peach.");
		}
			else if ((dano == 280 && dano >= vidaBowser) || (dano == 112 && dano >= vidaBowser) || (dano == 180 && dano >= vidaBowser)) {
			System.out.println("Luigi conseguiu derrotar o Bowser e salvar a princesa Peach.");
		}	
			else System.out.println("O Bowser conseguiu escapar.");
  }
}