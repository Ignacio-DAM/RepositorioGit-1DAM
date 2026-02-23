package RE2;


public class Array {

    public static void muestraArrayInt(int x[]) {
        for (int n : x) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int[] generaArrayInt(int n, int minimo, int maximo) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
        }
        return x;
    }

    public static int minimoArrayInt(int[] x) {
        int minimo = Integer.MAX_VALUE;
        for (int n : x) {
            if (n < minimo) {
                minimo = n;
            }
        }
        return minimo;
    }

    public static int maximoArrayInt(int[] x) {
        int maximo = Integer.MIN_VALUE;
        for (int n : x) {
            if (n > maximo) {
                maximo = n;
            }
        }
        return maximo;
    }

    public static double mediaArrayInt(int[] x) {
        int suma = 0;
        for (int n : x) {
            suma += n;
        }
        return (double) suma / x.length;
    }

    public static boolean estaEnArrayInt(int[] x, int n) {
        for (int numero : x) {
            if (numero == n) {
                return true;
            }
        }
        return false;
    }

    public static int posicionEnArrayInt(int[] x, int n) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static int[] volteaArrayInt(int[] x) {
        int[] a = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            a[x.length - i - 1] = x[i];
        }
        return a;
    }

    public static int[] rotaDerechaArrayInt(int[] x, int n) {
        int[] a = x.clone();
        int aux;
        while (n-- > 0) {
            aux = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = aux;
        }
        return a;
    }

    public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
        int[] a = x.clone();
        int aux;
        while (n-- > 0) {
            aux = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = aux;
        }
        return a;
    }
}
