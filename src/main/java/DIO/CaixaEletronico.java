package DIO;

public class CaixaEletronico {
    public static void main(String[] args) {

        // Declaração de uma variável 'saldo' que armazena o saldo disponível na conta
        double saldo = 10.00;

        // Declaração de uma variável 'valorSolicitado' que armazena o valor que o usuário deseja sacar
        double valorSolicitado = 25.00;

        // Verifica se o valor solicitado é menor que o saldo disponível
        if (valorSolicitado < saldo)
            // Se a condição for verdadeira, o saldo é atualizado subtraindo o valor solicitado
            saldo = saldo - valorSolicitado;

        else
            // Caso o valor solicitado seja maior que o saldo disponível, exibe mensagem de erro
            System.out.println("Saldo insuficiente");

        // Exibe o saldo atualizado ou o saldo original, dependendo da situação
        System.out.println(saldo);
    }
}
