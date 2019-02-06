import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		
		int tamanhomapa = in.nextInt();
		int qtdmovimentos = in.nextInt();
		boolean perdeu = false;
		
		String mapa[][] = new String [tamanhomapa][tamanhomapa];
		
		for (int i = 0; i<mapa.length; i++) {
			for (int j = 0; j < mapa.length; j++) {
				String matriz = in.next();
				mapa [i] [j] = matriz;
			}
		}
		
		for (int i = 0; i<qtdmovimentos && !perdeu; i++) {
			String movimento = in.next();
			
			for (int j = 0; j<mapa.length; j++) { //achar a posicao da cobra
				for (int k = 0; k < mapa.length; k++) { //achar a posicao da cobra
					if (mapa [j] [k].equals("#")) { //achar a posicao da cobra
						
							if (movimento.equals("D")) {
								
									if (k == mapa.length-1) {
										if (!mapa[j][0].equals("@")) {
											mapa[j][0] = "#";
											mapa[j][k] = "*";
										} else {
											for (int c = 0; c<mapa.length; c++) {
												for (int d = 0; d < mapa.length; d++) {
													if (d<mapa.length-1) {
														System.out.print(mapa[c][d] + " ");
													} else if (d == mapa.length-1) {
														System.out.print(mapa[c][d] + "\n");
														
														}
													}
												}
											
											System.out.print("Game over.");
											perdeu = true;
											break;
										}
									} else if (k < mapa.length-1){
										if (!mapa[j][k+1].equals("@")) {
											mapa[j][k] = "*";
											mapa [j][k+1] = "#";
										} else {
											for (int c = 0; c<mapa.length; c++) {
												for (int d = 0; d < mapa.length; d++) {
													if (d<mapa.length-1) {
														System.out.print(mapa[c][d] + " ");
													} else if (d == mapa.length-1) {
														System.out.print(mapa[c][d] + "\n");
														
														}
													}
												}
											System.out.print("Game over.");
											perdeu = true;
											break;
										}
										
									}
									
									j = mapa.length;
									k = mapa.length;
									break;
						
							} else if (movimento.equals("E")) {
								
									if (k == 0) {
										if (!mapa[j][mapa.length-1].equals("@")) {
											mapa[j][mapa.length-1] = "#";
											mapa[j][k] = "*";
										} else {
											for (int c = 0; c<mapa.length; c++) {
												for (int d = 0; d < mapa.length; d++) {
													if (d<mapa.length-1) {
														System.out.print(mapa[c][d] + " ");
													} else if (d == mapa.length-1) {
														System.out.print(mapa[c][d] + "\n");
														
														}
													}
												}
											System.out.print("Game over.");
											perdeu = true;
											break;
										}
										
										
									} else if (k>0){
										if (!mapa[j][k-1].equals("@")) {
											mapa[j][k] = "*";
											mapa [j][k-1] = "#";
										} else {
											for (int c = 0; c<mapa.length; c++) {
												for (int d = 0; d < mapa.length; d++) {
													if (d<mapa.length-1) {
														System.out.print(mapa[c][d] + " ");
													} else if (d == mapa.length-1) {
														System.out.print(mapa[c][d] + "\n");
														
														}
													}
												}
											System.out.print("Game over.");
											perdeu = true;
											break;
										}
										
									}
									
									j = mapa.length;
									k = mapa.length;
									break;
						
						} else if(movimento.equals("B")) {
						
							if (j == mapa.length-1) {
								if (!mapa[0][k].equals("@")) {
									mapa[0][k] = "#";
									mapa[j][k] = "*";
								} else {
									for (int c = 0; c<mapa.length; c++) {
										for (int d = 0; d < mapa.length; d++) {
											if (d<mapa.length-1) {
												System.out.print(mapa[c][d] + " ");
											} else if (d == mapa.length-1) {
												System.out.print(mapa[c][d] + "\n");
												
												}
											}
										}
									System.out.print("Game over.");
									perdeu = true;
									break;
								}
							} else if (j < mapa.length-1){
								if (!mapa[j+1][k].equals("@")) {
									mapa[j][k] = "*";
									mapa [j+1][k] = "#";
								} else {
									for (int c = 0; c<mapa.length; c++) {
										for (int d = 0; d < mapa.length; d++) {
											if (d<mapa.length-1) {
												System.out.print(mapa[c][d] + " ");
											} else if (d == mapa.length-1) {
												System.out.print(mapa[c][d] + "\n");
												
												}
											}
										}
									System.out.print("Game over.");
									perdeu = true;
									break;
								}
								
							}
						
							j = mapa.length;
							k = mapa.length;
							break;
						
					} else if (movimento.equals("C")) {
						//tinha um for aqui, em todos os tipos de movimentos
							if (j == 0) {
								if (!mapa[mapa.length-1][k].equals("@")) {
									mapa[0][k] = "*";
									mapa[mapa.length-1][k] = "#";
								} else {
									for (int c = 0; c<mapa.length; c++) {
										for (int d = 0; d < mapa.length; d++) {
											if (d<mapa.length-1) {
												System.out.print(mapa[c][d] + " ");
											} else if (d == mapa.length-1) {
												System.out.print(mapa[c][d] + "\n");
												
												}
											}
										}
									System.out.print("Game over.");
									perdeu = true;
									break;
								}
							} else if (j>0){
								if (!mapa[j-1][k].equals("@")) {
									mapa[j][k] = "*";
									mapa [j-1][k] = "#";
								} else {
									for (int c = 0; c<mapa.length; c++) {
										for (int d = 0; d < mapa.length; d++) {
											if (d<mapa.length-1) {
												System.out.print(mapa[c][d] + " ");
											} else if (d == mapa.length-1) {
												System.out.print(mapa[c][d] + "\n");
												
												}
											}
										}
									System.out.print("Game over.");
									perdeu = true;
									break;
								}
								
							}
							
							j = mapa.length;
							k = mapa.length;
							break;
					}
					
					
				}
			}
		}
			
	}


		if (perdeu == false) {
		for (int c = 0; c<mapa.length; c++) {
			for (int d = 0; d < mapa.length; d++) {
				if (d<mapa.length-1) {
					System.out.print(mapa[c][d] + " ");
				} else if (d == mapa.length-1) {
					System.out.print(mapa[c][d] + "\n");
				}
					
					}
				}
			}
  }
}