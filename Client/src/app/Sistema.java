package app;

import datos.Rectangulo;
import datos.Triangulo;

public class Sistema {
   
   
    private Triangulo tri = new Triangulo();
    private Rectangulo rec = new Rectangulo();
    
    public Sistema() {
        super();
    }
    public void miMain(){
        
        rec.setAltura(4.0f);
        rec.setBase(5.0f);
        rec.calcular();
        
        System.out.println("�rea rect�ngulo: " + rec.getResultado());
        
        tri.setAltura(4.0f);
        tri.setBase(2.0f);
        tri.calcular();
        
        System.out.println("�rea tri�ngulo: " + tri.getResultado());
        
        
    }
   
}
