package DIO;

public class ResultadoEscolar {

    public static void main(String[] args) {

        // Declaração de uma variável do tipo double que armazena a nota do aluno
        double nota = 7.95;

        // Verifica se a nota é maior ou igual a 7.99, se sim, o aluno é aprovado
        if (nota >= 7.99)
            System.out.println("Aluno Aprovado");

            // Verifica se a nota está entre 7.00 e 7.99, se sim, o aluno está em recuperação
        else if (nota > 6.99 && nota < 7.99) {
            System.out.println("Aluno em Recuperação");

        } else
            // Caso a nota seja menor que 7.00, o aluno é reprovado
            System.out.println("Aluno Reprovado");

    }
}
