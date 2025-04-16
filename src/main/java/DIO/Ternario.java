package DIO; // Define o pacote onde a classe está organizada, chamado DIO

public class Ternario { // Declaração da classe pública chamada Ternario
    public static void main(String[] args) { // Método principal: ponto de entrada do programa

        int nota = 5; // Declaração e inicialização da variável 'nota' com o valor 5

        // Uso do operador ternário para verificar se a nota é maior ou igual a 6
        // Se for, a variável 'resultado' recebe "aprovado"
        // Caso contrário, recebe "Reprovado"
        String resultado = nota >= 6 ? "aprovado" : "Reprovado";

        // Exibe no console o valor armazenado na variável 'resultado'
        System.out.println(resultado);
    }
}
