package bloque5Ejer3;

public class Fecha {
	private int dia;
	private int mes;
	private int a�o;
	
	public Fecha() {
		
	}
	public Fecha(int dia,int mes,int a�o) {
		this.dia=dia;
		this.mes=mes;
		this.a�o=a�o;
	}
	public void diaSiguiente() {
		int todoadias=(this.a�o*365)+((this.mes-1)*30)+this.dia;
		int nuevodia;
		int nuevomes;
		int nuevoa�o;
		todoadias=todoadias+2;
		nuevoa�o=todoadias/365;
		todoadias=todoadias-nuevoa�o*365;
		nuevomes=todoadias/30;
		todoadias=todoadias-nuevomes;
		nuevodia=todoadias;
		if(nuevodia>30) {
			int aux;
			aux=nuevodia/30;
			nuevomes=nuevomes+aux;
			nuevodia=nuevodia-30;
		}
		System.out.println("La nueva fecha incrementada es: "+nuevodia+" del "+nuevomes+" del a�o "+nuevoa�o);
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
		if(this.a�o<1) {
			correcto=false;
			System.out.println("Introduce un a�o positivo");
		}
		bisiesto=esBisiesto(a�o);
		if(bisiesto) {
			System.out.println("El a�o es bisiesto");
		}
		else {
			System.out.println("El a�o no es bisiesto");
		}
		return correcto;
	}
	
	private boolean esBisiesto(int a�o) {
		if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0))) {
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
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	
}
