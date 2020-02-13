package cajero;

import java.util.ArrayList;

public class Persona {
    private String nombre, apellido, dni;

    ArrayList<Cuenta> listaCuentas;

    public Persona(String nombre, String apellido, String dni, Cuenta cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.listaCuentas = new ArrayList();
        this.listaCuentas.add(cuenta);
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.listaCuentas=new ArrayList();
    }

    public void agregarCuenta(Cuenta nuevaCuenta){
        this.listaCuentas.add(nuevaCuenta);
    }

    public void listarCuentas(){
        if(listaCuentas.isEmpty()){
            System.out.println("No tienes cuentas");
        }else{
            double saldoTotal = 0.0;
            System.out.println("El saldo de cada una de tus cuentas es: ");
            for (Cuenta cuenta : this.listaCuentas) {
               // cuenta.mostrarEstado();
                //saldoTotal += cuenta.getSaldo();
            }
            System.out.printf("El saldo total de tus cuentas es: %.2f %n", saldoTotal);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
}
