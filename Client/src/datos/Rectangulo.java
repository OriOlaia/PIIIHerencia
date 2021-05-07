package datos;

public class Rectangulo extends Figura {
    public Rectangulo() {
        
        super();
        
    }
    
    public Float calcular(){
        
        Float r =(this.getAltura() * this.getBase()); 
        this.setResultado(r);
        return r;
    
    }
}
