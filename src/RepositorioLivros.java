import java.util.*;

public class RepositorioLivros {
    private List<Livro> livros = new LinkedList<>();

    RepositorioLivros(){
        LivroFisico fisico = new LivroFisico("Suco",14);
        LivroDigital digital = new LivroDigital("Saco",15);
        LivroBolso bolso = new LivroBolso("Seco",5);

        LivroFisico fisico2 = new LivroFisico("Sisco",14);
        LivroDigital digital2 = new LivroDigital("Sesto",15);
        LivroBolso bolso2 = new LivroBolso("Pato",5);

        livros.add(fisico);
        livros.add(fisico2);
        livros.add(digital);
        livros.add(digital2);
        livros.add(bolso);
        livros.add(bolso2);
    }
    public Optional<Livro> buscarPorTitulo(String titulo){
        Optional<Livro> op = livros.stream().filter(e->e.getNome().equals(titulo)).findFirst();
        return op;
    }
}
