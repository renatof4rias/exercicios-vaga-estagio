import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = 0;
        boolean numeroValido = false;
        
        while (!numeroValido) {
            System.out.print("Informe um número inteiro e positivo: ");
            if (scanner.hasNextInt()) { 
                numero = scanner.nextInt();
                if (numero > 0) { 
                    numeroValido = true;
                } else {
                    System.out.println("O número informado deve ser positivo!");
                }
            } else {
                System.out.println("A entrada deve ser um número inteiro!");
                scanner.next(); 
            }
        }
        
        int valor1 = 0, valor2 = 1, valor3 = 0;
        boolean pertence = false;
        
        while (valor3 < numero) {
            valor3 = valor1 + valor2;
            valor1 = valor2;
            valor2 = valor3;
            
            if (valor3 == numero) {
                pertence = true;
                break;
            }
        }
        
        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
}
