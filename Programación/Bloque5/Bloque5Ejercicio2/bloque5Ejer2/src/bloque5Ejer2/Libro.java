package bloque5Ejer2;

public class Libro {

	private String titulo;
	private String autor;
	private int nEjemplares;
	private int nPrestados;

	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, int nEjemplares, int nPrestados) {
		this.titulo=titulo;
		this.autor=autor;
		this.nEjemplares=nEjemplares;
		this.nPrestados=nPrestados;
	}

	public boolean prestamo(){
		if(this.nEjemplares==this.nPrestados) {
			return false;
		}
		else {
			this.nPrestados=this.nPrestados+1;
			return true;
		}
	}
	public boolean devolucion(){
		if(this.nPrestados==0) {
			return false;
		}
		else {
			this.nPrestados=this.nPrestados-1;
			return true;
		}
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getnEjemplares() {
		return nEjemplares;
	}

	public void setnEjemplares(int nEjemplares) {
		this.nEjemplares = nEjemplares;
	}

	public int getnPrestados() {
		return nPrestados;
	}

	public void setnPrestados(int nPrestados) {
		this.nPrestados = nPrestados;
	}
	
}
