import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static long fatorial(long n) {
		long resposta;
		if (n == 0) {
			return 1;
		} else {
			resposta = n*fatorial(n-1);
		}
		return resposta;
	}
	public static void main(String[] args) {
		long somavoltas = 0;
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			long voltas = in.nextLong();
			somavoltas += voltas;
			if (fatorial(voltas) < 50) {
				System.out.println(fatorial(voltas)*2);
			} else { 
				System.out.println(fatorial(voltas));
			}
		}
		if (somavoltas>100) {
			System.out.print("WildCats, get the head in the game!");
		}
    
  }
}