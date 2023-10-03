import java.util.Scanner;

public class ProgramaP {

    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("digite a primeira nota ");
        double n1 = s.nextDouble();
        System.out.print("digite a segunda nota ");
        double n2 = s.nextDouble();
        System.out.print("digite a terceira nota ");
        double n3 = s.nextDouble();
        System.out.print("digite a quarta nota ");
        double n4 = s.nextDouble();

        double m = (n1 + n2 + n3 + n4) / 4;

        if (m >= 7) {
            System.out.println("Sua media é " + m);
            System.out.println("O aluno foi aprovado!!");
        } else if (m >=5 && m < 7) {
            System.out.println("Sua media é " + m);
            System.out.println("O aluno esta em recuperação!!");
        } else {
            System.out.println("Sua media é " + m);
            System.out.println("O aluno esta reprovado!!");
        }
    }
}
