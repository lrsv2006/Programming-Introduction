import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		String invertidaounao = in.nextLine();
		int qtdninjas = in.nextInt();
		
		//armazenar tudo
		String [] nomeschakrasejutsus = new String[qtdninjas*3];
		for (int i = 0; i < nomeschakrasejutsus.length; i++) {
			String nomeninja = in.next();
			nomeschakrasejutsus[i] = nomeninja;
			
			}
		
		//armazenar apenas nomes
		String [] nomes = new String[qtdninjas];
		int c = 0;
		for (int d = 0; d < nomes.length; d++) {
			nomes[d] = nomeschakrasejutsus[c];
			c = c+3;
		}
		
	
		
		//armazenar apenas chakras
		int[] chakrasporninja = new int[qtdninjas];
		int a = 1; //apenas pra pegar os valores chakrasejutsusporninja q sao chakras
		for (int b = 0; b < chakrasporninja.length; b++) {
			chakrasporninja[b] = Integer.parseInt(nomeschakrasejutsus[a]);
			a = a+3;
		}
		
		
		
		
		//armazenar apenas jutsus
		int [] jutsusporninja = new int [qtdninjas];
		int e = 2; //apenas pra pegar os valores chakrasejutsusporninja q sao jutsus
		for (int f = 0; f < jutsusporninja.length; f++) {
			jutsusporninja[f] = Integer.parseInt(nomeschakrasejutsus[e]);
			e = e+3;
		}
		
	
			
		
		//corrige caso naruto tenha invertido a coluna dos jutsus
		
		int qtdninjass = qtdninjas;
		
		int [] jutsusporninjacerto = new int [qtdninjass];
		if (invertidaounao.equals("Esse naruto...")) {
			for (int m = 0; m < jutsusporninja.length; m++) {
				jutsusporninjacerto[m] = jutsusporninja[qtdninjass-1];
				qtdninjass--;
			}
		} else {
			for (int z = 0; z < nomes.length; z++)
			jutsusporninjacerto[z] = jutsusporninja[z];
			
		}
		
		int [] potencialporninja = new int [qtdninjas];
		int v = 0;
		int totalmaiorq0 = 0;
		int total0 = 0;
		for (int w = 0; w<jutsusporninja.length; w++) {
		potencialporninja[w] = chakrasporninja[v] - jutsusporninjacerto[v];
		if (potencialporninja[w] > 0) {
			totalmaiorq0++;
		} 
		v++;
		}
		
		
		  for (int s = 0; s < potencialporninja.length; s++){
	            for (int j = 0; j < (potencialporninja.length)-1; j++){
	                if (potencialporninja[j] <= potencialporninja[j+1]){
	                    int temp = potencialporninja[j];
	                    potencialporninja[j] = potencialporninja[j+1];
	                    potencialporninja[j+1] = temp;
	                    String tempp = nomes[j];
	                    nomes[j] = nomes[j+1];
	                    nomes[j+1] = tempp;
	                          
	                    
	                }
	            }
	            
		  }
		  
		  for (int r = 0; r < nomes.length; r++) {
			  if (potencialporninja[r] > 0) {
				  System.out.print(nomes[r] + " esta classificado(a)\n");
		
			  } else System.out.print(nomes[r] + " esta desclassificado(a)\n");
			  
		  }
		  
		  if (totalmaiorq0>0) {
		  System.out.print("\nKakashi tera um total de "+totalmaiorq0 +" aluno(s) nesse semestre");
		  } else if (totalmaiorq0 ==0) {
			  
			  System.out.print("\nEsse semestre ninguem veio treinar na aldeia da folha");
		  }
  }
}