import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		String [] competidores = new String[8];
		for (int i = 0; i <competidores.length; i++) {
			String nomecompetidor = in.nextLine();
			competidores[i]	 = nomecompetidor;
			
		}
		
		
		//quartas de final 1
		String competidor1luta1 = "aa";
		String competidor2luta1 = "aa";
		int comp1luta1 = in.nextInt();
		int comp2luta1 = in.nextInt();	
		competidor1luta1 = competidores[comp1luta1];
		competidor2luta1 = competidores[comp2luta1];
		
		//quartas de final 2
		String competidor1luta2 = "aa";
		String competidor2luta2 = "aa";
		int comp1luta2 = in.nextInt();
		int comp2luta2 = in.nextInt();
		competidor1luta2 = competidores[comp1luta2];
		competidor2luta2 = competidores[comp2luta2];
		
		
		//quartas de final 3
		String competidor1luta3 = "aa";
		String competidor2luta3 = "aa";
		int comp1luta3 = in.nextInt();
		int comp2luta3 = in.nextInt();
		competidor1luta3 = competidores[comp1luta3];
		competidor2luta3 = competidores[comp2luta3];
		
		//quartas de final 4
		String competidor1luta4 = "aa";
		String competidor2luta4 = "aa";
		int comp1luta4 = in.nextInt();
		int comp2luta4 = in.nextInt();
		competidor1luta4 = competidores[comp1luta4];
		competidor2luta4 = competidores[comp2luta4];
		
		//vencedores quartas de final
		String vencedorq1 = in.next();
		if (vencedorq1.equals("A"))  {
			vencedorq1 = competidor1luta1;
			}
			else vencedorq1 = competidor2luta1;
		
		String vencedorq2 = in.next();
		if (vencedorq2.equals("A")) {
			vencedorq2 = competidor1luta2;
			} else vencedorq2 = competidor2luta2;
		
		String vencedorq3 = in.next();
		if (vencedorq3.equals("A")) {
			vencedorq3 = competidor1luta3;
			} else vencedorq3 = competidor2luta3;
		
		String vencedorq4 = in.next();
		if (vencedorq4.equals("A")) {
			vencedorq4 = competidor1luta4;
			} else vencedorq4 = competidor2luta4;
		
		//vencedores semifinal
		String vencedors1 = in.next();
		if (vencedors1.equals("X")) {
			vencedors1 = vencedorq1; 
			} else vencedors1 = vencedorq2;
			
		String vencedors2 = in.next();
		if (vencedors2.equals("X")) {
			vencedors2 = vencedorq3; 
			} else vencedors2 = vencedorq4;
		
		String vencedorf = in.next();
		if (vencedorf.equals("#")) {
			vencedorf = vencedors1;
			} else vencedorf = vencedors2;
					
		//Sa�das
		
		System.out.println("Bem vindos ao Exame Chunnin!");
		System.out.println("Quartas de final 1: " + competidor1luta1 + " x " + competidor2luta1);
		System.out.println("Quartas de final 2: " + competidor1luta2 + " x " + competidor2luta2);
		System.out.println("Quartas de final 3: " + competidor1luta3 + " x " + competidor2luta3);
		System.out.println("Quartas de final 4: " + competidor1luta4 + " x " + competidor2luta4);
		System.out.println("Semifinal 1: " + vencedorq1 + " x " + vencedorq2);
		System.out.println("Semifinal 2: " + vencedorq3 + " x " + vencedorq4);
		System.out.println("Final: " + vencedors1 + " x " + vencedors2);
		System.out.println("O grande vencedor e " + vencedorf + "!");
  }
}