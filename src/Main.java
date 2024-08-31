public class Main {
    public static void main(String[] args) {
        Pessoa donoDoCarro = new Pessoa("paulo","124.564.586-98");

        Motor motor = new Motor(150, "V8");

        Carro carro = new Carro("Azul","Caminhonete",250, motor, donoDoCarro);
        carro.liga();
        carro.acelera(50);
        carro.detalhes();

        carro.acelera(150);
        carro.freia(30);
        carro.detalhes();

        carro.freia(130);
        carro.detalhes();

        carro.desliga();
        carro.detalhes();







    }
}