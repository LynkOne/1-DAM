package bloque5ejer0;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, numero;
		double tipo, importe;
		Cuenta cuenta1 = new Cuenta();
		System.out.print("Nombre : ");
		nombre = sc.nextLine();
		System.out.print("N�mero de cuenta : ");
		numero = sc.nextLine();
		System.out.print("Tipo de interes : ");
		tipo = sc.nextDouble();
		System.out.print("Saldo: ");
		importe = sc.nextDouble();
		cuenta1.setNombre(nombre);
		cuenta1.setnCuenta(numero);
		cuenta1.settInteres(tipo);
		cuenta1.setSaldo(importe);
		Cuenta cuenta2 = new Cuenta("Juan Ferr�ndez Rubio","12345678901234567890", 1.75, 300);
		Cuenta cuenta3 = new Cuenta(cuenta1);
		System.out.println("Datos de la cuenta 1");
		System.out.println("Nombre del titular: " + cuenta1.getNombre());
		System.out.println("N�mero de cuenta: " +
		cuenta1.getnCuenta());
		System.out.println("Tipo de inter�s: " + cuenta1.gettInteres());
		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println();
		cuenta1.Ingreso(4000);
		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println("Datos de la cuenta 2");
		System.out.println("Nombre del titular: " + cuenta2.getNombre());
		System.out.println("N�mero de cuenta: " + cuenta2.getnCuenta());
		System.out.println("Tipo de inter�s: " + cuenta2.gettInteres());
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();
		System.out.println("Datos de la cuenta 3");
		System.out.println("Nombre del titular: " + cuenta3.getNombre());
		System.out.println("N�mero de cuenta: " + cuenta3.getnCuenta());
		System.out.println("Tipo de inter�s: " + cuenta3.gettInteres());
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();
		cuenta3.Transferencia(cuenta2, 10);
		System.out.println("Saldo de la cuenta 2");
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();
		System.out.println("Saldo de la cuenta 3");
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();
		}

}
