import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in); 
		
		 int l = in.nextInt();
		 int pessoas = 0;
		 int anitta = 0;
		 int jojo = 0;
		 int kevinho = 0;
		 int livinho = 0;
		 int ludmilla = 0;
		 int outro = 0;
		 while (pessoas < l) {
			String gosto = in.next();
			
			if (gosto.equals("Anitta")) {
				anitta++;
			} else if (gosto.equals("Jojo")) {
				jojo++;
			} else if (gosto.equals("Kevinho")) {
				kevinho++;
			} else if (gosto.equals("Livinho")) {
				livinho++;
			} else if (gosto.equals("Ludmilla")) {
				ludmilla++;
			} else {
				outro++;
			}
			pessoas++;
		}
		if ((anitta > ludmilla) && (anitta > jojo) && (anitta > kevinho) && (anitta > livinho) && (anitta > outro)) {
		System.out.print("As pessoas estao esperando por Anitta.");
		} else if ((jojo > ludmilla) && (jojo > anitta) && (jojo > kevinho) && (jojo > livinho) && (jojo > outro)) {
			System.out.print("As pessoas estao esperando por Jojo.");
		} else if ((kevinho > ludmilla) && (kevinho > jojo) && (kevinho > anitta) && (kevinho > livinho) && (kevinho > outro)) {
			System.out.print("As pessoas estao esperando por Kevinho.");
		} else if ((livinho > ludmilla) && (livinho > jojo) && (livinho > kevinho) && (livinho > anitta) && (livinho > outro)) {
			System.out.print("As pessoas estao esperando por Livinho.");
		} else if ((ludmilla > anitta) && (ludmilla > jojo) && (ludmilla > kevinho) && (ludmilla > livinho) && (ludmilla > outro)) {
			System.out.print("As pessoas estao esperando por Ludmilla.");
		} else if ((outro > ludmilla) && (anitta < outro) && (outro > kevinho) && (outro > livinho) && (jojo < outro)) {
			System.out.print("As pessoas querem ver outra pessoa");
		
		} else if ((anitta == ludmilla) && anitta!=0) {
			System.out.print("Houve um empate entre: Anitta, Ludmilla");
		} else if ((anitta == jojo) && anitta!=0) {
			System.out.print("Houve um empate entre: Anitta, Jojo");
		} else if ((anitta == kevinho) && anitta!=0) {
			System.out.print("Houve um empate entre: Anitta, Kevinho");
		} else if ((anitta == livinho) && anitta!=0) {
			System.out.print("Houve um empate entre: Anitta, Livinho");
		} else if ((jojo == livinho) && jojo!=0) {
			System.out.print("Houve um empate entre: Jojo, Livinho");
		} else if ((jojo == kevinho) && jojo!=0) {
			System.out.print("Houve um empate entre: Jojo, Kevinho");
		} else if ((kevinho == livinho) && kevinho!=0) {
			System.out.print("Houve um empate entre: Kevinho, Livinho");
		} else if ((ludmilla == jojo) && ludmilla!=0) {
			System.out.print("Houve um empate entre: Jojo, Ludmilla");
		} else if ((ludmilla == kevinho) && ludmilla!=0) {
			System.out.print("Houve um empate entre: Kevinho, Ludmilla");
		} else if ((ludmilla == livinho) && ludmilla!=0) {
			System.out.print("Houve um empate entre: Livinho, Ludmilla");
		} else if ((ludmilla == outro) && ludmilla!=0) {
			System.out.print("As pessoas estao esperando por Ludmilla.");
		} else if ((kevinho == outro) && kevinho!=0) {
			System.out.print("As pessoas estao esperando por Kevinho.");
		} else if ((anitta == outro) && anitta !=0) {
			System.out.print("As pessoas estao esperando por Anitta.");
		} else if ((jojo == outro) && jojo!=0) {
			System.out.print("As pessoas estao esperando por Jojo.");
		} else if ((livinho == outro) && livinho!=0) {
			System.out.print("As pessoas estao esperando por Livinho.");
		}
  }
}