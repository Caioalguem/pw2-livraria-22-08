public class LivroDigital /*filho/child*/ extends Livro /*super*/ {
    private String marcaDAgua;

    public LivroDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void aplicarDesconto(double percentual) {
        if (percentual > 0.15)
            System.out.println("Desconto Não Permitido");
        else
            preco = preco - (preco * percentual);
    }

    @Override
    public String getDescricao() {
        return ;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Marca d'água:" + marcaDAgua);
    }

    //Getters e Setters
    public String getMarcaDAgua() {
        return marcaDAgua;
    }

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }
}
