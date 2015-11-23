package Programas;

import java.util.Scanner;

public class deber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,i;
		x=1;
		i=0;
		double not=0;
		double prom=0;
		System.out.println("Bienvenido");
		System.out.println("Desea ingresar al sistema");
		Scanner respuesta=new Scanner(System.in);
		String resp=respuesta.next();
		while (resp.equals("si")&(x<=50)){ 
			System.out.println("Ingrese su nota "+x);
			Scanner nota=new Scanner(System.in);
			double not=nota.nextDouble();
			x=x+1;
if(n<=6){
				i=i+1;
			}
			not=not+not;
			pro=not/50;	
		}if(prom<=7){
		System.out.println("los estudiantes reprovaron con:"+prom);
		}
		else{
			System.out.println("los estudiantes aprovaron con: "+prom);
		}
		System.out.println("la cantidad de estudiantes reprovados es:"+i);

		System.out.println("Gracias por utilizar el sistema");
	}}
