package bloque5Ejer4;

public class Cafetera {

	private int capMax;
	private int capAct;
	
	public Cafetera() {
		capMax=1000;
		capAct=0;
	}
	
	public Cafetera(int capMax) {
		this.capMax=capMax;
	}
	
	public Cafetera(int capMax, int capAct) {
		this.capMax=capMax;
		if (capAct>capMax){
			this.capAct=capMax;
		}
		else {
			this.capAct=capAct;
		}
		
	}
	
	public void llenarCafetera() {
		this.capAct=this.capMax;
	}
	
	public void llenarTaza(int capTaza) {
		if(this.capAct<capTaza) {
			this.capAct=0;
		}
		else {
			this.capAct=this.capAct-capTaza;
		}
	}
	
	public void vaciarCafetera() {
		this.capAct=0;
	}
	
	public void agregarCafe(int cant) {
		if(this.capMax<(this.capAct+cant)) {
			this.capAct=this.capMax;
		}
		else {
			this.capAct=this.capAct+cant;
		}
	}

	public int getCapMax() {
		return capMax;
	}

	public void setCapMax(int capMax) {
		this.capMax = capMax;
	}

	public int getCapAct() {
		return capAct;
	}

	public void setCapAct(int capAct) {
		this.capAct = capAct;
	}
}
