import javax.swing.plaf.IconUIResource;

public class Carro
{

    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;

    Motor motor = new Motor();

    void ligar()
    {
        System.out.println("o carro "+marca+" esta ligado");
        System.out.println("-------------------------------------");
    }

    void acelerar()
    {
        System.out.println("o carro "+marca+" esta acelerando e esta agora com "+velocidadeAtual);
        System.out.println("-------------------------------------");
    }

    void mostraInfo()
    {
        System.out.println("modelo:"+modelo);
        System.out.println("marca: "+marca);
        System.out.println("cor: "+cor);
        System.out.println("velocidade max: "+velocidadeMax);
        System.out.println("velocidade atual: "+velocidadeAtual);

        System.out.println("Potencia do motor: "+motor.potencia);
        System.out.println("tipo do motor: "+motor.tipo);
        System.out.println("-------------------------------------");
    }

}
