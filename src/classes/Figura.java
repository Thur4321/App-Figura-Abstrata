
package classes;

import java.text.DecimalFormat;

public abstract class Figura {
    
    protected DecimalFormat formato = new DecimalFormat("0.00");
    
    public abstract double calculaArea();
    
    public abstract double calculaPerimetro();
    
    public String dados(){
        return "Dados da Figura\n";
    }
}
