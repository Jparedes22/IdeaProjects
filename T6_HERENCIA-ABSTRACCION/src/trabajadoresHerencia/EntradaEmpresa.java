package TrabajadoresHerencia;

import ListaMultimedia.Audio;

public class Entrada {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Jefe jefe = new Jefe("NJefe", "AJefe", "asd", 50, 100);
        Asalariado asalariado = new Asalariado("NAsalariado", "AAsalariado", "werty", 2000,
                14);
        Autonomo autonomo = new Autonomo("NAutonomo", "AAutonomo", "xcv", 20000);

        System.out.println(jefe.mostrarDatos());
        System.out.println(asalariado.mostrarDatos());
        System.out.println(autonomo.mostrarDatos());

        empresa.agregarTrabajador(autonomo);
        empresa.agregarTrabajador(asalariado);
        empresa.agregarTrabajador(jefe);

        System.out.println(empresa.getEmpresaElementos().size());
    }
}
