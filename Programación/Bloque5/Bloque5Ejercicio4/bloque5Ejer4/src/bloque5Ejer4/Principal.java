package bloque5Ejer4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafetera cafe=new Cafetera();
		Cafetera cafe1=new Cafetera(3000);
		Cafetera cafe2=new Cafetera(2500, 1320);
		
		System.out.println("Capacidad de la cafetera 0: "+cafe.getCapMax()+" Actualmente: "+cafe.getCapAct());
		System.out.println("Capacidad de la cafetera 1: "+cafe1.getCapMax()+" Actualmente: "+cafe1.getCapAct());
		System.out.println("Capacidad de la cafetera 2: "+cafe2.getCapMax()+" Actualmente: "+cafe2.getCapAct());
		
		cafe.llenarCafetera();
		cafe1.agregarCafe(560);
		cafe2.vaciarCafetera();
		
		
		System.out.println("\nCapacidad de la cafetera 0: "+cafe.getCapMax()+" Actualmente: "+cafe.getCapAct());
		System.out.println("Capacidad de la cafetera 1: "+cafe1.getCapMax()+" Actualmente: "+cafe1.getCapAct());
		System.out.println("Capacidad de la cafetera 2: "+cafe2.getCapMax()+" Actualmente: "+cafe2.getCapAct());
	
		cafe.llenarTaza(50);
		cafe1.llenarTaza(600);
		

		System.out.println("\nCapacidad de la cafetera 0: "+cafe.getCapMax()+" Actualmente: "+cafe.getCapAct());
		System.out.println("Capacidad de la cafetera 1: "+cafe1.getCapMax()+" Actualmente: "+cafe1.getCapAct());
		System.out.println("Capacidad de la cafetera 2: "+cafe2.getCapMax()+" Actualmente: "+cafe2.getCapAct());
	
	}

}
