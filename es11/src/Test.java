public class Test {
    public static void main(String[] args){
        Rettangolo ret;

        ret=new Rettangolo(4f, 4f);
        System.out.println("area: " + ret.area() + "perimetro: " + ret.perimetro() + ret.quadrato());
    }
}
