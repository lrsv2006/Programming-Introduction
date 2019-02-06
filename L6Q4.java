import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
			
			Lista listalocais = new Lista();
			
			
			while (in.hasNext()) {
				String lugar = in.nextLine();
				int distancia = Integer.parseInt(in.nextLine());
				listalocais.inserir(lugar, distancia);
				
				
				
			
			}
			
			System.out.println(listalocais.toString());
			
		}
	}
		
	class Lista {
		private String lugar;
		private int distancia;
		private Lista proximo;
		
		public Lista() {
			this.lugar = null;
			this.distancia = -1;
			this.proximo = null;
		}
		
		
		public void inserir (String lugar, int distancia) {
			String aux;
			int aux2;
			if (this.lugar == null) {
				this.lugar = lugar;
				this.distancia = distancia;
				this.proximo = new Lista();
		
			}
			
			else if ((this.distancia) > distancia) {
				aux = this.lugar;
				aux2 = this.distancia;
				this.lugar = lugar;
				this.distancia = distancia;
				this.proximo.inserir(aux, aux2);
			} else {
				this.proximo.inserir(lugar, distancia);
			}
				
	}	
			
		public String toString() {
			String resposta = "";
			if (this.lugar != null) {
			resposta = this.lugar;
			if (this.proximo != null) {
				resposta = resposta + "\n" + this.proximo.toString();
				} 
			}
			return resposta;
		}	
	
}