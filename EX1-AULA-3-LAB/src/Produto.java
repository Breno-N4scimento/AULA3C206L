public class Produto {


int codigoSerie;
String codigoProduto;
String nome;
String categoria;
int quantidade;

/*Produto(int codigoSerie,String codigoProduto,String nome,String categoria,int quantidade)
{
}*/

void mostraInfo()
{
    System.out.println("Produto: "+nome);
    System.out.println("Codigo de serie: "+codigoSerie);
    System.out.println("Codigo do Produto: "+codigoProduto);
    System.out.println("Categoria: "+categoria);
    System.out.println("Quantidade: "+quantidade);
}

}
