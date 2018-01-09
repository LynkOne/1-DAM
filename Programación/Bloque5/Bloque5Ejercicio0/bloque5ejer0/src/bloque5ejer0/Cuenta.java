package bloque5ejer0;

import java.util.Scanner;

public class Cuenta {
	Scanner sc=new Scanner(System.in);
	private String nombre;
	private String nCuenta;
	private double tInteres;
	private double saldo;
	
	public Cuenta (String nombre,String nCuenta, double tInteres, double saldo ) {
		this.nombre=nombre;
		this.nCuenta=nCuenta;
		this.tInteres=tInteres;
		this.saldo=saldo;
		
	}
	
	public Cuenta() {
	}

	public Cuenta(Cuenta cuenta1) {
		this.nombre=cuenta1.nombre;
		this.nCuenta=cuenta1.nCuenta;
		this.tInteres=cuenta1.tInteres;
		this.saldo=cuenta1.saldo;
		
	}
	
	public void Ingreso(int cantidad) { 
		if(cantidad<=0) {
			System.out.println("La cantidad no puede ser igual o inferior a 0");
		}
		else {
			this.saldo=this.saldo+cantidad;
		}
	}
	
	public void Reintegro(int cantidad) { 
		if(cantidad<=0) {
			System.out.println("La cantidad no puede ser igual o inferior a 0");
		}
		else {
			this.saldo=this.saldo-cantidad;
		}
	}
	
	public void Transferencia(Cuenta cuentadestino,double importe) {
		if(this.saldo>=importe) {
			this.saldo=this.saldo-importe;
			cuentadestino.saldo=cuentadestino.saldo+importe;
			
		}
		else {
			System.out.println("Error, saldo insuficiente");
		}
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getnCuenta() {
		return nCuenta;
	}
	public void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}
	public double gettInteres() {
		return tInteres;
	}
	public void settInteres(double tInteres) {
		this.tInteres = tInteres;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
