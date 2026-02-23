package RE2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [] notas = new double[10];
		String [] nombres = new String[10];
		String [] re = new String [10];
		 for (int i=0;i<10;i++) {
			 double num;
			 String n;
			 
			 System.out.println("Dame el nombre del alumno");
			 n=sc.nextLine();
			 nombres[i]=n;
			 System.out.println("Dime la nota del alumno "+ n);
			 num=sc.nextDouble();
			 while(num<0 || num>10) {
				 System.out.println("Valores imposibles pon otra nota");
				 num=sc.nextDouble();
			 }
			 sc.nextLine();
			 notas[i]=num;
			 if(num<5) {
				 re[i]="suspenso";
			 }
			 if(num>=5 && num<7) {
				 re[i]="bien";
			 } if(num>=7 && num<9) {
				 re[i]="notable";
			 } if(num>=9 && num<=10) {
				 re[i]="sobresaliente";
			 }

			 }
		 
		 for(int i=0;i<10;i++) {
				System.out.println("El alumno "+nombres[i]+ " tiene de nota "+ notas[i]+ " es un "+ re[i]);
			}

	}
	
	

}
