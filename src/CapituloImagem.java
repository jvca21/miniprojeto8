import java.util.Scanner;

public class CapituloImagem extends Capitulo {
    private String imagem;

    public CapituloImagem(Scanner scanner) {
        super(scanner);
        if (scanner.hasNextLine()) {
            this.imagem = scanner.nextLine();
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Imagem:");
        System.out.println(imagem);
    }
}
