package anonimas;

public class ClaseOperaciones {
    private int suma, resta;

    public void realizarSuma(int a, int b, Operaciones operaciones) {
        this.suma = operaciones.suma(a, b);
    }

    public void realizarResta(int a, int b, Operaciones operaciones) {
        this.resta = operaciones.resta(a, b);
    }

    public void realizarTodo(int a, int b, Operaciones operaciones) {
        this.suma = operaciones.suma(a, b);
        this.resta = operaciones.resta(a, b);
    }

    public int getSuma() {
        return suma;
    }

    public int getResta() {
        return resta;
    }
}
