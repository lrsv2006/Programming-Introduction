import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		int qtdingressos = in.nextInt();
		
		for (int i = 1; i <= qtdingressos; i++) {
			int a = in.nextInt();
			
			if (i == a) {
				System.out.print("o ingresso de numero ");
				System.out.print( a);
				System.out.print(" foi sorteado");
			}
		}
  }
}