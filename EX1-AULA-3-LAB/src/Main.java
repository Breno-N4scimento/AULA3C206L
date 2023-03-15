public class Main {
    public static void main(String[] args) {



        Produto p1= new Produto();
        p1.codigoSerie=123;
        p1.nome="Bola";
        p1.categoria="Brinquedo";
        p1.codigoProduto="456";
        p1.quantidade=500;

        Produto p2= new Produto();
        p2.codigoSerie=321;
        p2.nome="Televisao";
        p2.categoria="Eletrodomestico";
        p2.codigoProduto="987";
        p2.quantidade=200;

        p1.mostraInfo();
        p2.mostraInfo();

    }
}