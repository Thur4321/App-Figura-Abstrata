
package classes;

public class Circulo extends Figura{
    
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI*Math.pow(raio, 2); 
    }

    @Override
    public double calculaPerimetro() {
        return 1*Math.PI*raio*2;
    }
    
    @Override
    public String dados(){
        return super.dados() + "Círulo:"+
                "\nÁrea: "+ formato.format(calculaArea())+
                "\nPerímetro: " + formato.format(calculaPerimetro());
    }
    
    
}
