/*La classe rettangolo deve permettere di calcolare Area e Perimetro e di dire se è un
quadrato. Possiede due costruttori uno senza parametri e uno con base e altezza passati come argomenti.*/

public class Rettangolo {
    private float base, altezza;

    public Rettangolo(float base, float altezza){
        this.base=base;
        this.altezza=altezza;
    }

    public float area(){
        return this.base*this.altezza;
    }

    public float perimetro(){
        return (this.base*2)+(this.altezza*2);
    }

    public boolean quadrato(){
        if(this.base==this.altezza){
            return true;
        }
        return false;
    }

}
