public class LivroTeste {

    public static void main(String[] args) {

        RegistroVendas venda = new RegistroVendas();
        //Livro 01
        LivroFisico meuLivro = new LivroFisico("O hobbit",9.99);
        //meuLivro.nome = "O Hobbit";
        meuLivro.setPaginas(521);
        meuLivro.setResumo("bla bla bla bla bla");
        meuLivro.setAutor("J. R. Tolkien");

        Editora editora1 = new Editora("Ideales");
        //editora1.nome = "Ideales";
        editora1.email = "edIdeales@gmail.com";

        meuLivro.setEditora(editora1);
        //meuLivro.aplicarDesconto(0.4);

        //meuLivro.exibirDados();
        venda.adicionar(meuLivro);

        //Livro 02
        Editora editora02 = new Editora("Ramos");
        //editora02.nome = "Ramos";
        editora02.email = "editRamos@gmail.com";

        //LivroDigital 1
        LivroDigital livroFavorito = new LivroDigital("O código da Vinci",10.99);
        //livroFavorito.nome = "O Código Da Vinci";
        livroFavorito.setResumo("bla bla bla bla bla");
        livroFavorito.setPaginas(500);
        livroFavorito.setAutor("Dan Brown");
        livroFavorito.setEditora(editora02);
        //livroFavorito.aplicarDesconto(0.25);
        livroFavorito.setMarcaDAgua("Suquinho");
        livroFavorito.setTipoCapa(TipoCapaEnum.PERSONALIZADA);

        venda.adicionar(livroFavorito);

        //livroFavorito.exibirDados();
        venda.exibir();

        Vouchers cupom = new Vouchers();
        cupom.validar("ETEC8");
        cupom.validar("ETEC-Teste");

    }

}
