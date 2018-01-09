package bloque5Ejer3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fecha=new Fecha(5,2,1995);
		System.out.println("La fecha es: "+fecha.getDia()+" del mes "+fecha.getMes()+" del año "+fecha.getAño());
		if(fecha.fechaCorrecta()) {
			System.out.println("La fecha es correcta");
		}
		else {
			System.out.println("La fecha es incorrecta");
		}
		
		fecha.diaSiguiente();
	}

}
