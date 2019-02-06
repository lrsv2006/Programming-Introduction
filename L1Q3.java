import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		int M = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		
		double CxBA = 80/A;
		double CxBB = 100/B;
		double CxBC = 120/C;
		double CxBD = 80/D;
		
		if (M < A && M < B && M < C && M < D) {
			String S = "Acho que vou a pe :(";
			System.out.println(S);
		} 
		
		if (CxBA >= CxBB && CxBA >= CxBC && CxBA >= CxBD && M >= A) {
			String S = "Verde";
			System.out.println(S);
			
		} 
		
		else if (CxBB > CxBA && CxBB >= CxBC && CxBB >= CxBD && M >= B) {
			String S = "Vermelho";
			System.out.println(S);
		}
		
		else if (CxBC > CxBA && CxBC > CxBB && CxBC >= CxBD && M >= C) {
			String S = "Roxo";
			System.out.println(S);
		}
		else if (CxBD > CxBA && CxBD > CxBB && CxBD > CxBC && M >= D) {
			String S = "Amarelo";
			System.out.println(S);
		}
  }
}