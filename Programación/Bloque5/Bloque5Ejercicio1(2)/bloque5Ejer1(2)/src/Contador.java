
public class Contador {
private int cont;

public Contador() {
	
}

public Contador(int num) {
	if(num<0) {
		this.cont=0;
	}
	else {
		this.cont=num;
	}
}
public Contador(Contador cont1) {
	if(cont1.cont<0) {
		this.cont=0;
	}
	else {
		this.cont=cont1.cont;
	}
}

public int getCont() {
	return cont;
}
public void setCont(int cont) {
	this.cont = cont;
}
}
