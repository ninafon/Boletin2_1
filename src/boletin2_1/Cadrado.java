
package boletin2_1;


public class Cadrado {
    
    private float lado ;

    public Cadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cadrado{" + "lado=" + lado + '}';
    }
    
    
}
