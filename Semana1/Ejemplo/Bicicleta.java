package Semana1;

public class Bicicleta {
    public void Bicicleta (){

    }


    public int rodada,pins;
    public double velocidad;
    public String color;

    public int getRodada(){ return rodada; }
    public  int getPins(){ return pins;}
    public double getVelocidad(){return velocidad; }
    public  String getColor(){ return color;}


    public boolean setRodada(int rodada){
        if(rodada > 0){
            this.rodada = rodada;
            return true;
        }else
            return false;
    }

    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        }else
            return false;
    }

    public boolean setPins(int pins){
        if(pins > 0 ){
            this.pins = pins;
            return true;
        }else
            return false;
    }

    public  boolean setVelocidad(double velocidad){
        if(velocidad >= 0){
            this.velocidad = velocidad;
            return true;
        }else
            return  false;
    }

    public String printState () {
        return "rodada : " + rodada + "\n" +
                "pins : " + pins + "\n" +
                "velocidad : " + velocidad + "\n" +
                "color : "+color;

    }
}
