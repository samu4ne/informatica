public class Rettangolo {
    private float base,altezza;

    public Rettangolo(float base,float altezza){
        this.base=base;
        this.altezza=altezza;
    }

    public void setBase(float base){
        this.base=base;
    }

    public float getBase(){
        return this.base;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public float getAltezza() {
        return altezza;
    }

    public float getArea(){
       return this.base*this.altezza;
    }

    public float getPerimetro(){
        return (this.base+this.altezza)*2;
    }

    public boolean getQuadrato(){
        if(this.base==this.altezza) {
            return true;
        }
        return false;

    }

}
