package bloque5Ejer2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro=new Libro("Libro numero 1","Autor Chachi",5,2);
		Libro libro1=new Libro("Libro numero 2","Autor Aburrido",3,3);
		System.out.println(libro.getTitulo()+" - "+libro.getAutor()+" - Ejemplares totales: "+libro.getnEjemplares()+" - Ejemplares prestados: "+libro.getnPrestados());
		System.out.println(libro1.getTitulo()+" - "+libro1.getAutor()+" - Ejemplares totales: "+libro1.getnEjemplares()+" - Ejemplares prestados: "+libro1.getnPrestados());
		System.out.println("Solicitando prestamo del libro: "+libro.getTitulo()+" El resultado del préstamo es: "+libro.prestamo());
		System.out.println("Solicitando prestamo del libro: "+libro1.getTitulo()+" El resultado del préstamo es: "+libro1.prestamo());
		System.out.println("----------------------------------------------------------\nRealizando inventario.....\n----------------------------------------------------------");
		System.out.println(libro.getTitulo()+" - "+libro.getAutor()+" - Ejemplares totales: "+libro.getnEjemplares()+" - Ejemplares prestados: "+libro.getnPrestados());
		System.out.println(libro1.getTitulo()+" - "+libro1.getAutor()+" - Ejemplares totales: "+libro1.getnEjemplares()+" - Ejemplares prestados: "+libro1.getnPrestados());
		System.out.println("Solicitando devolucion del libro: "+libro.getTitulo()+" El resultado de la devolucion es: "+libro.devolucion());
		System.out.println("Solicitando devolucion del libro: "+libro.getTitulo()+" El resultado de la devolucion es: "+libro.devolucion());
		System.out.println("Solicitando devolucion del libro: "+libro.getTitulo()+" El resultado de la devolucion es: "+libro.devolucion());
		System.out.println("Solicitando devolucion del libro: "+libro.getTitulo()+" El resultado de la devolucion es: "+libro.devolucion());
		System.out.println("----------------------------------------------------------\nRealizando inventario.....\n----------------------------------------------------------");
		System.out.println(libro.getTitulo()+" - "+libro.getAutor()+" - Ejemplares totales: "+libro.getnEjemplares()+" - Ejemplares prestados: "+libro.getnPrestados());
		System.out.println(libro1.getTitulo()+" - "+libro1.getAutor()+" - Ejemplares totales: "+libro1.getnEjemplares()+" - Ejemplares prestados: "+libro1.getnPrestados());

	}

}
