package anonimas;

public class EntradaInterfaz {
    public static void main(String[] args) {
        ClaseOperaciones claseOperaciones = new ClaseOperaciones();

      /*  claseOperaciones.realizarSuma(10, 20, new Operaciones() {
            @Override
            public int suma(int a, int b) {
                return a + b;
            }

            @Override
            public int resta(int a, int b) {
                return a - b;
            }
        });

        claseOperaciones.realizarResta(10, 20, new Operaciones() {
            @Override
            public int suma(int a, int b) {
                return a + b;
            }

            @Override
            public int resta(int a, int b) {
                return a - b;
            }
        });*/

      claseOperaciones.realizarTodo(10, 20, new Operaciones() {
          @Override
          public int suma(int a, int b) {
              return a+b;
          }

          @Override
          public int resta(int a, int b) {
              return a-b;
          }
      });

        System.out.println("La suma es: " + claseOperaciones.getSuma());
        System.out.println("La resta es: " + claseOperaciones.getResta());
    }
}
