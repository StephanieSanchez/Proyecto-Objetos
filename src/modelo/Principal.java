package modelo;

import java.util.Scanner;

public class Principal {
	static Scanner entrada;
	static Scanner confirmar, menu;
	static double dato;


	public static void main(String[] args) {
		Cubo cubo;
		int resdato=0, resmenu;
		double res; 
		dato=pedirDato();
		do {
			System.out.println("Valor del lado ingresado "+dato+"\n ");
			resmenu=menu();
			cubo = new Cubo(dato);
			switch(resmenu){
			case 1:				
				res=cubo.calcularArea(dato);
				System.out.println("Área = "+res+"\n");
				resdato=menuDato();
				if(resdato==2){
					dato=pedirDato();
				}
				break;
			case 2:				
				res=cubo.calcularPerimetro(dato);
				System.out.println(" Perimetro = "+res+"\n");
				resdato=menuDato();
				if(resdato==2){
					dato=pedirDato();
				}
				break;
			case 3:
				res=cubo.calcularVolumen(dato);
				System.out.println(" Volumen = "+res+"\n");
				resdato=menuDato();
				if(resdato==2){
					dato=pedirDato();
				}
				break;
			case 4:
				System.out.println("Valor del lado ingresado "+dato+"\n ");
				break;
			}

		} while (resmenu!=5);

	}


	@SuppressWarnings("resource")
	public static int menu(){
		int op=0;
		Scanner opmenu;
		System.out.println("Seleccione la opción de la operación que desea realizar\n"
				+ "1... Calcular área de un cuadrado\n"
				+ "2... Calcular perimetro de un cuadrado\n"
				+ "3... Calcular volumen de un cubo\n"
				+ "4... Cancelar\n"
				+ "5... Salir\n");
		opmenu=new Scanner(System.in);
		op=Integer.parseInt(opmenu.nextLine());
		return op;
	}

	public static double pedirDato(){
		double lado=0.0;
		System.out.println("Ingrese la medida de un lado");
		entrada= new Scanner(System.in);
		lado=Double.parseDouble(entrada.nextLine());
		return lado;
	}

	@SuppressWarnings("resource")
	public static int menuDato(){
		int op=0;
		Scanner opmenuDato;
		System.out.println("¿Desea seguir con el valor del dato actual?\n"
				+ "1... Si\n"
				+ "2... Otro\n");
		opmenuDato=new Scanner(System.in);
		op=Integer.parseInt(opmenuDato.nextLine());
		return op;
	}
}
