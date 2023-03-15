public class Main
{
    public static void main(String[] args)
    {

    Carro c1=new Carro();
    c1.marca="Ford";
    c1.cor="Azul";
    c1.modelo="Fiesta";
    c1.velocidadeMax=180;
    c1.velocidadeAtual=73;
    c1.motor.potencia=100;
    c1.motor.tipo="diesel";

    Carro c2=new Carro();
    c2.marca="Wolksvagen";
    c2.cor="Prata";
    c2.modelo="GOL";
    c2.velocidadeMax=200;
    c2.velocidadeAtual=120;
    c2.motor.potencia=180;
    c2.motor.tipo="diesel";

    //os carros estao ligando
    c1.ligar();
    c2.ligar();

    //os carros estao acelerando
    c1.acelerar();
    c2.acelerar();

    //mostrando as informacoes sobre os carros
    c1.mostraInfo();
    c2.mostraInfo();
    }
}