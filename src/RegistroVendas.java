import java.util.ArrayList;
import java.util.List;
public class RegistroVendas  {
    private double total;
    private List<Exemplar> listaL = new ArrayList<>();

    public void adicionar(Exemplar item){ //Polimorfismo => (Poli- muitos- e morfismo - forma) Muitas formas de referenciar um objeto
        System.out.println("Livro adicionado" + item.getNome());
        //item.aplicarDesconto(0.1);
        total += item.getPreco();
        listaL.add(item);
    }

    public void exibir(){
        System.out.println("#### LIVROS ADICIONADOS ####");
        listaL.forEach(e-> e.exibirDados());

    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
