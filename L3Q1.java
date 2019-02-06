import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		int dinheiro = in.nextInt();
		int dias = in.nextInt();
		int pre�otigela = 0;
		int pre�ototaltigelas = 0;
		int tigelastotal = 0;
		
		
		int [] dia = new int[dias];
		for (int i = 0; i < dia.length; i++) {
			int tigelas = in.nextInt();
			tigelastotal = tigelastotal + tigelas;
			dia[i]= i+1;
			
			if (tigelas == 1) {
				pre�otigela = 10;
				pre�ototaltigelas += 10;
			} else if (tigelas <=10 && tigelas >= 2) {
				pre�otigela = 9;
				pre�ototaltigelas += 9*tigelas;
				
			} else if (tigelas > 10) {
				pre�otigela = 8;
				pre�ototaltigelas += 8*tigelas;
			} else if (tigelas==0) {
				pre�otigela = 0;
				pre�ototaltigelas += 0;
			}
		} if ((dinheiro >= pre�ototaltigelas) && pre�ototaltigelas != 0) {
			System.out.print("Naruto conseguiu pagar a sua conta!");
		} else if ((dinheiro<=pre�ototaltigelas) && pre�ototaltigelas != 0) {
			System.out.print("Naruto, faltam "+ (pre�ototaltigelas-dinheiro) + " ryos!" );
		} else if (pre�ototaltigelas == 0) {
			System.out.print("Naruto nao apareceu para comer");
		}
  }
}