import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static double fibonaccitroy(double n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else  {
			return fibonaccitroy(n-1) + fibonaccitroy(n-2);
		}
	}
	
	public static double fibonaccigabriella(double m) {
		if (m == 0) {
			return 0;
		} else if (m == 1) {
			return 1;
		} else  {
			return fibonaccigabriella(m-1) + fibonaccigabriella(m-2);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double nivelvergonhatroy = in.nextDouble();
		int numerobebidastroy = in.nextInt();
		double nivelvergonhagab = in.nextDouble();
		int numerobebidasgab = in.nextInt();
		
		
		
		if ((fibonaccitroy(numerobebidastroy) >= nivelvergonhatroy) || (nivelvergonhatroy == 0 && numerobebidastroy == 0)) {
			System.out.println("Esse pode ser o comeco de algo novo!! Troy vai cantar!!");
		} else {
			System.out.println("Nao foi dessa vez!! Troy nao teve coragem o suficiente.");
		}
		
		if ((fibonaccigabriella(numerobebidasgab) >= nivelvergonhagab) || (nivelvergonhagab == 0 && numerobebidasgab == 0)) {
			System.out.print("Esse pode ser o comeco de algo novo!! Gabriella vai cantar!!");
		} else {
			System.out.print("Nao foi dessa vez!! Gabriella nao teve coragem o suficiente.");
		}
    
  }
}