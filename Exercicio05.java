import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a string a ser invertida:");
        String original = scanner.nextLine();
        String invertida = "";

        for(int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("A string invertida é: " + invertida);
    }
}

