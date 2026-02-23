package RE2;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[3][3];
		int n=0;
		int cn=0;
		
		do {
			System.out.println("Menu de arrays");
			System.out.println("1.Rellenar arrays");
			System.out.println("2.Sumar fila");
			System.out.println("3.Sumar columna");
			System.out.println("4.Sumar diagonal principal");
			System.out.println("5.Sumar diagonal inversa");
			System.out.println("6.Media de la matriz");
			System.out.println("7.Salir");
			n=sc.nextInt();
			
			switch(n) {
			case 1:
				cn++;
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						System.out.println("Coloca un valor en la fila "+ i+ " Columna "+ j);
						int num=sc.nextInt();
						arr[i][j] = num;
					}
				}
				break;
			case 2:
				if(cn==0) {
					System.out.println("El array no tiene valores");
				} else {
					int sumar=0;
					System.out.println("Elije la fila de la que quieres sumar 0 al 2");
					int num =sc.nextInt();
					while(num<0 || num>2) {
						System.out.println("No existe la fila pon otra");
						num =sc.nextInt();
					}
					for(int i=0;i<3;i++) {
						sumar+=arr[num][i];
					}
					System.out.println("La suma de la fila es "+ sumar);
				}
				
				break;
				
			case 3:
				if(cn==0) {
					System.out.println("El array no tiene valores");
				} else {
					int sumar=0;
					System.out.println("Elije la columna de la que quieres sumar 0 al 2");
					int num =sc.nextInt();
					while(num<0 || num>2) {
						System.out.println("No existe la columna pon otra");
						num =sc.nextInt();
					}
					for(int i=0;i<3;i++) {
						sumar+=arr[i][num];
					}
					System.out.println("La suma de la columna es "+ sumar);
				}
				
				break;
				
			case 4:
				if(cn==0) {
					System.out.println("El array no tiene valores");
				} else {
					int sumar=0;
					for(int i=0;i<3;i++) {
						sumar+=arr[i][i];
					}
					System.out.println("La suma de la diagonal principal es "+ sumar);
				}
				
				break;
				
			case 5:
				if(cn==0) {
					System.out.println("El array no tiene valores");
				} else {
					int sumar=0;
					for(int i=0;i<3;i++) {
					    sumar += arr[i][2-i];
					}
					System.out.println("La suma de la diagonal inversa es "+ sumar);
				}
				
				break;
				
			case 6:
				if(cn==0) {
					System.out.println("El array no tiene valores");
				} else {
					int sumar=0;
					int c=0;
					for(int i=0;i<3;i++) {
						for(int j=0;j<3;j++) {
							sumar+=arr[i][j];
							c++;
						}
					}
					System.out.println("La media del arrays es "+ sumar/c);
				}
				
				break;
			case 7: break;
				
				
			default:
				System.out.println("Numero fuera de parametro");
				break;
			}
			
			
		}while(n!=7);
		System.out.println("GoodAdios");

	}

}
