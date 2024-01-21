// Imprima os fatoriais de 1 a 10.
public class Ex04 {
    public static void main(String[] args) {

        long n = 20;

        for (long numero=1; numero<=n; numero++) {
            long fat = 1;
            for (long inicioFat=numero; inicioFat>0; inicioFat--) {
                fat *= inicioFat;
            }

            System.out.println("O fatorial de " + numero + " eh " + fat);
        }
    }
}
