public class Atv01 {
    public static void main(String[] args)
    {
        String[] listaProfessores = {"Alana","Thiago","Samanta","Alexia","Odirlei","Jéssica","Possarle"};

        for(int contador = 0; contador < listaProfessores.length;contador++)
        {
            System.out.println("O índice atual é " + contador);
            if(contador == 0)
            {
                System.out.println("O número de índice do(a) professor(a) " +listaProfessores[contador]+ " é zero");
            }
            else if(contador % 2 == 0)
            {
                System.out.println("O número de índice do(a) professor(a) " +listaProfessores[contador]+ " é par");
            }
            else
            {
                System.out.println("O número de índice do(a) professor(a) " +listaProfessores[contador]+ " é ímpar");
            }
        }
    }
}
