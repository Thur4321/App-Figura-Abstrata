
package classes;

public class Retangulo extends Figura{
    
    private double base, altura;

    public Retangulo() {
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base*altura;
    }

    @Override
    public double calculaPerimetro() {
        return (base*2)+(altura*2);
    }
    
    @Override
    public String dados(){
        return super.dados() + "Retângulo:" +
                "\nBase: " + base +
                "\nAltura: " + altura +
                "\nÁrea: " + formato.format(calculaArea()) +
                "\nPerímetro: " + formato.format(calculaPerimetro());
    }
    
}
