import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    	// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int dia = in.nextInt();
		int mes = in.nextInt();
		int ano = in.nextInt();
		int diashow = in.nextInt();
		int messhow = in.nextInt();
		int anoshow = in.nextInt();
		
		int diaspacabar = 0;
		int mesatual = mes;
		int anoatual = ano;
		int diasnaoconsiderardataatual = 0;
		int diasnaoconsiderardatadoshow = 0;
		int diasdomes = 0;
		int mesparametro = 0;
		
		// Calcular quantos dias faltam para terminar o ano apartir da data informada
		while (anoatual <= anoshow) {
			
			if (anoatual == anoshow)  {
				mesparametro = messhow;
			}
			else {
				mesparametro = 12;
			}
			
			while (mesatual <= mesparametro) {
				
				if ((mesatual == 1) || (mesatual == 3)|| (mesatual == 5)|| (mesatual == 7) ||(mesatual == 8)|| (mesatual == 10)||(mesatual == 12)) {
					diaspacabar = diaspacabar + 31;
				}
				else if ((mesatual == 4) || (mesatual == 6)|| (mesatual == 9)|| (mesatual == 11)) {
					diaspacabar = diaspacabar + 30;
				}
				else if ((mesatual == 2) && ( ( anoatual % 4 == 0 && anoatual % 100 != 0 ) || ( anoatual % 400 == 0 && anoatual % 100 == 0) )) {
					diaspacabar = diaspacabar + 29;
				}
				else {
					diaspacabar = diaspacabar + 28;
				}
				
				mesatual ++;
			}
			
			
			mesatual = 1;
			anoatual ++;
		}
						
		// verifica quantos dias tem o m�s
		mesatual = mes;
		if ((mesatual == 1) || (mesatual == 3)|| (mesatual == 5)|| (mesatual == 7) ||(mesatual == 8)|| (mesatual == 10)||(mesatual == 12)) {
			diasdomes = 31;
		}
		else if ((mesatual == 4) || (mesatual == 6)|| (mesatual == 9)|| (mesatual == 11)) {
			diasdomes = 30;
		}
		else if ((mesatual == 2) && ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 && ano % 100 == 0) )) {
			diasdomes = 29;
		}
		else {
			diasdomes = 28;
		}
				
		
		// dias que precisa retirar do total de dias calculado acima
		diasnaoconsiderardataatual = dia - 1;
		
		// calcula os dias que passaram do dia do show para retirar da rotina acima 
		mesatual = messhow;
		if ((mesatual == 1) || (mesatual == 3)|| (mesatual == 5)|| (mesatual == 7) ||(mesatual == 8)|| (mesatual == 10)||(mesatual == 12)) {
			diasdomes = 31;
		}
		else if ((mesatual == 4) || (mesatual == 6)|| (mesatual == 9)|| (mesatual == 11)) {
			diasdomes = 30;
		}
		else if ((mesatual == 2) && ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 && ano % 100 == 0) )) {
			diasdomes = 29;
		}
		else {
			diasdomes = 28;
		}
		
		diasnaoconsiderardatadoshow = diasdomes - diashow + 1;
		
		diaspacabar = diaspacabar - diasnaoconsiderardataatual- diasnaoconsiderardatadoshow;
		
		System.out.println(diaspacabar);
				
	
	
  }
}