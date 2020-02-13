package cajero;

public class Cuenta {


    private int pin, id;
    private double saldo;


    /*public int getId() {
        return id;
    }

    public int getPin() {
        return pin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setPin(int pin) {
        this.pin = pin;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void ingresar(double saldoIng) {
        if (saldoIng > 0) {
            this.saldo += saldoIng;
        } else {
            System.out.println("No puedes hacer esa operación");
        }

    }

    public void sacar(double saldoSac) {
        if (saldoSac < 0 || (this.saldo - saldoSac) < 0) {
            System.out.println("No puedes hacer la operacion");
        } else {
            this.saldo -= saldoSac;
        }

    }

    public void mostrarEstado() {
 double saldoTotal=0.0;
        System.out.printf("El saldo de la cuenta es: %.2f %n", this.saldo);
    }
*/

    public Cuenta(int id, int pin, double saldo) {
        this.id = id;
        this.saldo = saldo;
        this.pin = pin;
    }
/*
    public Cuenta(int id, int pin) {
        this.id = id;
        this.pin = pin;
    }

*/
}
