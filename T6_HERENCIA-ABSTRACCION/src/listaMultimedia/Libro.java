package listaMultimedia;

public final class Libro extends Elemento {

    private int nPag, isbn;

    public Libro(int idenificador, String titulo, String autor, String formato, double tamaño, int isbn, int nPag) {
        super(idenificador, titulo, autor, formato, tamaño);
        this.isbn = isbn;
        this.nPag = nPag;
    }

    public int getnPag() {
        return nPag;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setnPag(int nPag) {
        this.nPag = nPag;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+String.format(" %d, %d %n",isbn,nPag);
    }
}
