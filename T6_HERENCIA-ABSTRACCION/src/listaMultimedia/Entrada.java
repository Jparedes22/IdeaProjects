package listaMultimedia;


public class Entrada {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();

        Elemento libro = new Libro(2, "MiLibro", "AutorLibro", "digital",
                200, 1234, 120);
        Elemento video = new Video(3, "MiLibro", "AutorLibro", "digital",
                200, "Director", "Actores");
        Elemento audio = new Audio(4, "MiLibro", "AutorLibro", "digital",
                200, 4, "mp3");


        coleccion.agregarElemento(libro);
        coleccion.agregarElemento(video);
        coleccion.agregarElemento(audio);
        coleccion.listarElementos("todos");

    }

}
