import java.util.Scanner;

public class Capitulo {
    private String titulo;
    private String conteudo;

    public Capitulo(Scanner scanner) {
        lerCapitulo(scanner);
    }

    public void lerCapitulo(Scanner scanner) {
        if (scanner.hasNextLine()) {
            this.titulo = scanner.nextLine();
        }

        StringBuilder conteudoBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            if (linha.equals("CAPITULO_COM_IMAGEM") || linha.equals("CAPITULO")) {
                break;
            }
            conteudoBuilder.append(linha).append("\n");
        }
        this.conteudo = conteudoBuilder.toString();
    }

    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: ");
        System.out.println(conteudo);
    }
}
