// Imprima todos os múltiplos de 3, entre 1 e 100.
public class Ex03 {
    public static void main(String[] args) {
        boolean isMultiple3 = false;
        for (int i=1; i<=1000; i++) {
            isMultiple3 = i % 3 == 0;
            if (isMultiple3 == true) {
                System.out.println(i);
            }
        }
    }
}
