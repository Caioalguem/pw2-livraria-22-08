public class LivroFisico extends Livro{
    LivroFisico(String nome, double preco){
        super(nome,preco);
    }
    public double getTaxaImpressaoj(){
        return getPreco()*0.05;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0.3)
            System.out.println("Desconto Não Permitido");
        else
            preco = preco - (preco * percentual);
    }
}
