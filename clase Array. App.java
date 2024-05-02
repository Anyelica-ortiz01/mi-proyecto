import java.util.Scanner;

public class App {

    // Variable estatica para almacenar el tamanio del arreglo
    public static int tamv = 0;
    
    // Objeto Scanner para leer la entrada del usuario
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Bandera para controlar la salida del bucle
        boolean condicionsalida = true; 

        do {
            try {
                // Solicitar al usuario el tamanio del arreglo
                System.out.println("Ingrese el tamanio del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();
                
                // Verificar si el tamanio esta dentro de los limites especificados
                condicionsalida = !(tamv >= 2 && tamv <= 16);
            } catch (Exception e) {
                // Manejar excepciones durante la entrada de datos
                System.out.println("Ocurrio un error: " + e);
                System.out.println("Por favor, ingrese un valor valido.");
                leer.nextLine(); // Limpiar el buffer del Scanner
            }
        } while (condicionsalida); // Repetir hasta que se ingrese un valor valido

        // Llenar el arreglo con valores ingresados por el usuario
        int[] array = llenado();

        // Mostrar el arreglo original
        System.out.println("Arreglo original:");
        Mostrar(array);

        // Llamar al metodo inversa y mostrar el arreglo invertido
        System.out.println("Arreglo invertido:");
        Mostrar(inversa(array));
    }

    // Metodo para llenar el arreglo con valores ingresados por el usuario
    public static int[] llenado() {
        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el valor [" + i + "]");
            arreglo[i] = leer.nextInt();
        }

        return arreglo;
    }

    // Metodo para mostrar los elementos de un arreglo
    public static void Mostrar(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    // Metodo para invertir los elementos de un arreglo
    public static int[] inversa(int[] a) {
        int[] invertido = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            invertido[i] = a[a.length - 1 - i]; // Invertir el orden de los elementos
        }

        return invertido;
    }
}
