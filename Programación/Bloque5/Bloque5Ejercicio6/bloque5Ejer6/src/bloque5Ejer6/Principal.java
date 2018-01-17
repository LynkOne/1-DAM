package bloque5Ejer6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Cancion cancion=new Cancion();
		Cancion cancion2=new Cancion("Titulo1", "Autor1");
		cancion.ponAutor("Autor importante");
		cancion.ponTitulo("Titulo de la cancion");
		System.out.println(cancion.dameTitulo()+" de "+cancion.dameAutor());
		System.out.println(cancion2.dameTitulo()+" de "+cancion2.dameAutor());
	}

}
