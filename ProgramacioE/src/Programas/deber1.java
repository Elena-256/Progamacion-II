package Programas;

import java.util.Scanner;

public class deber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		x=1;
		double not=0;
		double pro=0;
		System.out.println("Bienvenidos");
		System.out.println("Desea ingresar al sistema");
		Scanner respuesta=new Scanner(System.in);
		String resp=respuesta.next();
		System.out.println("Ingrese el numero de estudiantes");
		Scanner rango=new Scanner(System.in);
		int ra=rango.nextInt();
		while (resp.equals("si")&(x<=ra)){ 
			System.out.println("Ingrese su nota "+x);
			Scanner nota=new Scanner(System.in);
			double n=nota.nextDouble();
			x=x+1;
			not=not+n;
			pro=not/ra;	}
			System.out.println("Su promedio es "+pro);
		System.out.println("Gracias por utilizar el sistema");
	}

}
