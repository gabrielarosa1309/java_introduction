import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args)
    {
        Scanner inputSenha = new Scanner(System.in);
        String senha;
        System.out.println("Insira a senha: ");

        do{
            senha = inputSenha.nextLine();
            if (!senha.equals("123")){
                System.out.println("Senha incorreta!");
            }
        } while(!senha.equals("123"));

        System.out.println("Senha correta!");
    }
}
