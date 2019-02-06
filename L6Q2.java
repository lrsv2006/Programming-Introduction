import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Listacomida listacomida = new Listacomida();
		String comida = "a1280912";
		String comidaretirar = " ";
		boolean theend = false;
		String carrinhovazio = "U gotta null pointer ma man";
		
		
		
		while ((!comida.equals("The End")) && in.hasNext()) {
			comida = in.nextLine();
			if (comida.equals("The End")) {
				theend = true;
			}
			listacomida.inserir(comida, theend);
		}
	

		
		while (in.hasNextLine()) {
			comidaretirar = in.nextLine();
			listacomida.remover(comidaretirar);

		}
		
			
		listacomida.restaalgo();
		if (listacomida.restaalgo() == false) {
			System.out.println("U gotta null pointer ma man");
		}
		System.out.println(listacomida.toString());
		
		
		
		
	}

}

class Listacomida {
	private String comida = null;
	private Listacomida proximo = null;
	private String comidaretirar = null;
	
	public Listacomida() {
		this.comida = null;
		this.proximo = null;
		this.comidaretirar = null;
	}
	
	public void inserir (String comida, boolean theend) {
		if (theend == false) {
		if (this.comida == null && !comida.equals("The End")) {
			this.comida = comida;
			this.proximo = new Listacomida();
		}
		
		else {
			this.proximo.inserir(comida, theend);
		}
	} else {
		
	}
} 
	
	public void remover(String comidaretirar) {
		if (this.comida != null) {
			if (this.comida.equals(comidaretirar)) {
				this.comida = this.proximo.comida;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(comidaretirar);
				}
		} else {
			
		}
	}
	
	public boolean thend(boolean theend, String comida) {
		if (comida.equals("The End")) {
			theend = true;
		}
		return theend;
	}
	
	
	
	public boolean restaalgo() {
		if (this.comida == null) {
			return false;
		} else {
			return true;
		}
	}
	public String toString() {
		String resposta = "";
		if (this.comida != null) {
		resposta = this.comida;
		if (this.proximo != null) {
			resposta = resposta + "\n" + this.proximo.toString();
		} 
		}
		return resposta;
	}
}
