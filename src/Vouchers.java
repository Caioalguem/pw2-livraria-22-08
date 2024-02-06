import java.util.*;

public class Vouchers {

    //não permite itens duplicados
    Set<String> itens = new HashSet<>();

    public Vouchers(){
        itens.add("Etec-Teste");
        Random gerador = new Random();
        for (int i = 0 ; i < 20 ; i++){
            String chave = "Etec" + gerador.nextInt(30);
            itens.add(chave);
        }
    }

    void validar(String item){
        //stream => estrutura que permite manipular listas
        // converter objetos, filtrar, buscar
        var result = itens.stream().filter(e -> item.equalsIgnoreCase(e)).findAny();
        if(result.isPresent()){
            System.out.println("Cupom válido");
        }else{
            System.out.println("Cupom inválido");
        }

        //findany => tanto faz a ordem
        //findfisrt => retorna o primeiro
    }

    void exibir(){
        itens.forEach(e -> System.out.println(e));
    }
}
