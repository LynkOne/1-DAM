
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador cont=new Contador(6);
		Contador cont1=new Contador(cont);
		
		
		System.out.println("Probando constructor con parámetro...\n El contador es: "+cont.getCont());
		System.out.println("\nProbando constructor copia...\n El contador es: "+cont1.getCont());
		
	}

}
