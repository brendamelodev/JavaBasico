package aula1;

public class AvaliaAluno {
    // psvm
    public static void main(String[] args) {
        String aluno = "Lucas Bascos";
        double nota1 = 8.6;
        double nota2 = 5.2;
        double nota3 = 7.1;
        double media = 0;
        double fator1 = 0.6;
        double fator2 = 0.2;
        boolean skl = false;

        if (skl == true) {
            media = ((nota1 * fator1) + ((nota2 + nota3) * fator2));
            if (media > 7) {
                System.out.println(media + " Parabens " + aluno + ", aprovado.");
            } else {
                System.out.println(media + aluno + " Reprovado, estudar mais.");
            }
        } else {
            media = ((nota3 * fator1) + ((nota2 + nota1) * fator2));
            if (media > 7) {
                System.out.println(media + " Parabens " + aluno + ", aprovado.");
            } else {
                System.out.println(media + aluno + " Reprovado, estudar mais.");
            }
        }
    }
}
