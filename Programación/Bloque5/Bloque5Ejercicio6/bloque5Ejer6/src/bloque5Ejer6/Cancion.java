package bloque5Ejer6;

public class Cancion {
	private String titulo;
	private String autor;
	
	public Cancion() {
	}
	public Cancion(String titulo, String autor) {
		this.autor=autor;
		this.titulo=titulo;
		
	}
	public String dameTitulo() {
		return this.titulo;
	}
	public String dameAutor() {
	return this.autor;
	}
	public void ponTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void ponAutor(String autor) {
		this.autor=autor;
	}
}
