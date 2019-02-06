import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
		
		int X = in.nextInt();
		int Y = in.nextInt();
		int Z = in.nextInt();
		
		if (X > Y && Y > Z || X == Y && Y == Z || X > Y && Y == Z || X == Y && X > Z) {
			System.out.print(X+ " ");
			System.out.print(Y+ " ");
			System.out.print(Z);
		} 
		
		else if (X > Z && Z > Y || X > Z && Z == Y || X == Z && X > Y) {
			System.out.print(X+ " ");
			System.out.print(Z+ " ");
			System.out.print(Y);
		}
		
		else if (Z > X && X > Y || Z > X && X == Y) {
			
			System.out.print(Z+ " ");
			System.out.print(X+ " ");
			System.out.print(Y);
		}
		
		else if (Z > Y && Y > X || Z > Y && Y == X || Z == Y && Z > X) {
			System.out.print(Z+ " ");
			System.out.print(Y+ " ");
			System.out.print(X);
			}
		
		else if (Y > X && X > Z) {
			System.out.print(Y+ " ");
			System.out.print(X+ " ");
			System.out.print(Z);
		}
		
		else if (Y > Z && Z >= X ) {
			System.out.print(Y+ " ");
			System.out.print(Z+ " ");
			System.out.print(X);
		}
    
  }
}