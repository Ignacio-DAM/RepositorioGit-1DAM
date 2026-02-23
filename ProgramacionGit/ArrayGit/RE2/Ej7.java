package RE2;

import java.util.Random;
import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                matriz[i][j] = r.nextInt(41) + 10;

        for (int[] fila : matriz) {
            for (int v : fila) System.out.print(v + "\t");
            System.out.println();
        }

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                int val = matriz[i][j];
                boolean minFila = true, maxCol = true;
                for (int k = 0; k < 5; k++) {
                    if (matriz[i][k] < val) minFila = false;
                    if (matriz[k][j] > val) maxCol = false;
                }
                if (minFila && maxCol)
                    System.out.println("Punto de silla: " + val + " en (" + i + "," + j + ")");
            }

        System.out.print("Fila (0-4): ");
        int f = sc.nextInt();
        System.out.print("Columna (0-4): ");
        int c = sc.nextInt();
        sc.nextLine();
        System.out.print("Dirección (nose/neso): ");
        String dir = sc.nextLine();

        if (dir.equalsIgnoreCase("nose")) {
            int i = f, j = c;
            while (i > 0 && j > 0) { i--; j--; }
            while (i < 5 && j < 5) System.out.print(matriz[i++][j++] + " ");
        } else {
            int i = f, j = c;
            while (i > 0 && j < 4) { i--; j++; }
            while (i < 5 && j >= 0) System.out.print(matriz[i++][j--] + " ");
        }
        System.out.println();
        
    }
}
