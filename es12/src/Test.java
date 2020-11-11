/*
Date le classi Cerchio e Rettangolo degli esercizi precedenti costruire un main
in cui dati un cerchio di raggio r e
un rettangolo b x h dire se sono equivalenti (hanno la stessa area)
 */



public class Test {
    public static void main(String[] args) {

        Rettangolo ret= new Rettangolo(0f,0f);
        Cerchio cer= new Cerchio(0f);

        if(ret.getArea()==cer.getArea()){
            System.out.println("sono equivalenti");
        }else{
            System.out.println("Non sono equivalenti");
        }
    }
}
