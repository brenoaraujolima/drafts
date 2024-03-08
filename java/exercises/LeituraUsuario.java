import java.util.Scanner;


class LeituraUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        System.out.println("Seu nome é: " + nome);


        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);


        System.out.println("Digite sua altura: ");
        float altura = scan.nextFloat();
        System.out.println("Sua altura é: " + altura);
    }
}
