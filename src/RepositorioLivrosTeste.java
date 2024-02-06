import java.util.Optional;

public class RepositorioLivrosTeste {
    public static void main(String[] args) {
        RepositorioLivros repo = new RepositorioLivros();
        Optional<Livro> op = repo.buscarPorTitulo("Pato");
        if(op.isEmpty())
            System.out.println("Livro não disponível");
        else
            op.get().exibirDados();
    }
}
