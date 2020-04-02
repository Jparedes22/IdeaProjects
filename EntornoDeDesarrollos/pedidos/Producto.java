package pedidos;

public class Producto {

    private String nombre, localizacion, codigo;
    private double precio;

   public Producto(){

   }

    public Producto(String nombre, String localizacion, double precio, String codigo) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDatos() {
        String mensaje = "Producto: %s   ||  Localización: %s  ||  Precio: %.2f  ||  Código: %s";
        return String.format(mensaje, nombre, localizacion, precio, codigo);
    }
}
