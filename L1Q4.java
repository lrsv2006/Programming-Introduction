import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner (System.in);
		
		String p = in.nextLine();
		String l = in.nextLine();
		String s = in.nextLine();
		
		char l1p = p.charAt(0);
		int tamp = p.length();
		char ultimap = p.charAt(tamp - 1);
		
		char l1l = l.charAt(0);
		int taml = l.length();
		char ultimal =l.charAt(taml - 1);
		
		char l1s = s.charAt(0);
		int tams = s.length();
		char ultimas = s.charAt(tams - 1);
		
		if (l1p == 'f' && ultimap == 'r'|| l1p == 'F' && ultimap == 'R' || l1p == 'F' && ultimap == 'r' || l1p == 'f' && ultimap == 'R') {
			String C = "Direita";
			System.out.println(C);
			
		} else if (l1l == 'f' && ultimal == 'r'|| l1l == 'F' && ultimal == 'R' || l1l == 'F' && ultimal == 'r' || l1l == 'f' && ultimal == 'R') {
			String C = "Meio";
			System.out.println(C);
		
		} else if (l1s == 'f' && ultimas == 'r'|| l1s == 'F' && ultimas == 'R' || l1s == 'F' && ultimas == 'r' || l1s == 'f' && ultimas == 'R') {
			String C = "Esquerda";
			System.out.println(C);
		
		} else {
			String C = "Vou em frente";
			System.out.println(C); 
			}
		
  }
}