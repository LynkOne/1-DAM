package codificador;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Codificador según el UML
		//zona azul
		String frase;
		String fraseTemp="";
		String fraseCodificada="";
		String fraseTempDesco="";
		String fraseDescodificada="";
		System.out.println("Introduce frase a codificar: ");
		Scanner sc=new Scanner(System.in);
		int i=0;
		frase=sc.nextLine();
		System.out.println("Codificando frase..");
		while(i<frase.length()) {
			if(i==(frase.length()-1)) {
				fraseTemp=fraseTemp+frase.charAt(i);
			}
			else {
				fraseTemp=fraseTemp+frase.charAt(i+1)+frase.charAt(i);
			}
			i=i+2;
		}
		//zona roja
		i=fraseTemp.length()-1;
		while (i>-1) {
			fraseCodificada=fraseCodificada+fraseTemp.charAt(i);
			i--;
		}
		System.out.println(fraseCodificada);
		
		//descodificador
		//invirtiendo zona roja
		i=fraseCodificada.length()-1;
		while(i>-1) {
			fraseTempDesco=fraseTempDesco+fraseCodificada.charAt(i);
			i--;
		}
		System.out.println("Descodificando frase...");
		
		
		//Invirtiendo zona azul
		i=0;
		while(i<fraseCodificada.length()) {
			if(i==(fraseCodificada.length()-1)) {
				fraseDescodificada=fraseDescodificada+fraseTempDesco.charAt(i);
			}
			else {
				fraseDescodificada=fraseDescodificada+fraseTempDesco.charAt(i+1)+fraseTempDesco.charAt(i);
			}
			i=i+2;
		}
		System.out.println(fraseDescodificada);
	}

}
