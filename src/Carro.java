public class Carro {

    private String cor;
    private String modelo;
    private double velocidadeAtual;
    private double getVelocidadeMaxima;
    private boolean statusLigado;
    private Motor motor;
    private Pessoa dono;

    public Carro(String cor, String modelo, double getVelocidadeMaxima, Motor motor, Pessoa dono) {
        this.cor = cor;
        this.modelo = modelo;
        //this.velocidadeAtual = velocidadeAtual;
        this.getVelocidadeMaxima = getVelocidadeMaxima;
       // this.statusLigado = statusLigado;
        this.motor = motor;
        this.dono = dono;
    }

    public void detalhes(){
        System.out.println("Cor:" + this.cor);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Dono "+ this.dono);
        System.out.println("O carro esta ligado? "+this.statusLigado);
        System.out.println("A velocidade atual é de "+velocidadeAtual);
        System.out.println("");
    }


    public void liga() {
        if(!statusLigado){
            this.statusLigado = true;
            System.out.println("Carro ligado");
        } else{
            System.out.println("Carro já esta ligado");
        }
    }

    public void desliga(){
        if(statusLigado){
            this.statusLigado = false;
            velocidadeAtual = 0;
            System.out.println("Carro desligado");
        } else{
            System.out.println("Carro já esta desligado");
        }
    }

    public void acelera(int valor){
        if(this.statusLigado){
            if(velocidadeAtual + valor <= getVelocidadeMaxima){
                this.velocidadeAtual += valor;
                System.out.println("Acelerrando, a velocidade atal é de: "+velocidadeAtual);
            }else{
                System.out.println("Velocidade máxima atingida");
            }
        }else{
            System.out.println("O carro esta´desligado. ligue para acelerar");
        }
    }

    public void freia(int valorFrear){
        if(this.statusLigado){
            if((this.velocidadeAtual - valorFrear) >= 0){
                this.velocidadeAtual -= valorFrear;
                System.out.println("freando");
            }else{
                velocidadeAtual = 0;
                System.out.println("carro parado");
            }
        }else{
            System.out.println("o carro está desligado");
        }
    }


}
