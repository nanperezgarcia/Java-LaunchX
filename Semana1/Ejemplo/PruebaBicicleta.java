package Semana1;

public class PruebaBicicleta {
    public static void main(String[] args){
        def();
    }

    public static void  def(){
        Bicicleta BiciMountain = new Bicicleta();
        BiciMountain.setColor("NEGRA");
        BiciMountain.setPins(6);
        BiciMountain.setRodada(36);
        BiciMountain.setVelocidad(23.5);
        String msg="soy una bicicleta de montaña : ";
        msg += "\ncolor : "+BiciMountain.getColor();
        msg += "\npins : "+BiciMountain.getPins();
        msg += "\nvelocidad :"+BiciMountain.getVelocidad();
        msg += "\nrodada:  " +BiciMountain.getRodada();


        System.out.print(msg);
    }

}
