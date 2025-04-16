package DIO; // Define o pacote do projeto, chamado DIO

public class UnidadeDeMedida { // Declaração da classe pública chamada UnidadeDeMedida

    public static void main(String[] args) { // Método principal: ponto de entrada do programa

        // Declaração e inicialização da variável 'sigla' com o valor "p"
        String sigla = "p";

        // Estrutura de controle switch que verifica o valor da variável 'sigla'
        switch (sigla) {

            // Caso o valor de 'sigla' seja "p", imprime "PEQUENO"
            case "p": {
                System.out.println("PEQUENO");
                break; // Interrompe a execução do switch após executar esse bloco
            }

            // Caso o valor de 'sigla' seja "M", imprime "MEDIO"
            case "M": {
                System.out.println("MEDIO");
                break;
            }

            // Caso o valor de 'sigla' seja "G", imprime "GRANDE"
            case "G": {
                System.out.println("GRANDE");
                break;
            }

            // Caso o valor de 'sigla' seja "INDEFINIDO", imprime "INDEFINIDO"
            case "INDEFINIDO": {
                System.out.println("INDEFINIDO");
                // Não há break aqui, mas como é o último caso, o switch termina naturalmente
            }
        }
    }
}
