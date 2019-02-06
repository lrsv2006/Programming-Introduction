import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		double cache = in.nextDouble();
		int receita = 0;
		while (in.hasNext()) {
				String pessoa = in.next();
				in.nextLine();
				if (pessoa.equals("CC")) {
					receita = receita+5;
				} else if (pessoa.equals("EC")) {
					receita = receita+10;
				} else {
				    receita = receita+15;
				}
		}
		
		if (receita>=cache) {
			System.out.print("Cebruthius!");
		} else {
			System.out.print("Escamou!");
		}
  }
}