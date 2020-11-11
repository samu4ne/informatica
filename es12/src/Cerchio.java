public class Cerchio {
    private float raggio;

    public Cerchio(float raggio){
        this.raggio=raggio;
    }
    public Cerchio(){
        this.raggio=0;
    }

    public void setRaggio(float raggio) {
        this.raggio = raggio;
    }

    public float getRaggio(){
        return this.raggio;
    }

    public float getArea(){
        return (float)(Math.PI * Math.pow(this.raggio, 2));
    }

    public float getPerimetro(){
        return (float)(Math.PI*(this.raggio*2));
    }
}
