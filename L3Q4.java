import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		//MONITORES, EU SO QUERIA DIZER Q PASSEI MUITA RAIVA COM ESSA QUESTAO, SAO 01:16 E EU TENHO AULA DE CALCULO AS 8H, BOA NOITE.
		
		int qtdninjas = Integer.parseInt(in.nextLine());
		int tamanhoninjas = 0;
		
		
		
		//armazenar tudo
		
		String [] tudo = new String[qtdninjas];
		for (int i = 0; i < tudo.length; i++) {
			String nomecaracteristica = in.nextLine();
			tudo[i] = nomecaracteristica;
		}
		
		String [] nomes = new String[qtdninjas];
		String [] caracteristicas = new String [qtdninjas];
		String dividir[] = new String[qtdninjas];
		
		for (int x = 0; x<qtdninjas; x++) {
		dividir = tudo[x].split(" ");
		nomes[x] = dividir[0];
		if (dividir.length>1) {
			caracteristicas[x] = dividir[1];
			} else {
				caracteristicas[x] = " ";
				tamanhoninjas++;
			}
		}
		
		if (tamanhoninjas == qtdninjas) {
			System.out.print("Nao havera Jounins forte esse ano");
		} else {
		
		//distribuir nomes em cada string 
		String [] ninjassapos = new String [qtdninjas];
		String [] ninjascobras = new String [qtdninjas];
		String [] ninjaslesmas = new String [qtdninjas];
		String [] ninjasmacacos = new String [qtdninjas];
		String [] ninjascaes = new String [qtdninjas];
		
		for (int n = 0; n < ninjassapos.length; n++) {
			if (caracteristicas[n].equals("Coragem") || caracteristicas[n].equals("Determinacao") || (caracteristicas[n].equals("Conviccao"))) {
				ninjassapos[n] = nomes[n];
				
			} else if (caracteristicas[n].equals("Ambicao") || caracteristicas[n].equals("Astucia") || (caracteristicas[n].equals("Expertise"))) {
				ninjascobras[n] = nomes[n];
				
			} else if (caracteristicas[n].equals("Analise") || caracteristicas[n].equals("Suporte") || (caracteristicas[n].equals("Tecnica"))) {
				ninjaslesmas[n] = nomes[n];
	
			} else if (caracteristicas[n].equals("Agilidade") || caracteristicas[n].equals("Inteligencia") || (caracteristicas[n].equals("Destreza"))) {
				ninjasmacacos[n] = nomes[n];
			
			} else if (caracteristicas[n].equals("Experiencia") || caracteristicas[n].equals("Perspicacia") || (caracteristicas[n].equals("Pericia"))) {
				ninjascaes[n] = nomes[n];
			} else
				continue;
		}
		
		if (qtdninjas == 0) {
			System.out.print("Nao havera Jounins forte esse ano");
			
		}	else {
			System.out.println("Sapos:");
			for (int o = 0; o < ninjassapos.length; o++) {
				if (ninjassapos[o] != null) {
				System.out.println("- " + ninjassapos[o]);
				}
			}
		
			System.out.println("Cobras:");
			for (int o = 0; o < ninjascobras.length; o++) {
				if (ninjascobras[o] != null) {
				System.out.println("- " + ninjascobras[o]);
				}
			}
			
			System.out.println("Lesmas:");
			for (int o = 0; o < ninjaslesmas.length; o++) {
				if (ninjaslesmas[o] != null) {		
				System.out.println("- " + ninjaslesmas[o]);
				}
			}
			System.out.println("Macacos:");
			for (int o = 0; o < ninjasmacacos.length; o++) {
				if (ninjasmacacos[o] != null) {
				System.out.println("- " + ninjasmacacos[o]);
				}
			}
			
			System.out.println("Caes:");
			for (int o = 0; o < ninjascaes.length; o++) {
				if (ninjascaes[o] != null) {
				System.out.println("- " + ninjascaes[o]);
					}
				}
			}
		}
  }
}