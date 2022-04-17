package Huevito;

public class ComprarGato {
    public static void main(String[] args){
        compra();
    }

    public static void compra(){
        Gato nuevoGato = new Gato();
        nuevoGato.setNombre(" Camila");
        nuevoGato.setColor("Capuchino claro ");
        nuevoGato.setRaza("siames");
        nuevoGato.setEdad(2);
        nuevoGato.setPeso(3);
        String datos =" Hola soy la mascota de Nancy \n";
        datos += "Mi nombre es :" + nuevoGato.getNombre();
        datos+= "\nMi raza es : " + nuevoGato.getRaza();
        datos+= "\nSoy de color : " + nuevoGato.getColor();
        datos+= "\nTengo :" + nuevoGato.getEdad()+" años";
        datos+= "\nMi peso es :"+ nuevoGato.getPeso()+ " kg";

        System.out.print(datos);


    }
}
