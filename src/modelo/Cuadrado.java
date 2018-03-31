package modelo;

public class Cuadrado {

 static double dato;
	
	public Cuadrado(double dato2){
		dato=dato2;
	}
	
	public  double calcularPerimetro( double lado){
		double res=lado*4;
		return res;
	}
	
	public double calcularArea(double lado){
		double res=lado*lado;
		return res;
	}

}
