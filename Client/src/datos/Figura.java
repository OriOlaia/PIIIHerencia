package datos;

public class Figura { //clase superclase o padre
    
    private Float altura = new Float (0.0f);
    private Float base = new Float (0.0f);
    private Float resultado = new Float (0.0f);
    
    public Figura() {
        super();
        
    }

    public void setAltura(Float pAltura) {
        altura = pAltura;
    }

    public Float getAltura() {
        return altura;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getBase() {
        return base;
    }

    public Float getResultado() {
        return resultado;
    }

    public void setResultado(Float resultado) {
        this.resultado = resultado;
    }
}
