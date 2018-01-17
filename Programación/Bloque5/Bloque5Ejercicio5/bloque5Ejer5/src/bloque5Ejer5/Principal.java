package bloque5Ejer5;

public class Principal {
	public static void main(String[] args) {
Horas horas=new Horas();
Horas horas2=new Horas(23, 43, 22);

System.out.println("Horas: "+horas.getHoras()+":"+horas.getMinutos()+":"+horas.getSegundos());
System.out.println("Horas2: "+horas2.getHoras()+":"+horas2.getMinutos()+":"+horas2.getSegundos());
horas.leer();
System.out.println("Horas2: "+horas.getHoras()+":"+horas.getMinutos()+":"+horas.getSegundos());
System.out.println("Segundos transcurridos desde medianoche: "+horas.aSegundos(horas.getHoras(), horas.getMinutos(), horas.getSegundos()));
System.out.println("Segundos transcurridos entre las dos horas: "+horas.segundosDesde(horas2.getHoras(), horas2.getMinutos(), horas2.getSegundos()));

Horas horas3=new Horas(horas2);
horas3.igualQue(23, 22, 11);
horas2.menorQue(21, 12, 34);
horas2.mayorQue(21, 12, 34);
		}
	}
