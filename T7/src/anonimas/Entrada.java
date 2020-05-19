package anonimas;

public class Entrada {
    public static void main(String[] args) {
        Garaje garaje=new Garaje();
        garaje.addCoche(new Coche("Ford","Focus",145));
        garaje.addCoche(new Coche("Ford","Mustang",500));
        garaje.removerCoche(new Coche("Ford","Focus",145));
    }

}
