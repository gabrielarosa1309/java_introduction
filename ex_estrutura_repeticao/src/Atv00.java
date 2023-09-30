import java.util.Scanner;

public class Atv00 {
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        float salario = leitor.nextFloat();

        if (salario < 1000)
        {
            var novoSalario = salario * 1.1f;
            System.out.println(novoSalario); //sout funciona igual o prop
        }
        else
        {
            System.out.println("Salário dentro da faixa");
        }
    }
}
