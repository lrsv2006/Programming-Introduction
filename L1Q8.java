import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		String Pessoa1 = in.nextLine();
		String Pessoa2 = in.nextLine();
		String Pessoa3 = in.nextLine();
		String Pessoa4 = in.nextLine();
		String Pessoa5 = in.nextLine();
		
		String Pos1 = "";
		String Pos2 = "";
		String Pos3 = "";
		String Pos4 = "";
		String Pos5 = "";
		
		if ((Pessoa2.equals("Mario")) || (Pessoa4.equals("Mario"))) {
			Pos2 = "Mario";
		} else Pos3 = "Mario";
		
		//Mario e Toad
		if (((Pessoa2.equals("Toad")) && (Pessoa4.equals("Mario"))) || ((Pessoa4.equals("Toad")) && (Pessoa2.equals("Mario")))) {
			Pos4 = "Toad";
		} else if (((Pessoa3.equals("Toad")) && (Pessoa5.equals("Mario"))) || ((Pessoa5.equals("Toad")) && (Pessoa3.equals("Mario")))) {
			Pos5 = "Toad";
		} //Fim de Mario e Toad
		
		//Toad e Luigi
		if (((Pessoa3.equals("Toad")) || (Pessoa5.equals("Toad"))) && ((Pessoa3.equals("Luigi")) || (Pessoa5.equals("Luigi")))) {
			Pos3 = "Toad";
			Pos5 = "Luigi";
		} else if (((Pessoa2.equals("Toad")) || (Pessoa4.equals("Toad"))) && ((Pessoa2.equals("Luigi")) || (Pessoa4.equals("Luigi")))) {
				Pos2 = "Toad";
				Pos4 = "Luigi";
			//Fim de Toad e Luigi
			
			//Toad e Yoshi
		} if (((Pessoa2.equals("Toad")) || (Pessoa4.equals("Toad"))) && ((Pessoa4.equals("Yoshi")) || (Pessoa2.equals("Yoshi")))) {
			Pos2 = "Toad";
			Pos4 = "Yoshi";
		} else if (((Pessoa3.equals("Toad")) || (Pessoa5.equals("Toad"))) && ((Pessoa3.equals("Yoshi")) || (Pessoa5.equals("Yoshi")))) {
			Pos3 = "Toad";
			Pos5 = "Yoshi";
		}
			//Fim de Toad e Yoshi
		
		
		//Luigi e Yoshi
		if (((Pessoa2.equals("Luigi")) || (Pessoa4.equals("Luigi"))) && ((Pessoa4.equals("Yoshi")) || (Pessoa2.equals("Yoshi")))) {
			Pos2 = "Luigi";
			Pos4 = "Yoshi";
		} else if (((Pessoa3.equals("Luigi")) || (Pessoa5.equals("Luigi"))) && ((Pessoa5.equals("Yoshi")) || (Pessoa3.equals("Yoshi")))) {
			Pos3 = "Luigi";
			Pos5 = "Yoshi";
		} //Fim de Luigi e Yoshi
		
		//Mario e Yoshi
		if (((Pessoa2.equals("Mario")) ||(Pessoa4.equals("Mario"))) && ((Pessoa4.equals("Yoshi")) || (Pessoa2.equals("Yoshi")))) {
			Pos4 = "Yoshi";
		} else if (((Pessoa3.equals("Mario")) ||(Pessoa5.equals("Mario"))) && ((Pessoa3.equals("Yoshi")) || (Pessoa5.equals("Yoshi")))) {
			Pos5 = "Yoshi";
		} //Fim de Mario e Yoshi
		
		//Mario e Luigi
		if (((Pessoa2.equals("Mario")) ||(Pessoa4.equals("Mario"))) && ((Pessoa4.equals("Luigi")) || (Pessoa2.equals("Luigi")))) {
			Pos4 = "Luigi";
		} else if (((Pessoa3.equals("Mario")) ||(Pessoa5.equals("Mario"))) && ((Pessoa3.equals("Luigi")) || (Pessoa5.equals("Luigi")))) {
			Pos5 = "Luigi";
		}
		
		Pos1 = "Princesa";
		System.out.println(Pos1);
		System.out.println(Pos2);
		System.out.println(Pos3);
		System.out.println(Pos4);
		System.out.println(Pos5);
  }
}