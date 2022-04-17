package Huevito;
/*clase gato*/
public class Gato {
    public  Gato(){

    }

    public int edad;
    public String raza, color , nombre;
    public float peso;

    public int getEdad (){ return edad;}
    public float getPeso(){return peso;}
    public String getRaza(){return raza;}
    public String getColor(){return color;}
    public String getNombre(){return nombre;}

    public boolean setEdad(int edad ){
        if(edad > 0){
            this.edad = edad;
            return true;
        }else
            return false;
    }

    public boolean setPeso(float peso){
        if(peso > 0){
            this.peso = peso;
            return true;
        }else
            return false;
    }

    public boolean setRaza(String raza){
        if(!raza.isEmpty()){
            this.raza = raza;
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

    public boolean setNombre( String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }
    public String printState () {
        return "EDAD : " + edad + "\n" +
                "PESO : " + peso + "\n" +
                "RAZA : " + raza + "\n" +
                "NOMBRE : "+nombre+ "\n"+
                "COLOR : "+color;

    }


}
