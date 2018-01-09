package bloque5Ejer3;

public class Fecha {
	private int dia;
	private int mes;
	private int año;
	
	public Fecha() {
		
	}
	public Fecha(int dia,int mes,int año) {
		this.dia=dia;
		this.mes=mes;
		this.año=año;
	}
	public void diaSiguiente() {
		int todoadias=(this.año*365)+((this.mes-1)*30)+this.dia;
		int nuevodia;
		int nuevomes;
		int nuevoaño;
		todoadias=todoadias+2;
		nuevoaño=todoadias/365;
		todoadias=todoadias-nuevoaño*365;
		nuevomes=todoadias/30;
		todoadias=todoadias-nuevomes;
		nuevodia=todoadias;
		if(nuevodia>30) {
			int aux;
			aux=nuevodia/30;
			nuevomes=nuevomes+aux;
			nuevodia=nuevodia-30;
		}
		System.out.println("La nueva fecha incrementada es: "+nuevodia+" del "+nuevomes+" del año "+nuevoaño);
	}
	
	public boolean fechaCorrecta() {
		boolean correcto=true;
		boolean bisiesto;
		if(this.dia<1||this.dia>31) {
			correcto=false;
		}
		if(this.mes<1||this.mes>12) {
			correcto=false;
		}
		if(this.año<1) {
			correcto=false;
			System.out.println("Introduce un año positivo");
		}
		bisiesto=esBisiesto(año);
		if(bisiesto) {
			System.out.println("El año es bisiesto");
		}
		else {
			System.out.println("El año no es bisiesto");
		}
		return correcto;
	}
	
	private boolean esBisiesto(int año) {
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
			return true;
		}
		else {
		return false;
		}
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
	
}
