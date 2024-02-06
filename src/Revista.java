import java.util.Objects;

public class Revista implements Exemplar {
    private String nome;
    private String descricao;
    private double preco;
    private Editora editora;

    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome da revista: " + nome);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
