import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
      Scanner in = new Scanner (System.in);
		
		int I =  in.nextInt();
		double A = in.nextDouble();
		int D = in.nextInt();
		int P = in.nextInt();
		String S = in.next();
		double H = 0;
		
		if (S.equals("Sim")) {
			H = Math.pow(I+5,3)/(((Math.sqrt(A)+D)/2.0 + (P+50)/3.0)); 
					if (H >= 100) {
						System.out.println("Voce consegue"); 
					} else {
						System.out.println("Isso e perda de tempo");
					}
		} else { 
			H = Math.pow(I,3)/((Math.sqrt(A)+D)/2.0 + P/3.0);
			if (H >= 100) {
				
				System.out.println("Voce consegue"); 
			} else {
				System.out.println("Isso e perda de tempo");
		}

			
		}
	}
}
