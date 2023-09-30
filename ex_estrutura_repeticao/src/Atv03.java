import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int numero;

        do{
            System.out.println("Digite um número: ");
            numero = Integer.parseInt(inputNum.nextLine());
        } while (numero != 0);
    }
}
