// Imprima a soma de 1 até 1000.
public class Ex02 {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        while (count <= 1000) {
            sum += count;
            count++;
        }
        System.out.println(sum);
    }
}
