package datos;

public class Triangulo extends Figura{
    
    public Triangulo(){
        
        super();
        
        
    }
    
    public Float calcular(){
        Float r = (getAltura() * getBase() / 2); 
        this.setResultado(r);
        return r;
    }
    
    
}

  