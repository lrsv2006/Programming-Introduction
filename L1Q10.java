import java.util.Scanner;
public class HuxleyCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// curvas               // distancias
		String c1m = in.next(); int d1m = in.nextInt();
		String c2m = in.next(); int d2m = in.nextInt();
		String c3m = in.next(); int d3m = in.nextInt();
		String c4m = in.next(); int d4m = in.nextInt();
		in.nextLine();
		String c1y = in.next(); int d1y = in.nextInt();
		String c2y = in.next(); int d2y = in.nextInt();
		String c3y = in.next(); int d3y = in.nextInt();
		String c4y = in.next(); int d4y = in.nextInt();
		in.nextLine();
		String c1t = in.next(); int d1t = in.nextInt();
		String c2t = in.next(); int d2t = in.nextInt();
		String c3t = in.next(); int d3t = in.nextInt();
		String c4t = in.next(); int d4t = in.nextInt();
		
		int dM = d1m+d2m+d3m+d4m;
		int dY = d1y+d2y+d3y+d4y;
		int dT = d1t+d2t+d3t+d4t;
		
		boolean mariocaiu = true;
		boolean yoshicaiu = true;
		boolean toadcaiu = true;
		
		if ((((c1m.equals("Esquerda")) && (c2m.equals("Esquerda"))) && (c3m.equals("Esquerda"))) || 
				(((c2m.equals("Esquerda")) && (c3m.equals("Esquerda"))) && (c4m.equals("Esquerda")))) {
			mariocaiu = true;
			System.out.println("Mario caiu em um buraco negro.");
		} else mariocaiu = false;
		
		if ((((c1y.equals("Esquerda")) && (c2y.equals("Esquerda"))) && (c3y.equals("Esquerda"))) || 
				(((c2y.equals("Esquerda")) && (c3y.equals("Esquerda"))) && (c4y.equals("Esquerda")))) {
			yoshicaiu = true;
			System.out.println("Yoshi caiu em um buraco negro.");
		} else yoshicaiu = false;
		
		if ((((c1t.equals("Esquerda")) && (c2t.equals("Esquerda")) && (c3t.equals("Esquerda"))) || 
				(((c2t.equals("Esquerda")) && (c3t.equals("Esquerda"))) && c4t.equals("Esquerda")))) {
			toadcaiu =  true;
			System.out.println("Toad caiu em um buraco negro.");
		} else toadcaiu = false;
		
		
		if ((mariocaiu == false) && ((dM < dY) && (dM < dT)) || 
				((mariocaiu == false) && (dM < dT) && (yoshicaiu == true)) || 
				((mariocaiu == false) && (dM < dY) && (toadcaiu == true)) || 
				((mariocaiu == false) && (toadcaiu == true) && (yoshicaiu == true))) {
			System.out.println("Mario venceu a corrida!");
		}
		
		if ((yoshicaiu == false) && ((dY < dM) && (dY < dT)) || 
				((yoshicaiu == false) && (dY < dT) && (mariocaiu == true)) || 
				((yoshicaiu == false) && (dY < dM) && (toadcaiu == true)) || 
				((yoshicaiu == false) && (toadcaiu == true) && (mariocaiu == true))) {
			System.out.println("Yoshi venceu a corrida!");
	}
		if ((toadcaiu == false) && ((dT < dY) && (dT < dM)) || 
				((toadcaiu == false) && (dT < dM) && (yoshicaiu == true)) || 
				((toadcaiu == false) && (dT < dY) && (mariocaiu == true)) || 
				((toadcaiu == false) && (mariocaiu == true) && (yoshicaiu == true))) {
			System.out.println("Toad venceu a corrida!");
			
	}
		
	}
}