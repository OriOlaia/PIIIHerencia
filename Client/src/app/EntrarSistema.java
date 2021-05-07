package app;

public class EntrarSistema {

    private static Sistema sistema = new Sistema();

    public EntrarSistema() {
        super();
    }

    public static void main(String[] args) {
        
        EntrarSistema entrarSistema = new EntrarSistema();
        
        sistema.miMain();
        
    }
}
