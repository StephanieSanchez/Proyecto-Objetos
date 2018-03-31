package modelo;

public class Cubo extends Cuadrado{
	
	
	public Cubo(double dato){
	super(dato);
	}
	
	public  double calcularVolumen(double lado){
		double res=lado*lado*lado;
		return res;
	}

}
