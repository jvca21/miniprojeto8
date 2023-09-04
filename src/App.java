import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à história interativa!");
        System.out.println("Você está pronto para começar? (S/N)");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            iniciarHistoria(scanner);
        } else {
            System.out.println("Até a próxima!");
        }

        scanner.close();
    }

    public static void iniciarHistoria(Scanner scanner) {
        String texto = "CAPITULO\n" +
                "O Mistério da Casa Assombrada\n" +
                "Era uma vez uma casa assombrada...\n" +
                "Escolha:\n" +
                "1. Entrar na casa\n" +
                "2. Ficar longe da casa\n";

        System.out.println(texto);

        int escolha = Integer.parseInt(scanner.nextLine());

        switch (escolha) {
            case 1:
                capituloCasaAssombrada(scanner);
                break;
            case 2:
                System.out.println("Você escolheu ficar longe da casa. Fim da história.");
                break;
            default:
                System.out.println("Escolha inválida. Fim da história.");
                break;
        }
    }

    public static void capituloCasaAssombrada(Scanner scanner) {
        String texto = "CAPITULO\n" +
                "Os Visitantes Inesperados\n" +
                "Certa noite, um grupo de amigos decidiu explorar a casa assombrada...\n" +
                "Escolha:\n" +
                "1. Continuar explorando a casa\n" +
                "2. Sair da casa\n";

        System.out.println(texto);

        int escolha = Integer.parseInt(scanner.nextLine());

        switch (escolha) {
            case 1:
                capituloMapaAntigo(scanner);
                break;
            case 2:
                System.out.println("Você escolheu sair da casa. Fim da história.");
                break;
            default:
                System.out.println("Escolha inválida. Fim da história.");
                break;
        }
    }

    public static void capituloMapaAntigo(Scanner scanner) {
        String texto = "CAPITULO_COM_IMAGEM\n" +
                "O Enigma do Mapa Antigo\n" +
                "No sótão da casa, eles encontraram um mapa antigo.\n" +
                "   ________\n" +
                "  /       /\\\n" +
                " /       /  \\\n" +
                " \\______/   /\n" +
                "  \\      \\  /\n" +
                "   \\______\\/\n" +
                "Escolha:\n" +
                "1. Seguir as instruções do mapa\n" +
                "2. Ignorar o mapa e continuar explorando a casa\n";

        System.out.println(texto);

        int escolha = Integer.parseInt(scanner.nextLine());

        switch (escolha) {
            case 1:
                capituloJornadaComeca(scanner);
                break;
            case 2:
                capituloCasaAssombrada(scanner);
                break;
            default:
                System.out.println("Escolha inválida. Fim da história.");
                break;
        }
    }

    public static void capituloJornadaComeca(Scanner scanner) {
        String texto = "CAPITULO\n" +
                "A Jornada Começa\n" +
                "Os amigos decidem seguir o mapa em busca de um tesouro lendário...\n" +
                "Escolha:\n" +
                "1. Seguir o caminho indicado no mapa\n" +
                "2. Explorar os arredores em busca de pistas\n";

        System.out.println(texto);

        int escolha = Integer.parseInt(scanner.nextLine());

        switch (escolha) {
            case 1:
                System.out.println("Você segue o caminho indicado no mapa e encontra uma entrada para uma floresta.");
                capituloDesafioFloresta(scanner);
                break;
            case 2:
                System.out.println("Você decide explorar os arredores em busca de pistas adicionais.");
                capituloCasaAssombrada(scanner);
                break;
            default:
                System.out.println("Escolha inválida. Fim da história.");
                break;
        }
    }

    public static void capituloDesafioFloresta(Scanner scanner) {
        String texto = "CAPITULO\n" +
                "O Desafio da Floresta\n" +
                "Eles enfrentaram desafios na misteriosa floresta, mas continuaram sua jornada...\n" +
                "Escolha:\n" +
                "1. Continuar na floresta\n" +
                "2. Voltar para a casa\n";

        System.out.println(texto);

        int escolha = Integer.parseInt(scanner.nextLine());

        switch (escolha) {
            case 1:
                capituloCavernaOculta(scanner);
                break;
            case 2:
                System.out.println("Você decide voltar para a casa. Fim da história.");
                break;
            default:
                System.out.println("Escolha inválida. Fim da história.");
                break;
        }
    }

    public static void capituloCavernaOculta(Scanner scanner) {
        String texto = "CAPITULO_COM_IMAGEM\n" +
                "A Caverna Oculta\n" +
                "Dentro de uma caverna, eles encontraram pistas para o tesouro.\n" +
                "   _________\n" +
                " /          \\\n" +
                "|   O      O   |\n" +
                " \\_________/\n" +
                "Escolha:\n" +
                "1. Seguir as pistas da caverna\n" +
                "2. Voltar para a floresta\n";

        System.out.println(texto);

        int escolha = Integer.parseInt(scanner.nextLine());

        switch (escolha) {
            case 1:
                System.out.println("Você decide seguir as pistas na caverna em busca do tesouro.");
                System.out.println("Parabéns! Você encontrou o tesouro lendário. Fim da história.");
                break;
            case 2:
                System.out.println("Você decide voltar para a floresta. Fim da história.");
                break;
            default:
                System.out.println("Escolha inválida. Fim da história.");
                break;
        }
    }
}
