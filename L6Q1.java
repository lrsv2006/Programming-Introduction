import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Lista listamontanharussa = new Lista();
		int numeroatual = 0;
		int posicao = 1;
		while (numeroatual != -1) {
			numeroatual = in.nextInt();
		 listamontanharussa.inserir(numeroatual, posicao);
		 
		 posicao++;
		        }
		int numerosorteado = in.nextInt();
		int carrinho = listamontanharussa.verificarnumero(numerosorteado);
		if (carrinho == 222) {
			System.out.println("Nenhum carrinho foi sorteado");
		}
		else {
			System.out.println("O bilhete sorteado e o "+ numerosorteado + " e esta no carrinho "+ carrinho);  
		}


		
		}
	}


	class Lista {
		
	    private int numeroatual;
	    private int posicao;
	    private Lista proximo;
	    
	    public Lista() {
	    	
	        this.numeroatual = -1;
	        this.posicao = 0;
	        this.proximo = null;
	    }
	    
	    public void inserir (int numeroatual, int posicao) {
	    	
	        if (this.numeroatual == -1) {
	            this.numeroatual = numeroatual;
	            this.posicao = posicao;
	            this.proximo = new Lista();
	        }
	        
	        else {
	        	
	            this.proximo.inserir(numeroatual, posicao);
	        }
	    }

	    public int verificarnumero(int numerosorteado) {
	        if (numerosorteado == this.numeroatual) {
	            return posicao;
	            
	        }
	        else if (this.proximo !=null) {
	            return  this.proximo.verificarnumero(numerosorteado);
	        }
	        
	        else {
	        	return 222;
	        	
	        
	        }
	    }

	}