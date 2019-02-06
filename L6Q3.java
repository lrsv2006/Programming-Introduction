import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Lista listalivros = new Lista();
		int qtdestantes = in.nextInt();
		if (qtdestantes == 0) {
			System.out.println("Nao tem livros por aqui");
	} else {
		String livrodesejado = "Livro de Rimas";
		int estante = 1;
		
		while (estante <=qtdestantes) {
			int qtdlivros = in.nextInt();
			in.nextLine();
			for (int j = 0, posicao = 1; j < qtdlivros; j++, posicao++) {
				String nomelivro = in.nextLine();
				listalivros.inserir(nomelivro, posicao, estante);
			}
			estante++;
		}
		estante--;
		
		int achoulivro = listalivros.verificarlivro(livrodesejado);
		
		if (achoulivro == 0) {
			System.out.println("Og Loc, o livro nao esta aqui!");
		} else {
			System.out.println("Og Loc, o livro ta na estante " + estante +", na posicao " + achoulivro);
		    }

	    }
	    
  } 

}

class Lista {
	
    private String nomelivro;
    private int posicao;
    private int estante;
    private Lista proximo;
    
    public Lista() {
    	
        this.nomelivro = null;
        this.posicao = 0;
        this.estante = 0;
        this.proximo = null;
    }
    
    public void inserir (String nomelivro, int posicao, int estante) {
    	
        if (this.nomelivro == null) {
            this.nomelivro = nomelivro;
            this.posicao = posicao;
            
            this.proximo = new Lista();
        }
        
        else {
        	
            this.proximo.inserir(nomelivro, posicao, estante);
        }
    }
    public int verificarlivro(String livrodesejado) {
        if (livrodesejado.equals(this.nomelivro)) {
            return posicao;
            
            
        }
        else if (this.proximo != null) {
            return  this.proximo.verificarlivro(livrodesejado);
        }
        
        else {
        	return 0;
        	
        
        }
    }
}