import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		int C = in.nextInt();
		int L = in.nextInt();
		in.nextLine();
		String T = in.nextLine();
		int X = in.nextInt();
		int Y = in.nextInt();
		
		if (T.equals("Saque")) {
			if ((X >= (C/4)) && (X < C/2) && (Y <= L)) { 
				System.out.println("A bola foi rebatida");
			} else System.out.println("A bola foi para fora");
		} else if (T.equals("Bola Normal")) {
			if (((X >= 0) && (X < C/2)) && ((Y >= 0) && (Y <= L))) {
				System.out.println("A bola foi rebatida");
			} else System.out.println("A bola foi para fora");
				
			}
  }
}