package bloque5Ejer5;

import java.util.Scanner;

public class Horas {

	Scanner sc=new Scanner(System.in);
	private int horas;
	private int minutos;
	private int segundos;
	
	public Horas() {
		this.horas=0;
		this.minutos=0;
		this.segundos=0;
	}
	
	public Horas(int h, int m, int s) {
		this.horas=h;
		this.minutos=m;
		this.segundos=s;
	}
	public Horas(Horas p) {
		this.horas=p.horas;
		this.minutos=p.minutos;
		this.segundos=p.segundos;
	}
	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public void leer() {
		System.out.print("Introduce las horas: ");
		this.horas=sc.nextInt();
		System.out.print("Introduce los minutos: ");
		this.minutos=sc.nextInt();
		System.out.print("Introduce los segundos: ");
		this.segundos=sc.nextInt();
		validar(this.horas, this.minutos, this.segundos);
		
	}
	private void validar(int h, int m, int s) {
		if (h/24<=0) {
			System.out.println("La hora introducida es correcta.");
		}
		else {
			System.out.println("La hora introducida no es una hora válida, fijando la hora");
			int auxH=h/24;
			this.horas=auxH;
		}
		if (m/60<=0) {
			System.out.println("Los minutos introducidos son correctos.");
		}
		else {
			System.out.println("Los minutos introducidos no son válidos, fijando los minutos");
			int auxM=m/60;
			this.minutos=auxM;
		}
		if (s/60<=0) {
			System.out.println("Los segundos introducidos son correctos.");
		}
		else {
			System.out.println("Los segundos introducidos no son válidos, fijando los segundos");
			int auxS=s/60;
			this.segundos=auxS;
		}
	}
	public int aSegundos(int h, int m, int s) {
		int auxseg;
		auxseg=(h*3600)+(m*60)+(s);
		return auxseg;
	}
	public void deSegundos(int seg) {
		this.horas=seg/3600;
		System.out.println("Horas fijadas en: "+this.horas);
	}
	public int segundosDesde(int h, int m, int s) {
		int segundosTotPrincipal;
		int segundosTotMetodo;
		int segundosDesde;
		segundosTotPrincipal=aSegundos(this.horas, this.minutos, this.segundos);
		segundosTotMetodo=aSegundos(h, m, s);
		if(segundosTotPrincipal>segundosTotMetodo) {
			segundosDesde=segundosTotPrincipal-segundosTotMetodo;
		}
		else{
		segundosDesde=segundosTotMetodo-segundosTotPrincipal;
		}
		return segundosDesde;
		
	}
	public void siguiente() {
		this.segundos=this.segundos+1;
		validar(this.horas, this.minutos, this.segundos);
	}
	public void anterior() {
		this.segundos=this.segundos-1;
		validar(this.horas, this.minutos, this.segundos);
	}

	public boolean igualQue(int h, int m, int s) {
		boolean iguales;
		int aux1=aSegundos(this.horas, this.minutos, this.segundos);
		int aux2=aSegundos(h, m, s);
		if (aux1==aux2) {
			iguales=true;
		}
		else {
			iguales=false;
		}
		return iguales;
	}

	public void menorQue(int h, int m, int s) {
		int aux1=aSegundos(this.horas, this.minutos, this.segundos);
		int aux2=aSegundos(h, m, s);
		if (aux2<aux1){
			System.out.println("La hora es anterior a la proporcionada");
		}
	}
	public void mayorQue(int h, int m, int s) {
		int aux1=aSegundos(this.horas, this.minutos, this.segundos);
		int aux2=aSegundos(h, m, s);
		if (aux2>aux1){
			System.out.println("La hora es posterior a la proporcionada");
		}
	}
	}
